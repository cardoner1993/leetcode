impl Solution {
    pub fn single_number(nums: Vec<i32>) -> i32 {
        use std::collections::HashMap;
        let mut counter = HashMap::new();
        for num in nums {
            let count = counter.entry(num).or_insert(0);
            *count += 1;
        }

        let result = counter.iter()
        .find_map(|(key, &val)| if val == 1 { Some(key) } else { None });
        return *result.unwrap() as i32;
    }
