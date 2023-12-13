package bridge.utils

import bridge.utils.Constants.DOWN
import bridge.utils.Constants.MAX_BRIDGE_SIZE
import bridge.utils.Constants.MIN_BRIDGE_SIZE
import bridge.utils.Constants.UP

object Validator {
    fun validateBridgeSize(bridgeSize: String): Int {
        val validBridgeSize = bridgeSize.toIntOrNull() ?: 0
        require(validBridgeSize in MIN_BRIDGE_SIZE..MAX_BRIDGE_SIZE) { Exception.INVALID_BRIDGE_SIZE.getMessage() }
        return validBridgeSize
    }

    fun validateMoving(moving: String): String {
        require(moving == UP || moving == DOWN) { Exception.INVALID_MOVING.getMessage() }
        return moving
    }
}