


class BoeingB private constructor (seatList: List<seat>) :airplane(seatList) {

    companion object {
        @Volatile
        private var INSTANCE: BoeingB? = null

        fun getInstance(seatList: List<seat>): BoeingB {
            return INSTANCE ?: synchronized(this) {
                val instance = BoeingB(seatList)
                INSTANCE = instance
                instance
            }
        }
    }
}
