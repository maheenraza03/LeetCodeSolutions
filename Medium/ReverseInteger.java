class Solution {
    public int reverse(int x) {

        // to save the new reversed number
        int reversedNumber = 0;

        /**
        this while loop first will get the last digit of the original number by taking the modulo,
        then it will add the digit to the reversed number, and then remove said digit from the orignal number 
        */
        while (x != 0) {
            int digit = x % 10;

            // check for overflow before performing the multiplication and addition
            if (reversedNumber > Integer.MAX_VALUE / 10 || 
               (reversedNumber == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // overflow would occur
            }
            if (reversedNumber < Integer.MIN_VALUE / 10 || 
               (reversedNumber == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // underflow would occur
            }

            // add the digit to the reversedNumber int, and remove it from the original digit
            reversedNumber = reversedNumber * 10 + digit;
            x /= 10;
        }

        // return the reversedNumber
        return reversedNumber;
    }
}
