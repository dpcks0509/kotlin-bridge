package bridge

import bridge.controller.BridgeController
import bridge.view.InputView
import bridge.view.OutputView

fun main() {
    val bridgeController = BridgeController(InputView(), OutputView())
    bridgeController.run()
}
