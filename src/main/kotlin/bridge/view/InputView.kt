package bridge.view

import bridge.util.Validator.validateBridgeSize
import bridge.util.Validator.validateMoving
import camp.nextstep.edu.missionutils.Console

class InputView {
    fun readBridgeSize(): Int {
        println("다리의 길이를 입력해주세요.")
        val bridgeSize = Console.readLine()
        return validateBridgeSize(bridgeSize)
    }

    fun readMoving(): String {
        println("이동할 칸을 선택해주세요. (위: U, 아래: D)")
        val moving = Console.readLine()
        return validateMoving(moving)
    }

    fun readGameCommand(): String {
        return ""
    }
}
