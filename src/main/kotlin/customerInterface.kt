import kotlin.random.Random

interface customerInterface {
    val identifier:String
    var balance:Double
    var seatBook:Boolean
    fun Accountrecharge(amount:Double = 0.0):Boolean
    fun withdrawal(amount: Double = 0.0):Boolean
}