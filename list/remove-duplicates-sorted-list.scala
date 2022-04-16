/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
    def deleteDuplicates(head: ListNode): ListNode = {
        var reslist = List[Int]()
        var result = ListNode(0)
        result.next = head
        var head2 = result
        while(head2.next != null) {
            if (!(reslist.contains(head2.next.x))){
                reslist = reslist :+ head2.next.x
                head2 = head2.next
            } else {
                head2.next = head2.next.next
            }
        }
        return result.next
    }
}
