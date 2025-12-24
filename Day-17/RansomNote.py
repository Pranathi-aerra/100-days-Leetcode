class RansomNote:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        hm={}
        for c in magazine:
            hm[c]=hm.get(c,0)+1
        for ch in ransomNote:
            if ch not in hm or hm[ch]==0:
                return False
            hm[ch]-=1
        return True
        