class Solution:
    def maxArea(self, heights: List[int]) -> int:
        best = 0

        for i in range(len(heights)):
            for j in range(i+1, len(heights), 1):
                best = max(best, min(heights[i], heights[j]) * (j-i))
                
        return best

        # best, left, right = 0, 0, 0



        