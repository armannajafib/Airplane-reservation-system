import kotlin.random.Random
import kotlin.random.nextUInt

class customerImp:customerInterface {


    override val identifier:String =Random.nextUInt(0u,100u).toString()
    override var balance:Double = 0.0
    override var seatBook:Boolean= false
//        get() = field
//        set(value) {
//            field = value
//        }
    override fun Accountrecharge(amount:Double):Boolean {
        balance=balance+amount
        return true
    }
    override fun withdrawal(amount: Double) : Boolean{
        if (balance>=amount){
            balance=balance-amount
            return true
        }
        else{
            return false
        }
    }


}
