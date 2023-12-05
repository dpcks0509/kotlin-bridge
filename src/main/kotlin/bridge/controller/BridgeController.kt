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
        var gameStatus = true
        while (gameStatus) {
            gameStatus = onGame()
            if (!gameStatus && bridgeGame.getSuccessGame()) gameStatus = retryGame()
        }
    }

    private fun onGame(): Boolean {
        for (round in 0 until bridgeGame.getBridgeSize()) {
            val moving = inputView.readMoving()
            val correctMove = bridgeGame.move(round, moving)
            outputView.printMap(bridgeGame.getBridgeAbove(), bridgeGame.getBridgeBelow())
            if (!correctMove) break
        }
        bridgeGame.setSuccessGame()
        return false
    }

    private fun retryGame(): Boolean {
        if (inputView.readGameCommand() == "R") {
            bridgeGame.retry()
            return true
        }
        return false
    }

    private fun endGame() {

    }
}