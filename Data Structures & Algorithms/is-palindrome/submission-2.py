class Solution:
    def isPalindrome(self, s: str) -> bool:
        w = []
        for c in s:
            if c.isalpha(): w.append(c.lower())
            elif c.isdigit(): w.append(c)
        print(w, w.reverse())
        return w == list(reversed(w))
        