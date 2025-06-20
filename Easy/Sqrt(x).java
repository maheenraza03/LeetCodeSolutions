class Solution {
    public int mySqrt(int x) {
        // checking to see if the number is less than 2, which means the sqaure root would just be 1
        if (x < 2) {
            return x;
        }

        // making the number a long to deal with division (double was not working)
        long y = x;
        // using newton's method
        while (y * y > x) {
            y = (y + x / y) / 2;
        }

        // return the result as an int
        return (int)y;
    }
}
