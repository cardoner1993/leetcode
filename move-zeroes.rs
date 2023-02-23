impl Solution {
    pub fn move_zeroes(nums: &mut Vec<i32>) {

        let mut pos = 0;
        // keep all the non-zero
        for i in 0..nums.len() {
            if nums[i] != 0 {
                nums[pos] = nums[i];
                pos = pos + 1;
            }
        }
        
        // add all zero numbers
        for i in pos..nums.len() {
            nums[i] = 0;
        }
    }
}
