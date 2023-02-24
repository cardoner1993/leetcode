impl Solution {
    pub fn diagonal_sum(mat: Vec<Vec<i32>>) -> i32 {
        let mut result: i32 = 0;
        let mat_len = mat.len();
        for i in 0..mat_len {
            if i == mat_len - i - 1 {
                result = result + mat[i][i]
            } else {
                result = result + mat[i][i] + mat[i][mat_len - i - 1];
            }
        }
        return result
    }
}
