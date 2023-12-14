package bridge.controller

import bridge.model.BridgeGame
import bridge.utils.Constants.FAIL
import bridge.utils.Constants.QUIT
import bridge.utils.Constants.RETRY
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
        val bridgeSize = inputView.readBridgeSize()
        bridgeGame.makeBridge(bridgeSize)
    }

    private fun startGame() {
        for (round in 0 until bridgeGame.getBridgeSize()) {
            val moving = inputView.readMoving()
            val isAnswer = bridgeGame.move(round, moving)
            outputView.printMap(bridgeGame.getBridgeAbove(), bridgeGame.getBridgeBelow())
            if (!isAnswer) break
        }
        reStartGameOrGameEnd()
    }

    private fun reStartGameOrGameEnd() {
        if (bridgeGame.getGameStatus() == FAIL) {
            val gameCommand = inputView.readGameCommand()
            if (gameCommand == RETRY) {
                bridgeGame.retry()
                startGame()
            }
        }
    }

    private fun endGame() {
        outputView.printResult(bridgeGame)
    }
}