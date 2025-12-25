class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // relevant pointers
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        // working backwards to decide where to put the numbers depending on if its greater or equal to the numbers in the array
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}