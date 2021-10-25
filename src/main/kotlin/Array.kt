class Array(length: Int) {
    private var items = IntArray(length)
    private var count = 0

    fun insert(item: Int) {
        if (items.size == count) {
            val newItems = IntArray(items.size * 2)
            for (i in 0 until count)
                newItems[i] = items[i]
            items = newItems
        }

        items [count++] = item
    }

    fun removeAt(index: Int) {
        if (index < 0 || index >= count) throw IllegalArgumentException()
        for (i in index until count) items[i] =
            items[i + 1]
        count --
    }

    fun indexOf(item: Int): Int {
        for (i in 0 until count) if (items[i] == item)
            return i
        return -1
    }
}