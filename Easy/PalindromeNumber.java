class Solution {
    public boolean isPalindrome(int x) {
        // negative numbers aren't palindromes
        if (x < 0) return false; 
        // storing the original integer
        int originalx = x;
        // integer to store the reversed version
        int reversedNum = 0;

        while (x != 0) {
            // get the last digit of the integer
            int digit = x % 10;
            // add the last digit to the reversed number after multiplying it by 10
            reversedNum = reversedNum * 10 + digit;
            // remove the last digit by dividing by 10
            x /= 10;
        }

        // return either true or false
        return originalx == reversedNum;
    }
}