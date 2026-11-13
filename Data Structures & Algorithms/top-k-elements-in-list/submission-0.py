from collections import Counter
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
       freq = Counter(nums)
       buckets =[[] for _ in range(len(nums) + 1)]
       for num, cnt in freq.items():
        buckets[cnt].append(num)
        
        res = []
       for freq in range(len(buckets) - 1, 0, -1):
        for num in buckets[freq]:
            res.append(num)
            if len(res) == k: return res
        
