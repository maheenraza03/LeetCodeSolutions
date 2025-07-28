class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // sorting the array
        Arrays.sort(nums);

        // creating a results array
        List<List<Integer>> result = new LinkedList();

        // creating our first pointer at the first element, but making sure we have at least 3 elements after
        for (int i = 0; i < nums.length - 3; i++) {
            
            // making sure for i there isn't any duplicates
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // creating our second pointer at the second element, but making sure we have at least 2 elements after
            for (int j = i + 1; j < nums.length - 2; j++) {

                // making sure for j there isn't any duplicates
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                // defining our left and right pointers 
                int left = j + 1;
                int right = nums.length - 1;

                // as long as our left pointer is smaller than our right
                while (left < right) {
                    // calculating the current sum
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        // add the numbers if our current sum is equal to the target
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // if the next value of the left pointer lands on is a duplicate, move on
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        
                        // if the next value of the right pointer lands on is a duplicate, move on
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }

                        // increment/decrement
                        left++;
                        right--;
                    // if the sum is greater than the target, than decrement the right pointer
                    } else if (sum > target) {
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