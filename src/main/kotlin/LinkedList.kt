class LinkedList {
    private var head: Node? = null
    private var tail: Node? = null
    private var size: Int = 0

    fun addLast(item: Int) {
        val newNode = Node(value = item, next = null)
        if (isEmpty()) {
            head = newNode
            tail = newNode
        } else {
            tail?.next = newNode
            tail = newNode
        }

        size++
    }

    fun addFirst(item: Int) {
        val newNode = Node(value = item, next = null)
        if (isEmpty()) {
            head = newNode
            tail = newNode
            return
        }
        newNode.next = head
        head = newNode

        size++
    }

    fun indexOf(item: Int): Int {
        var index = 0
        var current = head
        while (current != null) {
            if (current.value == item)
                return index
            current = current.next
            index++
        }
        return -1
    }

    fun contains(item: Int): Boolean {
        return indexOf(item) != -1
    }

    fun removeFirst() {
        if (isEmpty())
            throw IllegalArgumentException()
        if (head == tail) {
            head = null
            tail = null
            return
        }

        head?.let {
            val second = it.next
            it.next = null
            head = second
        }

        size--
    }

    fun removeLast() {
        if (isEmpty())
            throw IllegalArgumentException()
        if (head == tail) {
            head = null
            tail = null
            return
        }
        val previous = getPrevious(tail)
        tail = previous
        tail?.next = null

        size--
    }

    fun size(): Int {
        return size
    }

    private fun getPrevious(node: Node?): Node? {
        var current = head
        while (current != null) {
            if (current.next === node)
                return current
            current = current.next
        }
        return null
    }

    private fun isEmpty(): Boolean {
        return head == null
    }

}

private data class Node(
    var value: Int,
    var next: Node?
)