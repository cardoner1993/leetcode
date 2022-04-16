// Check if left parentesis is matched by its right part or return false. If top element and not empty pop the first element of the stack.
object Solution {
    def isValid(s: String): Boolean = {
        var stackobj = scala.collection.mutable.Stack[Char]()
        for (c <- s){
            if (c == '(' || c == '{' || c == '[') {
                stackobj.push(c)
            }
            // If right symbol is encountered
            else if (c == ')' && !stackobj.isEmpty && stackobj.top == '(') {
                stackobj.pop
            } else if (c == '}' && !stackobj.isEmpty && stackobj.top == '{') {
                stackobj.pop
            } else if (c == ']' && !stackobj.isEmpty && stackobj.top == '[') {
                stackobj.pop
            }
            // If none of the valid symbols is encountered
            else {
                return false;
            }
        }
        return stackobj.isEmpty
    }
}
