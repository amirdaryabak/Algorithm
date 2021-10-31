package part1

import java.util.Stack

class QueueWithTwoStacks {
    private val stack1 = Stack<Int>()
    private val stack2 = Stack<Int>()

    fun enqueue(item: Int) {
        stack1.push(item)
    }

    fun dequeue(): Int {
        check(!isEmpty())
        moveStack1ToStack2()
        return stack2.pop()
    }

    fun peek(): Int {
        check(!isEmpty())
        moveStack1ToStack2()
        return stack2.peek()
    }

    private fun moveStack1ToStack2() {
        if (stack2.isEmpty())
            while (stack1.isNotEmpty())
                stack2.push(stack1.pop())
    }

    fun isEmpty(): Boolean {
        return stack1.isEmpty() && stack2.isEmpty()
    }

}