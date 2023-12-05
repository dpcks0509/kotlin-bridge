package bridge.view

import bridge.model.BridgeGame

class OutputView {
    fun printGameStart() {
        println("다리 건너기 게임을 시작합니다.")
        println()
    }

    fun printMap(bridgeAbove: String, bridgeBelow: String) {
        println(bridgeAbove)
        println(bridgeBelow)
        println()
    }

    fun printResult(bridgeGame: BridgeGame) {
        println("최종 게임 결과")
        println(bridgeGame.getBridgeAbove())
        println(bridgeGame.getBridgeBelow())
        println()
        println("게임 성공 여부: 성공")
        println("총 시도한 횟수: ${bridgeGame.getNumberOfAttempts()}")
    }
}
