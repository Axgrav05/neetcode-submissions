class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if not prices: return 0

        prev_min = float('inf')
        best = 0

        for price in prices:
            best = max(best, price - prev_min)
            prev_min = min(prev_min, price)
        return best
        