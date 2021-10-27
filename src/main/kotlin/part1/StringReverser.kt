package part1

import java.util.*

class StringReverser {

    fun reverse(str: String): String {
        val stack = Stack<Char>()
        for (ch in str) {
            stack.push(ch)
        }
        val reversed = StringBuffer()
        while (!stack.empty())
            reversed.append(stack.pop())

        return reversed.toString()
    }

}