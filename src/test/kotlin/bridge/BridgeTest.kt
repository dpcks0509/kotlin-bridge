package bridge

import bridge.util.Validator.validateBridgeSize
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class BridgeTest {
    @ParameterizedTest
    @ValueSource(strings = ["3", "12", "20"])
    fun `올바른 생성할 다리 길이 입력`(bridgeSize: String){
        assertDoesNotThrow { validateBridgeSize(bridgeSize) }
    }

    @ParameterizedTest
    @ValueSource(strings = ["-1", "0", "2", "21", "3 ", " 20", " ", "", "three"])
    fun `생성할 다리 길이 입력 예외 처리 (3 이상 20 이하의 숫자가 아닌경우)`(bridgeSize: String){
        assertThrows<IllegalArgumentException> { validateBridgeSize(bridgeSize) }
    }
}