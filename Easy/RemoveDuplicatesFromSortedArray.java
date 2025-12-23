class Solution {
    public int removeDuplicates(int[] nums) {
        // check to see if the array is empty and return 0 if it is
        if (nums.length == 0) {
            return 0;
        }

        // starting at the second element 
        int i = 1;

        // looping through the array
        for (int j = 1; j < nums.length; j++) {
            // compare the neighbouring two numbers and see if they are the same, if they aren't increment the count
            if (nums[j] != nums[j - 1]) {
                nums[i] = nums[j];
                i++;
            }
        }

        // return the count
        return i;
    }
}