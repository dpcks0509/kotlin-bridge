package bridge.view

import bridge.utils.Validator.validateBridgeSize
import bridge.utils.Validator.validateMoving
import camp.nextstep.edu.missionutils.Console

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
class InputView {
    fun readBridgeSize(): Int {
        println()
        println("다리의 길이를 입력해주세요.")
        return try {
            val bridgeSize = Console.readLine()
            validateBridgeSize(bridgeSize)
        } catch (exception: IllegalArgumentException) {
            println(exception.message)
            readBridgeSize()
        }
    }

    fun readMoving(): String {
        println()
        println("이동할 칸을 선택해주세요. (위: U, 아래: D)")
        return try {
            val moving = Console.readLine()
            validateMoving(moving)
        } catch (exception: IllegalArgumentException) {
            println(exception.message)
            readMoving()
        }
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    fun readGameCommand(): String {
        return ""
    }
}
