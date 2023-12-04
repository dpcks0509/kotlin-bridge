package bridge.util

import bridge.util.Constants.MAX_BRIDGE_SIZE
import bridge.util.Constants.MIN_BRIDGE_SIZE

object Validator {
    fun validateBridgeSize(bridgeSize: String): Int {
        val validBridgeSize = bridgeSize.toIntOrNull()
        require(validBridgeSize in MIN_BRIDGE_SIZE..MAX_BRIDGE_SIZE) { Exception.INVALID_BRIDGE_SIZE.getMessage() }
        return validBridgeSize!!
    }
}