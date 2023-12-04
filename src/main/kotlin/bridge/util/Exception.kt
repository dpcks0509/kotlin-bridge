package bridge.util

enum class Exception(private val message: String) {
    INVALID_BRIDGE_SIZE("3 이상 20 이하의 숫자를 입력할 수 있다.");

    fun getMessage() = "[ERROR] $message"
}