class ValidPalindrome:
    def isPalindrome(self, s: str) -> bool:
        sb=[]
        for c in s:
            if c.isalnum():
                sb.append(c.lower())
        str="".join(sb)
        rev=str[::-1]
        return str==rev
        