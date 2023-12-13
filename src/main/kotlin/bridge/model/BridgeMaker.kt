package bridge.model

import bridge.utils.Constants.DOWN
import bridge.utils.Constants.UPPER_INCLUSIVE
import bridge.utils.Constants.UP

/**
 * 다리의 길이를 입력 받아서 다리를 생성해주는 역할을 한다.
 */
class BridgeMaker(private val bridgeNumberGenerator: BridgeNumberGenerator) {
    /**
     * @param size 다리의 길이
     * @return 입력받은 길이에 해당하는 다리 모양. 위 칸이면 "U", 아래 칸이면 "D"로 표현해야 한다.
     */
    fun makeBridge(size: Int): List<String> {
        return List(size) { UP.takeIf { bridgeNumberGenerator.generate() == UPPER_INCLUSIVE } ?: DOWN }
    }
}
