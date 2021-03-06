/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyLength = head;
        int length = 0;
        while(dummyLength.next != null)
        {
            length++;
            dummyLength = dummyLength.next;
        }
        int nodeBefore = length - n - 1;
        int nodeAfter = length - n + 1;
        if(nodeBefore == -2 && nodeAfter == 0)
        {
            ListNode newFirstReplace = head.next;
            return newFirstReplace;
        }
        else
        {
            int nodeAfterNum = 0;
            ListNode curNodeAfter = head;
            int nodeBeforeNum = 0;
            ListNode curNodeBefore = head;
            while(nodeBeforeNum <= nodeBefore)
            {
                nodeBeforeNum ++;
                curNodeBefore = curNodeBefore.next;
            }
            
            while(nodeAfterNum <= nodeAfter)
            {
                nodeAfterNum++;
                curNodeAfter = curNodeAfter.next;
            }
            curNodeBefore.next = curNodeAfter;
            return head;
         }
    }
}
