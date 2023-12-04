package bridge.controller

import bridge.model.BridgeGame
import bridge.view.InputView
import bridge.view.OutputView

class BridgeController() {
    private val inputView = InputView()
    private val outputView = OutputView()

    private val bridgeGame = BridgeGame()

    fun run() {
        outputView.printGameStart()
        val bridgeSize = inputView.readBridgeSize()
        bridgeGame.setBridge(bridgeSize)
        repeat(bridgeSize) {
            val moving = inputView.readMoving()
        }
    }
}