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

    private ListNode reverseLL(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }


    public boolean isPalindrome(ListNode head) {

        if(head.next==null){
        return true;
      }
        
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondLL = reverseLL(slow);
        ListNode firstLL = head;
        
        while(secondLL !=null){
            if(firstLL.val != secondLL.val){
                return false;
            }
            firstLL = firstLL.next;
            secondLL = secondLL.next;
        }
        return true;
        
    }
}