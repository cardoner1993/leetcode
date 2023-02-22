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
    pub fn get_decimal_value(head: Option<Box<ListNode>>) -> i32 {
        let mut head2 = head.clone();
        let mut list_binary = Vec::<i32>::new();
        while head2 != None {
            match head2 {
                Some(x) => {
                    list_binary.push(x.val);
                    head2 = x.next;
                }
                None => ()
            }
        }
        let binary_lst_str: String = list_binary.iter().map(|i| i.to_string()).collect::<String>();
        return isize::from_str_radix(&binary_lst_str, 2).unwrap() as i32
    }
}
