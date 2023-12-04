package bridge.controller

import bridge.model.BridgeGame
import bridge.view.InputView
import bridge.view.OutputView

class BridgeController {
    private val inputView = InputView()
    private val outputView = OutputView()

    private var bridgeSize = 0
    private val bridgeGame = BridgeGame()

    fun run() {
        setUpGame()
        startGame()
    }

    private fun setUpGame() {
        outputView.printGameStart()
        bridgeSize = inputView.readBridgeSize()
        bridgeGame.setBridge(bridgeSize)
    }

    private fun startGame() {
        for (round in 0 until bridgeSize) {
            val moving = inputView.readMoving()
            val correctMove = bridgeGame.move(round, moving)
            outputView.printMap(bridgeGame.getBridgeAbove(), bridgeGame.getBridgeBelow())
            if (!correctMove) return
        }
    }
}