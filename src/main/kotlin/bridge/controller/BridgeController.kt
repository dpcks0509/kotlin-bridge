package bridge.controller

import bridge.view.InputView
import bridge.view.OutputView

class BridgeController(private val inputView: InputView, private val outputView: OutputView) {
    fun run() {
        outputView.printGameStart()
    }
}