impl Solution {
    pub fn merge_alternately(word1: String, word2: String) -> String {
        let mut word: String = "".to_string();
        let word_size = word1.len() + word2.len();
        for i in 0..word_size {
            if i < word1.len() {
                word.push(word1.chars().nth(i).unwrap());
            }
            if i < word2.len() {
                word.push(word2.chars().nth(i).unwrap());
            }
        }
        return word
    }
}
