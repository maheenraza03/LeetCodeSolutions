class Solution {
    public int singleNumber(int[] nums) {
        // integer to store the result
        int result = 0;

        // loop through the array
        for (int i = 0; i < nums.length; i++) {
            // to find the result, use the XOR operatior which helps cancel out the same values (i.e. 2 XOR 2 = 0010 XOR 0010 = 0000)
            result = result ^ nums[i];
        }

        // return the resulting value that we get left with
        return result;
    }
}