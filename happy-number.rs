impl Solution {
    pub fn is_happy(n: i32) -> bool {
        let mut result = n;
        let mut visited: Vec<i32> = Vec::new();
        while result != 1 {
            let digits: Vec<_> = result.to_string().chars().map(|d| d.to_digit(10).unwrap()).collect();
            result = digits.iter().map(|d| i32::pow(*d as i32, 2)).sum();

            if visited.contains(&result) {
                return false
            }

            visited.push(result);
        }
        return true
    }
}
Console
