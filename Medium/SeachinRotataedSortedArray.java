class Solution {
    public int search(int[] nums, int target) {
        // default value to return if we can't find the target
        int result = -1;

        // indices for low and high
        int low = 0;
        int high = nums.length - 1;

        // use binary search
        while (low <= high) {
            int middle = low + (high - low) / 2;

            // if the middle is equal to the target, return that index
            if (nums[middle] == target) {
                result = middle;
                break;
            }

            // since the array is rotated, look for where it was rotated (would the target be in the right or left hand side)
            if (nums[low] <= nums[middle]) {
                if (nums[low] <= target && target < nums[middle]) {
                    high = middle - 1;
                } else {
                    low = middle + 1;
                }
            } else {
                if (nums[middle] < target && target <= nums[high]) {
                    low = middle + 1;
                } else {
                    high = middle - 1;
                }
            }
        }
        
        return result;
    }
}