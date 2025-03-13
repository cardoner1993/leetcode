public class Solution {
    public int LengthOfLongestSubstring(string s) {
        int n = s.Length, maxLength = 0;
        // Dictionary to store the most recent index of each character
        Dictionary<char, int> lastIndex = new Dictionary<char, int>();
        // 'start' marks the beginning of the current window
        int start = 0;
        
        for (int end = 0; end < n; end++) {
            char currentChar = s[end];
            // If currentChar was seen and is inside the current window...
            if (lastIndex.ContainsKey(currentChar) && lastIndex[currentChar] >= start) {
                // Move the start to the next index after the last occurrence of currentChar
                start = lastIndex[currentChar] + 1;
            }
            
            // Update the last seen index of currentChar
            lastIndex[currentChar] = end;
            // Update maxLength if the current window is longer
            maxLength = Math.Max(maxLength, end - start + 1);
        }
        
        return maxLength;
    }
}

// Given a string s, find the length of the longest substring without duplicate characters.
