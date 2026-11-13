class Solution:
    def maxArea(self, heights: List[int]) -> int:
        # best = 0

        # for i in range(len(heights)):
        #     for j in range(i+1, len(heights), 1):
        #         best = max(best, min(heights[i], heights[j]) * (j-i))
                
        # return best

        best, left, right = 0, 0, len(heights) - 1

        while left < right:
            best = max(best, min(heights[left], heights[right]) * (right - left))

            if heights[left] < heights[right]:
                left += 1
            else:
                right -= 1
        return best



        