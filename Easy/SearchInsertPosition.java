class Solution {
    public int searchInsert(int[] nums, int target) {
        // integer to save the value of the index the value is at/should go
        int indexOfInt = 0;

        // checking to see if the target is greater than the last value (so it would go at the end)
        if (target > nums[nums.length - 1]) {
            indexOfInt = nums.length;
        }
        
        // looping through the array
        for (int i = 0; i < nums.length; i++) {
            // if the value is equal to the current value in the array
            if (nums[i] == target) {
                indexOfInt = i;
            }

            // if the value is greater than the current value but smaller than the next value (as long as we don't go out of bounds)
            if (i + 1 < nums.length && nums[i] < target && nums[i+1] > target) {
                indexOfInt = i+1;
            }

        }

        // return the value of the index
        return indexOfInt;
    }
}