package bridge.model

import bridge.utils.Constants.BRIDGE_POSTFIX
import bridge.utils.Constants.BRIDGE_PREFIX
import bridge.utils.Constants.BRIDGE_SEPARATOR
import bridge.utils.Constants.DOWN
import bridge.utils.Constants.EMPTY
import bridge.utils.Constants.WRONG
import bridge.utils.Constants.CORRECT
import bridge.utils.Constants.FAIL
import bridge.utils.Constants.SUCCESS
import bridge.utils.Constants.UP

class BridgeGame {
    private val bridgeMaker = BridgeMaker(BridgeRandomNumberGenerator())
    private var bridge = listOf<String>()
    private val bridgeAbove = mutableListOf<String>()
    private val bridgeBelow = mutableListOf<String>()
    private var gameStatus = FAIL
    private var numberOfAttempts = 1

    fun makeBridge(size: Int) {
        bridge = bridgeMaker.makeBridge(size)
    }

    fun move(round: Int, moving: String): Boolean {
        val isCorrect = bridge[round] == moving
        when (moving) {
            UP -> {
                if (isCorrect) moveUpSuccess()
                if (!isCorrect) moveUpFail()
            }

            DOWN -> {
                if (isCorrect) moveDownSuccess()
                if (!isCorrect) moveDownFail()
            }
        }
        if(round == bridge.size -1 && isCorrect) gameStatus = SUCCESS
        return isCorrect
    }

    private fun moveUpSuccess() {
        bridgeAbove.add(CORRECT)
        bridgeBelow.add(EMPTY)
    }

    private fun moveUpFail() {
        bridgeAbove.add(WRONG)
        bridgeBelow.add(EMPTY)
    }

    private fun moveDownSuccess() {
        bridgeAbove.add(EMPTY)
        bridgeBelow.add(CORRECT)
    }

    private fun moveDownFail() {
        bridgeAbove.add(EMPTY)
        bridgeBelow.add(WRONG)
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     *
     *
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    fun retry() {
        numberOfAttempts += 1
        bridgeAbove.clear()
        bridgeBelow.clear()
    }

    fun getBridgeSize() = bridge.size
    fun getGameStatus() = gameStatus
    fun getNumberOfAttempts() = numberOfAttempts
    fun getBridgeAbove() = bridgeAbove.joinToString(BRIDGE_SEPARATOR, BRIDGE_PREFIX, BRIDGE_POSTFIX)
    fun getBridgeBelow() = bridgeBelow.joinToString(BRIDGE_SEPARATOR, BRIDGE_PREFIX, BRIDGE_POSTFIX)
}
