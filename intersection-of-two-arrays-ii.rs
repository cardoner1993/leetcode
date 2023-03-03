impl Solution {
    pub fn intersect(nums1: Vec<i32>, nums2: Vec<i32>) -> Vec<i32> {
        let mut clone = nums2.clone();
        let mut intersect : Vec<i32> = Vec::new();
        for num in nums1 {
            if let Some(idx) = clone.iter().position(|&x| x == num) {
                intersect.push(num);
                clone.remove(idx);
            };
        }
        return intersect
    }
}
