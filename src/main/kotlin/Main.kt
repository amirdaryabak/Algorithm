import part1.Array
import part1.Expression
import part1.LinkedList
import part1.StringReverser

fun main() {
    testIsBalanced("({AbC})")
    testIsBalanced("{(AbC})")
    testIsBalanced("}{")
    testIsBalanced("({<[]>})")
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