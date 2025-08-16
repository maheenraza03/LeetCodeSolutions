class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // defining the new size for the merged array
        int newSize = nums1.length + nums2.length;
        // creating the new array to store values from both arrays
        int[] mergedArray = new int[newSize];

        // value to return
        double median = 0;

        // copying the values of both arrays into the new array
        System.arraycopy(nums1, 0, mergedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArray, nums1.length, nums2.length);

        // making sure the merged array is sorted
        Arrays.sort(mergedArray);

        // checking if the length of the merged array is even or odd
        if (mergedArray.length % 2 != 0) {
            int middleIndex = mergedArray.length / 2;
            median = mergedArray[middleIndex];
        } else {
            int leftIndex = (mergedArray.length / 2) - 1;
            int rightIndex = mergedArray.length / 2;
            //median = Math.floorDiv(mergedArray[leftIndex] + mergedArray[rightIndex], 2);
            median = ((double)mergedArray[leftIndex] + (double)mergedArray[rightIndex]) / 2;
        }

        // returning the median
        return median;


    }
}