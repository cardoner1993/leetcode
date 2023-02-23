use std::collections::HashSet;
use std::iter::FromIterator;

impl Solution {
    pub fn contains_duplicate(nums: Vec<i32>) -> bool {
        let result : HashSet<i32> = HashSet::from_iter(nums.iter().cloned());
        if result.len() == nums.len() {
            return false
        } else {
            return true
        }
    }
}
