interface airplaneInterface {
     var seatList: List<seat>
     fun bookSeat(seatId: String, customer: customer): String
}