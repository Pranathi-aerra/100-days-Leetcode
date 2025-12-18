class VP2:
    def validPalindrome(self, s: str) -> bool:
        left,rgt=0,len(s)-1
        while(left<rgt):
            if s[left]==s[rgt]:
                left+=1
                rgt-=1
            else:
                return self.isvalid(s,left+1,rgt) or self.isvalid(s,left,rgt-1)
        return True
    
    def isvalid(self,s,left,rgt):
        while(left<rgt):
            if s[left]!=s[rgt]:
                return False
            left+=1
            rgt-=1
        return True


        