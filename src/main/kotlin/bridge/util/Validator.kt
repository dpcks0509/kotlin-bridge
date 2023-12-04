package bridge.util

import bridge.util.Constants.MAX_BRIDGE_SIZE
import bridge.util.Constants.MIN_BRIDGE_SIZE

object Validator {
    fun validateBridgeSize(bridgeSize: String): Int {
        require(bridgeSize.toIntOrNull() in MIN_BRIDGE_SIZE..MAX_BRIDGE_SIZE) { Exception.INVALID_BRIDGE_SIZE.getMessage() }
        return bridgeSize.toInt()
    }

    fun validateMoving(moving: String): String {
        require(moving == "U" || moving == "D") { Exception.INVALID_MOVING.getMessage() }
        return moving
    }
}