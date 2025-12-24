class Solution {
    public int strStr(String haystack, String needle) {
        
        // get the length of the needle
        int lengthOfNeedle = needle.length();
        // index value
        int index = -1;

        // check to see if the strings are null
        if (haystack == null || needle == null) {
            return index;
        }

        // check to see if the needle is empty
        if (needle.length() == 0) {
            return 0;
        }

        // check to see i the length of the needle is greater than the haystack, otherwise it's not possible to find it
        if (haystack.length() < needle.length()) {
            return index;
        }

        // for loop to iterate through the haystack
        for (int i = 0; i <= haystack.length() - lengthOfNeedle; i++) {
            // the second pointer should end at the length of the needle depending on where i is
            int j = i + lengthOfNeedle - 1;
            // create a subtring from the two pointers and compare it to the needle, if its a match, index = i and break from the loop
            if (haystack.substring(i, j + 1).equals(needle)) {
                index = i;
                break;
            }
        }

        return index;
    }
}
