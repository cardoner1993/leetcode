// Definition for singly-linked list.
// #[derive(PartialEq, Eq, Clone, Debug)]
// pub struct ListNode {
//   pub val: i32,
//   pub next: Option<Box<ListNode>>
// }
// 
// impl ListNode {
//   #[inline]
//   fn new(val: i32) -> Self {
//     ListNode {
//       next: None,
//       val
//     }
//   }
// }
impl Solution {
    pub fn middle_node(mut head: Option<Box<ListNode>>) -> Option<Box<ListNode>> {
        let mut head2 = head.clone();
        let mut count : i32 = 0;
        while head2 != None {
            match head2 {
                Some(x) => {
                    count = count + 1;
                    head2 = x.next;
                }
                None => ()
            }
        }
        (0..count / 2).for_each(|_| head = head.clone().unwrap().next);
        head
    }
}
