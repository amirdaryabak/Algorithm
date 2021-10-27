package part1

class Stack {
    private val items = IntArray(5)
    private var count = 0

    fun push(item: Int) {
        if (items.size == count)
            throw StackOverflowError()

        items[count++] = item
    }

    fun pop(): Int {
        check(count != 0) // ***

        return items[--count]
    }

    fun peek(): Int {
        check(count != 0)

        return items[count - 1]
    }

    fun isEmpty(): Boolean {
        return count == 0
    }

}