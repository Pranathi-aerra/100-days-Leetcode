class LongestSubstrinhWithoutRepeatingCharacters:
    def lengthOfLongestSubstring(self, s: str) -> int:
        hm={}
        lft=0
        rgt=0
        maxi=0
        while rgt<len(s):
            c=s[rgt]
            if c in hm:
                if hm[c]>=lft:
                    lft=hm[c]+1
            maxi=max(maxi,rgt-lft+1)
            hm[c]=rgt
            rgt+=1
        return maxi
        