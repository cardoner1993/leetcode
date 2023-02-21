impl Solution {
    pub fn sum_odd_length_subarrays(arr: Vec<i32>) -> i32 {
        let mut res: Vec<i32> = arr.clone();
        for i in (3..arr.len() + 1).step_by(2) {
            for j in (0..arr.len() - i + 1) {
                let it = j + i;
                let result: i32 = Vec::from(&arr[j..it]).iter().sum();
                res.push(result);
            }
        }
        return res.iter().sum::<i32>()
    }
}
