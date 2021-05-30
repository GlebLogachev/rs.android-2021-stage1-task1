package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        val happyArray = mutableListOf<Int>()
        if (sadArray.isNotEmpty()) {
            happyArray.add(sadArray[0])
            for (i in 1 until sadArray.lastIndex) {
                if (sadArray[i] <= happyArray.last() + sadArray[i + 1])
                    happyArray.add(sadArray[i])
                else {
                    for (j in happyArray.lastIndex downTo 1) {
                        if (happyArray[j] > happyArray[j - 1] + sadArray[i + 1]) happyArray.removeAt(j)
                    }
                }
            }
            happyArray.add(sadArray.last())
        }
        return happyArray.toIntArray()
    }
}
