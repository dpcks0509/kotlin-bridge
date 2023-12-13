package bridge.utils

enum class Exception(private val message: String) {
    INVALID_BRIDGE_SIZE("다리 길이는 3부터 20 사이의 숫자여야 합니다.");

    fun getMessage() = "[ERROR] $message"
}