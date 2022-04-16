/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
    def removeElements(head: ListNode, `val`: Int): ListNode = {
        var temp = ListNode(0);
        temp.next = head;
        var prev = temp;

        while(prev.next != null) {
            if (prev.next.x == `val`) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }

        return temp.next;
    }
}
