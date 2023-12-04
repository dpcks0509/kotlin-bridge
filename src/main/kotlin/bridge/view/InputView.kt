package bridge.view

import bridge.util.Validator.validateBridgeSize
import camp.nextstep.edu.missionutils.Console

class InputView {
    fun readBridgeSize(): Int {
        println("다리의 길이를 입력해주세요.")
        val bridgeSize = Console.readLine()
        return validateBridgeSize(bridgeSize)
    }

    fun readMoving(): String {
        return ""
    }

    fun readGameCommand(): String {
        return ""
    }
}
