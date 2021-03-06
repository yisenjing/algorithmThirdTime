package com.yisenjing.third3;

/**
 * Created by Yisen on 4/6/16.
 */
public class MiddleNodeOfLinkedList {

    public ListNode middleNode(ListNode head) {

        if (head == null) {
            return null;
        }


        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


}
