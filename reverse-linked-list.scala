/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
    def reverseList(head: ListNode): ListNode = {
        
        def reverse(head: ListNode): ListNode = {
            if (head == null || head.next == null)
                return head;

            var rest = reverse(head.next);
            head.next.next = head;

            head.next = null;
            return rest;
        }
        
        reverse(head)
    }
}
