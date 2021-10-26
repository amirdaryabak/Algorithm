fun main() {
    testLinkedList()

}

private fun testLinkedList() {
    val ll = LinkedList()
    ll.addLast(1)
    ll.addLast(2)
    ll.addLast(7)
    ll.addFirst(5)
    val indexOf = ll.indexOf(7)
    println(indexOf)
    ll.removeFirst()
    ll.removeLast()
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