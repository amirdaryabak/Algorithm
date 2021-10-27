import part1.*
import part1.Array

fun main() {
    testCustomStack()
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