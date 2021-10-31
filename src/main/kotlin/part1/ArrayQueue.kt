package part1


class ArrayQueue(size: Int) {

    private val items = IntArray(size)
    private var rear: Int = 0
    private var front: Int = 0
    private var count: Int = 0

    fun enqueue(item: Int) {
        check(!isFull())
        items[rear] = item
        rear = (rear + 1) % items.size
        count++
    }

    fun dequeue(): Int {
        check(!isEmpty())
        val item = items[front]
        items[front] = 0
        front = (front + 1) % items.size
        count--

        return item
    }

    fun peek(): Int {
        check(!isEmpty())
        return items[front]
    }

    fun isEmpty(): Boolean {
        return count == 0
    }

    private fun isFull(): Boolean {
        return count == items.size
    }

    override fun toString(): String {
        return items.contentToString()
    }

}