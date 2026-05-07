public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode LL1 = headA;
        ListNode LL2 = headB;
        while(LL1 != LL2){
            LL1 = (LL1 == null)?headA : LL1.next;
            LL2 =(LL2 == null)?headB : LL2.next;
        }
        return LL1;
    }
}