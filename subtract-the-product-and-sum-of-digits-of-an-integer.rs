impl Solution {
    pub fn subtract_product_and_sum(n: i32) -> i32 {
        let digits: Vec<_> = n.to_string().chars().map(|d| d.to_digit(10).unwrap() as i32).collect();
        let sum: i32 = digits.iter().sum();
        let mult: i32 = digits.iter().product();
        return mult - sum
    }
}
