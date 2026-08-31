class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """

        indexed_sum = [(nums[i], i) for i in range(len(nums))]
        indexed_sum.sort()

        low = 0
        high = len(nums) - 1

        while (low <= high):
            current_sum = indexed_sum[low][0] + indexed_sum[high][0]

            if (current_sum == target):
                return [indexed_sum[low][1], indexed_sum[high][1]]
            elif target > current_sum:
                low += 1
            else:
                high -= 1

        return -1  