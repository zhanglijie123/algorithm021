class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        else if(l1.val>l2.val){
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }else{
            l1.next = mergeTwoLists(l2,l1.next);
            return l1;
        }
    }
}