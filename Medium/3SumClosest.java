class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        // creating variables to store the closest sum and the smallest difference
        int closestSum = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;

        // looping through the array
        for (int i = 0; i < nums.length - 2; i++) {
            // checking conditions
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                // boundaries for the numbers after the current value
                int left = i + 1;
                int right = nums.length - 1;

                // loop through the array as long as the left boundary is smaller than the right
                while (left < right) {
                    int currentSum = nums[i] + nums[left] + nums[right];
                    // finding the current difference between the numbers
                    int currentDiff = Math.abs(target - currentSum);

                    // if the current difference is smaller than what we have stored for the min difference, save it as the min difference
                    // update the sum as well
                    if (currentDiff < minDiff) {
                        minDiff = currentDiff;
                        closestSum = currentSum;
                    }
                    
                    // if the current sum is smaller than the target, increment the left pointer 
                    if (currentSum < target) {
                        left++;
                    // if the current sum is greater than the target, decrement the right pointer 
                    } else if (currentSum > target) {
                        right--;
                    } else {
                        return currentSum;
                    }
                }
            }
        }

        return closestSum;
    }
}