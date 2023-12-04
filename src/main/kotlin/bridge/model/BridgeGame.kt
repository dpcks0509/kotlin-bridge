package bridge.model

class BridgeGame {
    private var bridge: List<String> = listOf()

    fun move() {}

    fun retry() {}

    fun setBridge(randomBridge: List<String>) {
        bridge = randomBridge
    }

    fun getBridge() = bridge
}
