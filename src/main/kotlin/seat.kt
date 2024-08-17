import java.util.UUID

enum class seatType (val price:Double) {
    Economy(400.0),
    PremiumEconomy(700.0),
    Business(1300.0),
    FirstClass(2000.0);

}
data class seat(
    private val _type:seatType = seatType.Economy,
    private val _UniqueIdentifier: String= UUID.randomUUID().toString(),
    private var _isBooked:Boolean = false
){


    val type:seatType
        get()=_type

    var isBooked:Boolean
        get() = _isBooked
        set(value) {
            _isBooked =value
        }

    val UniqueIdentifier:String
        get() = _UniqueIdentifier
}
