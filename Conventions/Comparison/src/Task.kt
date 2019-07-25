data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(b: MyDate) = when {
        year != b.year -> year - b.year
        month != b.month -> month - b.month
        else -> dayOfMonth - b.dayOfMonth
    }
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2
