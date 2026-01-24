# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def oddEvenList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dum1=ListNode(-1)
        dum2=ListNode(-1)
        t1,t2=dum1,dum2
        idx=1
        if(head is None or head.next is None):
            return head
        else:
            while(head is not None):
                if(idx%2!=0):
                    t1.next=head
                    t1=t1.next
                    head=head.next
                else:
                    t2.next=head
                    t2=t2.next
                    head=head.next
                idx+=1
        t2.next=None
        t1.next=dum2.next
        return dum1.next



        