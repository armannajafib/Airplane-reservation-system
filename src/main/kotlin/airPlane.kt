open class airplane  constructor(override var seatList: List<seat>):airplaneInterface{


    override fun bookSeat(seatId: String, customer: customer): String {
        var result :String= "error"

        if (customer.seatBook){
            result = "you have already reserved a seat"
        }
        for (item in seatList){
            if (!item.isBooked && item.UniqueIdentifier == seatId){
                if(customer.balance >= item.type.price){
                    customer.withdrawal(item.type.price)
                    item.isBooked = true
                    customer.seatBook = true
                    result =  "You booked an ${item.type} seat with ID ${seatList.find{ it.UniqueIdentifier == seatId }} "

                }
                else {
                    result =  "your account balance is not enough"
                }

            }
//            else{
//                result =  "this seat reserved by someone"
//            }
//
//
        }
        return result
    }

}


