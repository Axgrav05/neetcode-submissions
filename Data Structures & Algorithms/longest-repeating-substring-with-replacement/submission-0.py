class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        best, left = 0, 0

        count = {}
        max_count = 0

        for right in range(len(s)):
            count[s[right]] = 1 + count.get(s[right], 0)
            max_count = max(max_count, count[s[right]]) 

            while (right - left + 1) - max_count > k:
                count[s[left]] = -1 + count.get(s[left])
                left += 1
            best = max(best, right-left + 1)
        return best
