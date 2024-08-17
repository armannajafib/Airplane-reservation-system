interface flyInterface {
    fun bookAseat(customer: customer,seatId:String,airplane: airplaneInterface):String
    fun addReservation(customer: customer,seatId: String)
    fun removeReservation(customer: customer,seatId: String)
    fun getReservation()
    fun showUnBookedSeat(airplane: airplaneInterface):List<seat>
    fun cancling(airplane: airplaneInterface)
    fun delayed(airplane: airplaneInterface,time:String)
    val _identifier: String
    val _Airplane: airplaneInterface
    var _time:String
    var _Status:flyStatus
}