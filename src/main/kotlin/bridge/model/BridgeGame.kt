package bridge.model

import bridge.util.BridgeMaker
import bridge.util.BridgeRandomNumberGenerator
import bridge.util.Constants.DOWN
import bridge.util.Constants.MOVE_EMPTY
import bridge.util.Constants.MOVE_FAIL
import bridge.util.Constants.MOVE_SUCCESS
import bridge.util.Constants.UP

class BridgeGame {
    private val bridgeRandomNumberGenerator = BridgeRandomNumberGenerator()
    private val bridgeMaker = BridgeMaker(bridgeRandomNumberGenerator)

    private var bridge: List<String> = listOf()
    private val bridgeAbove: MutableList<String> = mutableListOf()
    private val bridgeBelow: MutableList<String> = mutableListOf()

    private var numberOfAttempts = 1

    fun move(round: Int, moving: String): Boolean {
        when {
            moving == UP && bridge[round] == moving -> moveUpSuccess()
            moving == UP && bridge[round] != moving -> moveUpFail()
            moving == DOWN && bridge[round] == moving -> moveDownSuccess()
            moving == DOWN && bridge[round] != moving -> moveDownFail()
        }
        return bridge[round] == moving
    }

    private fun moveUpSuccess() {
        bridgeAbove.add(MOVE_SUCCESS)
        bridgeBelow.add(MOVE_EMPTY)
    }

    private fun moveUpFail() {
        bridgeAbove.add(MOVE_FAIL)
        bridgeBelow.add(MOVE_EMPTY)
    }

    private fun moveDownSuccess() {
        bridgeAbove.add(MOVE_EMPTY)
        bridgeBelow.add(MOVE_SUCCESS)
    }

    private fun moveDownFail() {
        bridgeAbove.add(MOVE_EMPTY)
        bridgeBelow.add(MOVE_FAIL)
    }

    fun retry() {
        numberOfAttempts += 1
        bridgeAbove.clear()
        bridgeBelow.clear()
    }

    fun setBridge(bridgeSize: Int) {
        bridge = bridgeMaker.makeBridge(bridgeSize)
    }

    fun getBridgeSize() = bridge.size
    fun getBridgeAbove() = bridgeAbove.joinToString(" | ", "[ ", " ]")
    fun getBridgeBelow() = bridgeBelow.joinToString(" | ", "[ ", " ]")
    fun getNumberOfAttempts() = numberOfAttempts
}
