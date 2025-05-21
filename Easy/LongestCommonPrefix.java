class Solution {
    public String longestCommonPrefix(String[] strs) {
        // check to see if the array is empty/null
        if (strs == null || strs.length == 0) {
            return "";
        }

        // using a stringbuilder so we can append the results if neccessary (if they match)
        StringBuilder result = new StringBuilder();
        // comparing to the first, initial string
        String base = strs[0];

        // looping through the characters of the first string
        for (int i = 0; i < base.length(); i++) {
            // storing the current char
            char currentChar = base.charAt(i);
            // lopping through the rest of the array to the next string
            for (int j = 1; j < strs.length; j++) {
                // checking to see if the next string is too short or if there's a mismatch of characters
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return result.toString();
                }
            }

            // if not, append the character to the result string
            result.append(currentChar);
        }

        // return result
        return result.toString();
    }
}
