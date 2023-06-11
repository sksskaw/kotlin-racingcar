enum class InputType(private val message: String) {
    CAR_COUNT("자동차 대수는 몇 대인가요?"),
    GAME_COUNT("시도할 횟수는 몇 회인가요?");

    fun display() = println(this.message)
}