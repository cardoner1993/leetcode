impl Solution {
    pub fn next_greater_element(nums1: Vec<i32>, nums2: Vec<i32>) -> Vec<i32> {
        /* Create empty vector */
        let mut result_vec = Vec::<i32>::new();
        for item in nums1 {
            let mut max_val = -1;
            let index = nums2.iter().position(|&r| r == item).unwrap();
            for k in (index..nums2.len() - 1) {
                if nums2[k + 1] > nums2[index] {
                    max_val = nums2[k + 1];
                    break;
                }
            }
            result_vec.push(max_val);
        }
        return result_vec
    }
}
