package bridge.utils

enum class Exception(private val message: String) {
    INVALID_BRIDGE_SIZE("다리 길이는 3부터 20 사이의 숫자여야 합니다."),
    INVALID_MOVING("U(위 칸)와 D(아래 칸) 중 하나의 문자를 입력할 수 있다.");

    fun getMessage() = "[ERROR] $message"
}