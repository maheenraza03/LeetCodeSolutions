class Solution {
    public int[] searchRange(int[] nums, int target) {
        // creating the index, initializing it with -1, -1 
        int[] resultIndex = {-1, -1};
        // start of our array
        int low = 0;
        // end of our array
        int high = nums.length - 1;

        // use binary search to divide up the array in half to find which half of the array would have occurences of the target
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (nums[middle] == target) {
                resultIndex[0] = middle;
                 resultIndex[1] = middle;
                 break;
            } else if (nums[middle] < target) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        // if we can't find the target, return the result as is
        if (resultIndex[0] == -1) {
            return resultIndex;
        }

        // advanced search of the first occurence: keep moving the pointer to the left and check if that value is equal to the target, and if it is, update the index accordingly
        int i = resultIndex[0] - 1;
        while (i >= 0 && nums[i] == target) {
            resultIndex[0] = i;
            i = i - 1;
        }

        // advanced search of the last occurence: keep moving the pointer to the right and check if the value is equal to the target, and if it is, update the index accordingly 
        int j = resultIndex[1] + 1;
        while (j < nums.length && nums[j] == target) {
            resultIndex[1] = j;
            j = j + 1;
        }

        // return the array of the indices
        return resultIndex;

    }
}