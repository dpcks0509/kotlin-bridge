package bridge.view

import bridge.model.BridgeGame
import bridge.utils.Constants.SUCCESS

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
class OutputView {
    fun printGameStart() {
        println("다리 건너기 게임을 시작합니다.")
    }

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     *
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    fun printMap(bridgeAbove: String, bridgeBelow: String) {
        println(bridgeAbove)
        println(bridgeBelow)
    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     *
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    fun printResult(bridgeGame: BridgeGame) {
        if(bridgeGame.getGameStatus() == SUCCESS) println()
        println("최종 게임 결과")
        printMap(bridgeGame.getBridgeAbove(), bridgeGame.getBridgeBelow())
        println()
        println("게임 성공 여부: ${bridgeGame.getGameStatus()}")
        println("총 시도한 횟수: ${bridgeGame.getNumberOfAttempts()}")
    }
}
