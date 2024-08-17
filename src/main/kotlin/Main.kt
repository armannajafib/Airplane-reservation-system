fun main() {
    val seatList = listOf<seat>(
        seat(seatType.Economy,"a1"),
        seat(seatType.FirstClass,"a2"),
        seat(seatType.PremiumEconomy,"a3")
    )
    val seatList2 = listOf<seat>(
        seat(seatType.Economy,"b1"),
        seat(seatType.FirstClass,"b2"),
        seat(seatType.PremiumEconomy,"b3")
    )
    var airplane =AirBusB.getInstance(seatList)
//    println(airplane.seatList)
//        println("-----------------------------------------------------------------------------------")
//
//    var airplane2 = AirBusB.getInstance(seatList)
//    println(airplane2.seatList)

//-------------------------------------------------------------------------------------------------

    var customerImp  = customerImp()
    var customer = customer(customerImp)
    customer.Accountrecharge(5000.0)


    var flight=flight("a1",airplane,"12/2/14",flyStatus.SCHEDULED)
    var result= flight.bookAseat(customer,"a3",airplane)


    println(customer.balance)
    println(flight.Status)
    println(flight.time)
    flight.delayed(airplane,"12/5/1403")
    println(flight.Status)
    println(flight.time)
    println(customer.balance)

//println(result)
//println(flight.showUnBookedSeat(airplane))
    //--------------------------------------------------------------------------]




}