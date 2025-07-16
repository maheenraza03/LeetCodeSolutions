// Time Complexity: O(n^2)

class Solution {
    public int maxArea(int[] height) {
        // a variable to store the value of the area
        int result = 0;

        // looping through the array
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                // to find the horizontal length, we need the min height so water doesn't overflow
                int length = Math.min(height[i], height[j]);
                // to find the width, we need the difference between positions
                int width = j - i;
                // calculate area using basic math
                int currentArea = length * width;
                // getting the largest area
                result = Math.max(result, currentArea);

            }
        }

        return result;

    }
}