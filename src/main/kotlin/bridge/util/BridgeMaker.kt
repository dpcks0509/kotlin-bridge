package bridge.util

import bridge.util.Constants.DOWN
import bridge.util.Constants.UP

class BridgeMaker(private val bridgeNumberGenerator: BridgeNumberGenerator) {
    fun makeBridge(size: Int): List<String> {
        return List(size) { if (bridgeNumberGenerator.generate() == 1) UP else DOWN }
    }
}
