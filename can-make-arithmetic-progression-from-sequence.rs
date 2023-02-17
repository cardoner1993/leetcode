impl Solution {
    pub fn can_make_arithmetic_progression(arr: Vec<i32>) -> bool {
        let mut p_arr = arr;
        p_arr.sort();
        if p_arr.len() == 2 {
            return true
        }
        let c = p_arr[0] - p_arr[1];
        for i in 1..p_arr.len() - 1 {
            if (p_arr[i] - p_arr[i + 1]) != c {
                return false
            }
        }
