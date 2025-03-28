*/
17. Letter Combinations of a Phone Number
  Solved
  Medium
  Topics
  Companies
  Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
*/

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
public class Solution {
    public IList<string> LetterCombinations(string digits) {
        // Create a dictionary to map digits to letters as seen on a phone keypad.
        Dictionary<char, string> phoneMapping = new Dictionary<char, string>
        {
            {'2', "abc"},
            {'3', "def"},
            {'4', "ghi"},
            {'5', "jkl"},
            {'6', "mno"},
            {'7', "pqrs"},
            {'8', "tuv"},
            {'9', "wxyz"}
        };

        return GenerateCombinations(digits, phoneMapping);
    }
    
    // This method initializes the combination process.
    static List<string> GenerateCombinations(string digits, Dictionary<char, string> mapping)
    {
        var result = new List<string>();
        if (string.IsNullOrEmpty(digits))
        {
            return result;
        }
        
        // Start the recursive combination process.
        BuildCombination(digits, 0, "", mapping, result);
        return result;
    }
    
    // Recursively build the combinations.
    static void BuildCombination(string digits, int index, string current, Dictionary<char, string> mapping, List<string> result)
    {
        // Base case: if the current index has reached the end of the input digits,
        // add the current combination to the results.
        if (index == digits.Length)
        {
            result.Add(current);
            return;
        }
        
        // If the digit is in the mapping, iterate over its corresponding letters.
        if (mapping.ContainsKey(digits[index]))
        {
            string letters = mapping[digits[index]];
            foreach (char letter in letters)
            {
                // Append the letter and move to the next digit.
                BuildCombination(digits, index + 1, current + letter, mapping, result);
            }
        }
    }
}
