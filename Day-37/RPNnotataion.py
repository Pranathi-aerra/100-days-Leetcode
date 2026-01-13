class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        st=[]
        for s in tokens:
            if s in {"+","-","*","/"}:
                b=st.pop()
                a=st.pop()
                if s=="+":
                    st.append(a+b)
                elif s=="-":
                    st.append(a-b)
                elif s=="*":
                    st.append(a*b)
                else:
                    st.append(int(a/b))
            else:
                st.append(int(s))
        return st.pop()
               
        