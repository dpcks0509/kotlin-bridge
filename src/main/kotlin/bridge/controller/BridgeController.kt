package bridge.controller

import bridge.model.BridgeGame
import bridge.view.InputView
import bridge.view.OutputView

class BridgeController {
    private val inputView = InputView()
    private val outputView = OutputView()

    private val bridgeGame = BridgeGame()

    fun run() {
        outputView.printGameStart()
        val bridgeSize = inputView.readBridgeSize()
        bridgeGame.makeBridge(bridgeSize)
        for(round in 0 until bridgeSize) {
            val moving = inputView.readMoving()
            val isAnswer = bridgeGame.move(round, moving)
            outputView.printMap(bridgeGame.getBridgeAbove(), bridgeGame.getBridgeBelow())
            if(!isAnswer) break
        }
    }
}