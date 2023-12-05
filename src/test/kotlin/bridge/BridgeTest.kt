package bridge

import bridge.util.Validator.validateBridgeSize
import bridge.util.Validator.validateGameCommand
import bridge.util.Validator.validateMoving
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class BridgeTest {
    @ParameterizedTest
    @ValueSource(strings = ["3", "12", "20"])
    fun `올바른 생성할 다리 길이 입력`(bridgeSize: String) {
        assertDoesNotThrow { validateBridgeSize(bridgeSize) }
    }

    @ParameterizedTest
    @ValueSource(strings = ["-1", "0", "2", "21", "3 ", " 20", " ", "", "three"])
    fun `생성할 다리 길이 입력 예외 처리 (3 이상 20 이하의 숫자가 아닌경우)`(bridgeSize: String) {
        assertThrows<IllegalArgumentException> { validateBridgeSize(bridgeSize) }
    }

    @ParameterizedTest
    @ValueSource(strings = ["U", "D"])
    fun `올바른 이동할 칸 입력`(moving: String) {
        assertDoesNotThrow { validateMoving(moving) }
    }

    @ParameterizedTest
    @ValueSource(strings = ["u", "d", "Up", "Down", "U ", " D", "1", "0", " ", ""])
    fun `이동할 칸 입력 예외 처리 (U(위 칸)와 D(아래 칸) 중 하나의 문자가 아닌 경우)`(moving: String) {
        assertThrows<IllegalArgumentException> { validateMoving(moving) }
    }

    @ParameterizedTest
    @ValueSource(strings = ["R", "Q"])
    fun `올바른 게임 재시작,종료 여부 입력`(gameCommand: String) {
        assertDoesNotThrow { validateGameCommand(gameCommand) }
    }

    @ParameterizedTest
    @ValueSource(strings = ["r", "q", "Retry", "Quit", "R ", " Q", "1", "0", " ", ""])
    fun `게임 재시작,종료 여부 입력 예외 처리 (R(재시작)과 Q(종료) 중 하나의 문자가 아닌 경우)`(gameCommand: String) {
        assertThrows<IllegalArgumentException> { validateGameCommand(gameCommand) }
    }
}