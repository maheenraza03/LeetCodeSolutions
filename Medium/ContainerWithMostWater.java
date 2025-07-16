class Solution {
    public int maxArea(int[] height) {
        // a variable to store the value of the area
        int result = 0;

        // two pointers starting at both ends of the array
        int left = 0;
        int right = height.length - 1;

        // looping through the array until the pointers meet
        while (left < right) {
            // to find the horizontal length, we need the min height so water doesn't overflow
            int length = Math.min(height[left], height[right]);
            // to find the width, we need the difference between positions
            int width = right - left;
            // calculate area using basic math
            int currentArea = length * width;
            // getting the largest area
            result = Math.max(result, currentArea);

            // move the pointer that's at the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}
