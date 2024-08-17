
class AirBusB private constructor (seatList: List<seat>) :airplane(seatList) {

    companion object {
        @Volatile
        private var INSTANCE: AirBusB? = null

        fun getInstance(seatList: List<seat>): AirBusB {
            return INSTANCE ?: synchronized(this) {
                val instance = AirBusB(seatList)
                INSTANCE = instance
                instance
            }
        }
    }
}
