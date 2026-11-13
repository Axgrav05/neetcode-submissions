class Solution:

    def encode(self, strs: List[str]) -> str:
        result = []
        for s in strs:
            result.append(''.join([str(len(s)), '#', s]))
        
        return ''.join(result)

    def decode(self, s: str) -> List[str]:
        result = []
        i = 0
        while i < len(s):
            j = s.find('#', i)
            L = int(s[i:j])
            start = j+1
            w = s[start: start + L]
            result.append(w)
            i = start + L
        return result
