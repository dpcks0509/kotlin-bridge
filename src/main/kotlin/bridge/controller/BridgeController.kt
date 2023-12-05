package bridge.controller

import bridge.model.BridgeGame
import bridge.view.InputView
import bridge.view.OutputView

class BridgeController {
    private val inputView = InputView()
    private val outputView = OutputView()
    private val bridgeGame = BridgeGame()

    fun run() {
        setUpGame()
        startGame()
        endGame()
    }

    private fun setUpGame() {
        outputView.printGameStart()
        bridgeGame.setBridge(inputView.readBridgeSize())
    }

    private fun startGame() {
        var isGameOn = true
        while (isGameOn) {
            isGameOn = playGame()
            if (isGameOn) break
            isGameOn = retryGame()
        }
    }

    private fun playGame(): Boolean {
        for (round in 0 until bridgeGame.getBridgeSize()) {
            val moving = inputView.readMoving()
            val correctMove = bridgeGame.move(round, moving)
            outputView.printMap(bridgeGame.getBridgeAbove(), bridgeGame.getBridgeBelow())
            if (!correctMove) return false
        }
        return true
    }

    private fun retryGame(): Boolean {
        if (inputView.readGameCommand() == "R") {
            bridgeGame.retry()
            return true
        }
        return false
    }

    private fun endGame() {
        outputView.printResult(bridgeGame)
    }
}