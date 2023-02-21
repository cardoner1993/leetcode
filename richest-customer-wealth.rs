impl Solution {
    pub fn maximum_wealth(accounts: Vec<Vec<i32>>) -> i32 {
        let mut vec_res = Vec::<i32>::new();
        for row in accounts {
            let sum_row = row.iter().sum::<i32>();
            vec_res.push(sum_row);
        }
        return *vec_res.iter().max().unwrap() as i32
    }
}
