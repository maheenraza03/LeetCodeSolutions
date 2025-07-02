class Solution {
    public String longestPalindrome(String s) {

        // return an empty string if input is null or empty
        if (s == null || s.length() < 1) {
            return "";
        }

        // declaring the start and end indices of the longest palindromic substring found in the string
        int start = 0;
        int end = 0;

        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            // expand around single center (odd-length palindrome so something like racecar)
            int len1 = expandFromMiddle(s, i, i);
            // expand around double center (even-length palindrome so something like aabbaa)
            int len2 = expandFromMiddle(s, i, i + 1);
            // choose the longer palindrome length 
            int len = Math.max(len1, len2);

            // update start and end indices if a longer palindrome is found depending on the length
            if (len > end - start) {
                start = i - ((len - 1) / 2);  
                end = i + (len / 2);         
            }
        }

        // return the longest palindromic substring
        return s.substring(start, end + 1);
    }

    // helper method to expand around the center and return the length of palindrome
    public int expandFromMiddle(String s, int left, int right) {
        // return 0 if invalid input or left index is greater than right
        if (s == null || left > right) {
            return 0;
        }

        // expand while characters at left and right are equal and within bounds
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        // return the length of the palindrome found
        return right - left - 1;
    }
}
