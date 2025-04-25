class Solution {
    public int[] twoSum(int[] nums, int target) {
        // declare an integer array
        int[] indices;

        // intialize array
        indices = new int[2]; 

        // loop through the given array
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // if the numbers at the indices sum to the target, store the numbers into the array
                if (nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                    break;
                }
            }
        }
        // return the array
        return indices;
    }
}