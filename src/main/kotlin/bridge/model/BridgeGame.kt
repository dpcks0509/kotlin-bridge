package bridge.model

import bridge.util.BridgeMaker
import bridge.util.BridgeRandomNumberGenerator

class BridgeGame {
    private val bridgeRandomNumberGenerator = BridgeRandomNumberGenerator()
    private val bridgeMaker = BridgeMaker(bridgeRandomNumberGenerator)

    private var bridge: List<String> = listOf()

    fun move() {}

    fun retry() {}

    fun setBridge(bridgeSize: Int) {
        bridge = bridgeMaker.makeBridge(bridgeSize)
    }

    fun getBridge() = bridge
}
