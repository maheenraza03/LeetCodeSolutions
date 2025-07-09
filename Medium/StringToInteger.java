class Solution {
    public int myAtoi(String s) {
        // defining all the different indices for the loops
        int index = 0;
        int total = 0;
        int sign = 1;

        // checking if the length of the string is 0
        if (s.length() == 0) {
            return 0;
        }

        // checking to see if there's any whitespace, and if there is, incrementing the index so we chop it off
        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }

        // in the case someone passes in whitespace only
        if (index == s.length()) {
            return 0;
        }

        // if a string has a positive sign in front of it, the sign of the integer will be positive
        // if a string has a negative sign in front of it, the sign of the integer will be negative
        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            sign = s.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        // actually converting the numbers
        while (index < s.length()) {
            // will give us the digit
            int digit = s.charAt(index) - '0';
            // making sure its a char
            if (digit < 0 || digit > 9) {
                break;
            }
            // making sure we're within the bounds
            if (Integer.MAX_VALUE / 10 < total || Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            total = total * 10 + digit;
            index++;
        }

        // getting the sign and returning
        return total * sign;


    }
}