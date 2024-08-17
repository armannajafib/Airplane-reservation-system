


class BoeingA private constructor (seatList: List<seat>) :airplane(seatList) {

    companion object {
        @Volatile
        private var INSTANCE: BoeingA? = null

        fun getInstance(seatList: List<seat>): BoeingA {
            return INSTANCE ?: synchronized(this) {
                val instance = BoeingA(seatList)
                INSTANCE = instance
                instance
            }
        }
    }
}
