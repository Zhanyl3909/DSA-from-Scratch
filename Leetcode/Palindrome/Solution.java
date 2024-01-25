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
    public boolean isPalindrome(ListNode head) {

        var fast = head;
        ListNode lastNode = null;

        while (fast != null && fast.next != null) {

            fast = fast.next.next;

            var nextHead = head.next;
            head.next = lastNode;
            lastNode = head;
            head = nextHead;
        }

        if (fast != null) head = head.next;

        while (head != null) {
            if (lastNode.val != head.val) {return false;}
            lastNode = lastNode.next;
            head = head.next;
        }

        return true;
    }
}
