class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if not nums: return 0

        nums.sort()
        best, count = 1, 1

        for i in range(len(nums) - 1):

            if nums[i] + 1 == nums[i+1]:
                count += 1
            elif nums[i+1] == nums[i]: 
                continue
            else:
                best = max(best, count)
                count = 1
        best = max(best, count)
        return best
            


        