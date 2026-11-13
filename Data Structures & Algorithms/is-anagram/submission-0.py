class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        letters_s = dict()
        letters_t = dict()

        for c in s:
            letters_s[c] = letters_s.get(c, 0) + 1
        
        for c in t:
            letters_t[c] = letters_t.get(c, 0) + 1
        
        return letters_s == letters_t
        