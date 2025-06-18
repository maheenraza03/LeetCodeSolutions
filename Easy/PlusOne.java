class Solution {
    public int[] plusOne(int[] digits) {
        // loop through the array starting at the last digit in the array
        for (int i = digits.length - 1; i >= 0; i--) {
            // check to see if the last digit is less than 9
            if (digits[i] < 9) {
                // if so, increment the digit 
                digits[i]++; 
                // return the array
                return digits;
            }
            // add a zero at the end!
            digits[i] = 0; 
        }

        // if the last number is equal to 9, create a new array with space for another entry
        int[] result = new int[digits.length + 1];
        result[0] = 1; 
        return result;
    }
}