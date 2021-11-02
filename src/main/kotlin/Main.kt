import part1.*
import part1.Array
import part1.Stack
import java.util.*
import part1.LinkedList

fun main() {
    testHashTable()
}

private fun testHashTable() {
    val hashTable = HashTable()
    hashTable.apply {
        put(1, "A")
        put(2, "B")
        put(3, "C")
        println(get(2))
        remove(2)
        println(get(2))
    }
}

fun testCharFinder() {
    println(CharFinder.findTheFirstRepeatedChar("ASSDD"))
    println(CharFinder.findTheFirstNonRepeatedChar("ASSD"))

}

fun testQueueWithStacks() {
    val queue = QueueWithTwoStacks()
    queue.apply {
        enqueue(1)
        enqueue(2)
        enqueue(3)
        println(peek())
        println(dequeue())
        println(dequeue())
        println(peek())
        println(isEmpty())
        println(dequeue())
        println(isEmpty())
    }
}

fun testArrayQueue() {
    val arrayQueue = ArrayQueue(3)
    arrayQueue.apply {
        enqueue(1)
        enqueue(2)
        enqueue(3)
        println(peek())
        println(isEmpty())
        println(dequeue())
        println(peek())
        println(dequeue())
        println(dequeue())
        println(isEmpty())
    }
}

fun reverseAnQueueWithStack() {
    val qr = QueueReverser()
    val numbers: Queue<Int> = java.util.LinkedList<Int>(listOf(1, 2, 3))
    println(qr.reverse(numbers, numbers.size))
}

fun testCustomStack() {
    val customStack = Stack()
    customStack.apply {
        push(1)
        push(3)
        push(5)
        val pop = pop()
        println(pop)
        val peek = peek()
        println(peek)
        println(isEmpty())
    }
}

private fun testIsBalanced(string: String) {
    println(Expression().isBalanced(string))
}

private fun testReverseAString(string: String) {
    println(StringReverser().reverse(string))
}

private fun testLinkedList() {
    val ll = LinkedList().apply {
        addLast(1)
        addLast(2)
        addLast(7)
        addFirst(5)
    }
    val indexOf = ll.indexOf(7)
    println(indexOf)
    ll.apply {
        removeFirst()
        removeLast()
    }
    val size = ll.size()
    println(size)
}

private fun testArray(): Int {
    val array = Array(3)
    array.insert(2)
    array.insert(3)
    array.removeAt(1)
    return array.indexOf(2)
}