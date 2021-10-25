fun main() {


    println(testArray())

}

private fun testArray(): Int {
    val array = Array(3)
    array.insert(2)
    array.insert(3)
    array.removeAt(1)
    return array.indexOf(2)
}