# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def sortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None:
            return head
        mid=self.findmid(head)
        midnext=mid.next
        mid.next=None
       
        left=self.sortList(head)
        right=self.sortList(midnext)
        return self.merge(left,right)
    def findmid(self,head):
        temp=head
        slow=temp
        fast=temp.next
        while(fast and fast.next):
            slow=slow.next
            fast=fast.next.next
        return slow
    def merge(self,l1,l2):
        nn=ListNode(-1)
        tail=nn
        while(l1 and l2):
            if l1.val<l2.val:
                tail.next=l1
                l1=l1.next
            else:
                tail.next=l2
                l2=l2.next
            tail=tail.next
        if l1:
            tail.next=l1
        if l2:

            tail.next=l2
        return nn.next


        