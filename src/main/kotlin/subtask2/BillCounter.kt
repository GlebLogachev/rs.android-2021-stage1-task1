package subtask2

class BillCounter {
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val annaBill = (bill.filter {  it != bill[k] }).sum() / 2
        return if (annaBill == b) {
            "bon appetit"
        } else {
            (b - annaBill).toString()
        }
    }
}
