class customer(private val customerInterface: customerInterface) {

     fun Accountrecharge(amount:Double) {
          customerInterface.Accountrecharge(amount)
     }
     fun withdrawal(amount: Double) {
         customerInterface.withdrawal(amount)
    }

    var seatBook: Boolean
        get() = customerInterface.seatBook
        set(value) {
            customerInterface.seatBook = value
        }
    val identifier:String = customerInterface.identifier
    val balance: Double
        get() = customerInterface.balance


}

