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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        int len = length(head);
        ListNode curr = head;
        for(int i = 0; i < k%len; i++){
            curr = rotateOnce(curr);
        }
        return curr;
        
    }
    private ListNode rotateOnce(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr.next!=null){
            prev = curr;
            curr = curr.next;
        }
        curr.next = head;
        prev.next = null;
        return curr;
    }
    public int length(ListNode head){
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        return len;
    }
}