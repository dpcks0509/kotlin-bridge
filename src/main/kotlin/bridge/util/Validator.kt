package bridge.util

import bridge.util.Constants.DOWN
import bridge.util.Constants.MAX_BRIDGE_SIZE
import bridge.util.Constants.MIN_BRIDGE_SIZE
import bridge.util.Constants.QUIT
import bridge.util.Constants.RETRY
import bridge.util.Constants.UP

object Validator {
    fun validateBridgeSize(bridgeSize: String): Int {
        require(bridgeSize.toIntOrNull() in MIN_BRIDGE_SIZE..MAX_BRIDGE_SIZE) { Exception.INVALID_BRIDGE_SIZE.getMessage() }
        return bridgeSize.toInt()
    }

    fun validateMoving(moving: String): String {
        require(moving == UP || moving == DOWN) { Exception.INVALID_MOVING.getMessage() }
        return moving
    }

    fun validateGameCommand(gameCommand: String): String {
        require(gameCommand == RETRY || gameCommand == QUIT) { Exception.INVALID_GAME_COMMAND.getMessage() }
        return gameCommand
    }
}