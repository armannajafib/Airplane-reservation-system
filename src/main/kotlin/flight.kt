import java.util.UUID

enum class flyStatus{
    SCHEDULED,
    CANCELLED,
    DELAYED
}


class flight(
    override val _identifier: String = UUID.randomUUID().toString(),
    override val _Airplane: airplaneInterface,
    override var _time:String,
    override var _Status:flyStatus=flyStatus.SCHEDULED
):flyInterface{
    private var reservations= mutableMapOf<String,customer>()
        get() = field

    override fun addReservation(customer: customer, seatId: String) {
        reservations[seatId]=customer
    }
    override fun removeReservation(customer: customer,seatId: String) {
        reservations.remove(seatId)
    }

    override fun getReservation() {
        println(reservations)
    }

    val identifier:String
        get() = _identifier

    val Airplane:airplaneInterface
        get() = _Airplane


    var Status:flyStatus
        get() = _Status
        set(value) {
            _Status = value
        }

    var time:String
        get() = _time
        set(value) {
            _time = value

        }

    override fun bookAseat(customer: customer,seatId:String,airplane: airplaneInterface) :String {
        var result:String
        result = airplane.bookSeat(seatId, customer)
        addReservation(customer, seatId)
        return result
    }

    override fun showUnBookedSeat(airplane: airplaneInterface): List<seat> {
        var UnbookSeatList: MutableList<seat> = mutableListOf()
        for (item in airplane.seatList){
            if (!item.isBooked){
                UnbookSeatList.add(item)
            }
        }
        return UnbookSeatList
    }

    override fun cancling(airplane: airplaneInterface) {
        this.Status = flyStatus.CANCELLED

        for (item in reservations){
            for (i in airplane.seatList){
                if (i.isBooked){
                    var cancelledAmount:Double = (i.type.price)
                    item.value.Accountrecharge(cancelledAmount)
                }
            }
        }
    }

    override fun delayed(airplane: airplaneInterface,time:String) {


        this.Status = flyStatus.DELAYED
        this.time = time
        for (item in reservations){
            for (i in airplane.seatList){
                if (i.isBooked){
                    var delayAmount:Double = (i.type.price) * 0.2
                    item.value.Accountrecharge(delayAmount)
                }
            }
        }

    }

}
//        airplane.seatList.forEach { it.isBooked = false }