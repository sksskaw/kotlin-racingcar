package racingCar2

interface NumberGenerator {
    fun getRandomNumber(): Int
}

class RandomNumberGenerator : NumberGenerator {
    override fun getRandomNumber(): Int {
        return (0..9).random()
    }
}