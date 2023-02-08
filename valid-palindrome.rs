impl Solution {
    pub fn is_palindrome(s: String) -> bool {
        let t = s.to_lowercase().to_string().chars().filter(|c| c.is_alphanumeric()).collect::<String>();
        if t == t.chars().rev().collect::<String>() {
            return true;
        } else {
            return false;
        }
    }
}
