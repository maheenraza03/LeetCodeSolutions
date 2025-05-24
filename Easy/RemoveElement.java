class Solution {
    public int removeElement(int[] nums, int val) {
        // integer to store the number of elements once val is removed
        int elements = 0;

        // loop through the original array
        for (int i = 0; i < nums.length; i++) {
            // if the element in the original array is not equal to val, update the array with that number and incremement
            if (nums[i] != val) {
                nums[elements] = nums[i];
                elements++;
            }
        }

        // return the number of elements in the array once val is removed
        return elements;
    }
}
