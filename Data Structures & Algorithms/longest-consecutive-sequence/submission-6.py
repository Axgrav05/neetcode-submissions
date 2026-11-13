class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if not nums: return 0

        # nums.sort()
        # best, count = 1, 1

        # for i in range(len(nums) - 1):

        #     if nums[i] + 1 == nums[i+1]:
        #         count += 1
        #     elif nums[i+1] == nums[i]: 
        #         continue
        #     else:
        #         best = max(best, count)
        #         count = 1
        # best = max(best, count)
        # return best

        s = set(nums)
        best = 0

        for num in s:
            if num - 1 not in s:
                curr = num
                length = 1

                while curr + 1 in s:
                    curr += 1
                    length += 1
                best = max(best, length)
        return best
            


        