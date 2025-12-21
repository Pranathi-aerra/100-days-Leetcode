class ValidAnagram:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hm={}
        for s in strs:
            k=''.join(sorted(s))
            if k not in hm:
                hm[k]=[]
            hm[k].append(s)
        return list(hm.values())

        