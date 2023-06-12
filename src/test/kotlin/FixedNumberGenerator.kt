class FixedNumberGenerator(
    private val fixedNumber: Int
) : RandomNumber {
    override fun getRandomNumber(): Int {
        return fixedNumber
    }
}