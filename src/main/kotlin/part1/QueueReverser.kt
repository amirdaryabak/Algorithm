package part1

import java.util.*

class QueueReverser {

    fun reverse(queue: Queue<Int> , k: Int): Queue<Int> {
        val stack = Stack<Int>()
        for (i in 0 until k)
            stack.push(queue.remove())

        while (stack.isNotEmpty())
            queue.add(stack.pop())

        // Add the remaining items in the queue (items
        // after the first K elements) to the back of the
        // queue and remove them from the beginning of the queue
        for (i in 0 until queue.size - k)
            queue.add(queue.remove())

        return queue


    }
}