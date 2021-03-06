package com.yisenjing.third21;

import com.yisenjing.third3.ListNode;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by Yisen on 4/14/16.
 */
public class MergeKSortedLists {

    public ListNode merge(List<ListNode> listOfLists) {

        if (listOfLists.size() == 0) {
            return null;
        }
        PriorityQueue<ListNode> minHeap = new PriorityQueue<ListNode>(listOfLists.size(), new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                if (o1.value == o2.value) {
                    return 0;
                }
                return o1.value < o2.value ? -1 : 1;
            }
        });

        for (ListNode node : listOfLists) {
            minHeap.add(node);
        }

        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        while (!minHeap.isEmpty()) {
            ListNode temp = minHeap.poll();
            cur.next = temp;
            cur = cur.next;
            if (temp.next != null) {
                minHeap.offer(temp.next);
            }
        }
        return dummy.next;
    }



}
