package bridge.view

import bridge.util.Validator.validateBridgeSize
import bridge.util.Validator.validateGameCommand
import bridge.util.Validator.validateMoving
import camp.nextstep.edu.missionutils.Console

class InputView {
    fun readBridgeSize(): Int {
        println("다리의 길이를 입력해주세요.")
        val bridgeSize = Console.readLine()
        println()
        return try {
            validateBridgeSize(bridgeSize)
        } catch (exception: IllegalArgumentException) {
            println(exception.message)
            readBridgeSize()
        }
    }

    fun readMoving(): String {
        println("이동할 칸을 선택해주세요. (위: U, 아래: D)")
        val moving = Console.readLine()
        return try {
            validateMoving(moving)
        } catch (exception: IllegalArgumentException) {
            println(exception.message)
            readMoving()
        }
    }

    fun readGameCommand(): String {
        println("게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)")
        val gameCommand = Console.readLine()
        return try {
            validateGameCommand(gameCommand)
        } catch (exception: IllegalArgumentException) {
            println(exception.message)
            readGameCommand()
        }
    }
}
