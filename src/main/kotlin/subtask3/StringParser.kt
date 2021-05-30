package subtask3

class StringParser {
    fun getResult(inputString: String): Array<String> {
        val result = mutableListOf<String>()
        var count: Int
        var min = 0
        val max = inputString.length - 1
        val chars = listOf('(', ')', '<', '>', '[', ']')

        for (i in 0..max) {
            if (chars.contains(inputString[i])) {
                when (inputString[i]) {
                    '(' -> {
                        if (i < max)
                            min = i + 1
                        count = 0
                        for (j in min..max) {
                            when (inputString[j]) {
                                ')' -> if (count == 0) result.add(inputString.substring(min, j))
                                else count--
                                '(' -> count++
                            }
                        }
                    }
                    '[' -> {
                        if (i < max) min = i + 1
                        count = 0
                        for (j in min..max) {
                            when (inputString[j]) {
                                ']' -> if (count == 0) result.add(inputString.substring(min, j))
                                else count--
                                '[' -> count++
                            }
                        }
                    }
                    '<' -> {
                        if (i < max) min = i + 1
                        count = 0
                        for (j in min..max) {
                            when (inputString[j]) {
                                '>' -> if (count == 0) result.add(inputString.substring(min, j))
                                else count--
                                '<' -> count++
                            }
                        }
                    }
                }
            }
        }
        return result.toTypedArray()
    }
}
