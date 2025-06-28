class Solution {
    public int lengthOfLongestSubstring(String s) {

        // length of our substring
        int maxLength = 0;

        // creating a hashmap that holds the char and the position we last saw it in
        Map<Character, Integer> existingCharacters = new HashMap<>();

        // creating our right and left pointers 
        for (int right = 0, left = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            // checking if the current char is in our map
            if (existingCharacters.containsKey(currentChar) && existingCharacters.get(currentChar) >= left)  {
                // moving the left pointer one more than the position of the char that we've already seen
                left = existingCharacters.get(currentChar) + 1;
            }

            // finding the max length of our substring
            maxLength = Math.max(maxLength, right-left+1);
            existingCharacters.put(currentChar, right);
        }

        return maxLength;
        
    }
}