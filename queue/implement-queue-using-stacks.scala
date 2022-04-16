/** Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).
Implement the MyQueue class:
void push(int x) Pushes element x to the back of the queue.
int pop() Removes the element from the front of the queue and returns it.
int peek() Returns the element at the front of the queue.
boolean empty() Returns true if the queue is empty, false otherwise.
*/

class MyQueue() {
    var s1 = scala.collection.mutable.Stack[Int]()
    var s2 = scala.collection.mutable.Stack[Int]()

    def push(x: Int) {
        s1.push(x)
    }

    def pop(): Int = {
        // if the second stack is empty, move elements from the first stack to it
        if (s2.isEmpty)
        {
            while (!s1.isEmpty) {
                s2.push(s1.pop());
            }
        }
 
        // return the top item from the second stack
        return s2.pop();
    }

    def peek(): Int = {
        if (s2.isEmpty)
        {
            while (!s1.isEmpty) {
                s2.push(s1.pop());
            }
        }
 
        // return the top item from the second stack
        return s2.top;
    }

    def empty(): Boolean = {
        if (s1.isEmpty && s2.isEmpty){
            return true
        } else {
            return false
        }
    }

}

/**
 * Your MyQueue object will be instantiated and called as such:
 * var obj = new MyQueue()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.peek()
 * var param_4 = obj.empty()
 */
