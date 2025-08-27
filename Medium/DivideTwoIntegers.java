class Solution {
    public int divide(int dividend, int divisor) {
        // checking for the case of overflow
        if (dividend == 1<<31 && divisor == -1) {
            return Integer.MAX_VALUE;
        }   

        // checking for the sign
        boolean sign = (dividend>=0) == (divisor>=0) ? true : false;

        // getting rid of the sign if there is any
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int result = 0;

        while (dividend - divisor >= 0) {
            int count = 0;
            // we can't use multiplication, so we're shifting bits instead
            while (dividend - (divisor << 1 << count) >= 0) {
                count++;
            }

            result += 1 << count;
            dividend -= divisor << count;
        }

        if (sign == true) {
            return result;
        } else {
            return -result;
        }

    }
}