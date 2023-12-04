package bridge.util

enum class Exception(private val message: String) {
    INVALID_BRIDGE_SIZE("3 이상 20 이하의 숫자를 입력해야 한다."),
    INVALID_MOVING("U(위 칸)와 D(아래 칸) 중 하나의 문자를 입력해야 한다.");

    fun getMessage() = "[ERROR] $message"
}