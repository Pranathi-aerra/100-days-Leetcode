# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        dummy=ListNode(-1)
        curr=dummy
        t1,t2=l1,l2
        carry=0
        while( t1 is not None or t2 is not None):
            sum=carry
            if(t1):
                sum=sum+t1.val
            if(t2):
                sum=sum+t2.val
            nn=ListNode(sum%10)
            carry=sum//10
            curr.next=nn
            curr=curr.next
            if(t1):
                t1=t1.next
            if(t2):
                t2=t2.next
        if(carry>0):
            c=ListNode(carry)
            curr.next=c
        return dummy.next

        