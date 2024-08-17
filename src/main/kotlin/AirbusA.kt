


class AirbusA private constructor (seatList: List<seat>) :airplane(seatList) {

    companion object {
        @Volatile
        private var INSTANCE: AirbusA? = null

        fun getInstance(seatList: List<seat>): AirbusA {
            return INSTANCE ?: synchronized(this) {
                val instance = AirbusA(seatList)
                INSTANCE = instance
                instance
            }
        }
    }
}
