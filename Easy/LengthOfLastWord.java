class Solution {
    public int lengthOfLastWord(String s) {
        // variable to store the length of the last word
        int length = 0;
        // starting at the last character's index
        int i = s.length() - 1;

        // for strings with any trailing or unnecessary white spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // counting the length of the last string
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        // returning the length of the last string
        return length;
    }
}
