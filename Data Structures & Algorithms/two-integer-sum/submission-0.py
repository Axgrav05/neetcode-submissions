class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        results = {}
        for i in range(len(nums)):
            if (target - nums[i]) in results:
                return [results[target-nums[i]], i]
            results[nums[i]] = i
        