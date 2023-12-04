package bridge.controller

import bridge.model.BridgeGame
import bridge.util.BridgeMaker
import bridge.util.BridgeRandomNumberGenerator
import bridge.view.InputView
import bridge.view.OutputView

class BridgeController() {
    private val inputView = InputView()
    private val outputView = OutputView()

    private val bridgeGame = BridgeGame()
    private val bridgeRandomNumberGenerator = BridgeRandomNumberGenerator()
    private val bridgeMaker = BridgeMaker(bridgeRandomNumberGenerator)

    fun run() {
        outputView.printGameStart()
        val bridgeSize = inputView.readBridgeSize()
        bridgeGame.setBridge(bridgeMaker.makeBridge(bridgeSize))
    }
}