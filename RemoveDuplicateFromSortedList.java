//https://leetcode.com/problems/remove-duplicates-from-sorted-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        List<Integer> li = new ArrayList();
        
        while(head != null){
            if(li.isEmpty()){
                li.add(head.val);
            // }else if(li.contains(head.val)){
            //            // li.add(head.val);
            //     System.out.println("hey");
            }else if(!li.contains(head.val)){
                li.add(head.val);
            }
                    head= head.next;
        }
        // li.forEach(System.out::println);
        ListNode ln= new ListNode();
        ListNode dummy= ln;
        for(int i=0; i< li.size(); i++){
            int val= li.get(i);
            // dummy.val=val;
            ListNode listNode= new ListNode(val,null);
            dummy.next= listNode;
            dummy=dummy.next;
        }
        return ln.next;
    }
}