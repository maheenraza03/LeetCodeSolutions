class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // sorting the array in order
        Arrays.sort(nums);

        // creating a list of lists for the result
        List<List<Integer>> result = new LinkedList();

        // looping through the array
        for (int i = 0; i < nums.length - 2; i++) {
            // checking conditions
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                // boundaries for the numbers after the current value
                int left = i + 1;
                int right = nums.length - 1;
                // finding what we need of the sum
                int sum = 0 - nums[i];

                // loop through the array as long as the left boundary is smaller than the right
                while (left < right) {
                    // if the left and right most values sum up to 0, add the 3 numbers to the result
                    if (nums[left] + nums[right] == sum) {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        // if the next number is a duplicate from the left side, increment
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        // if the next number is a duplicate from the right side, decrement
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        // increment/decrement the pointers as appropriate
                        left++;
                        right--;
                    // if the sum is greater, decrement the right pointer 
                    } else if (nums[left] + nums[right] > sum) {
                        right--;
                    // otherwise increment the left pointer
                    } else {
                        left++;
                    }
                }
            }
        }

        return result;
    }
}