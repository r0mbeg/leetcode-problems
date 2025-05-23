package ru.proffen;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle2 {
    public static class ListNode {
        Long val;
        ListNode next;
        ListNode() {}
        ListNode(long val) { this.val = val; }
        ListNode(long val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        int size;
        while (head != null) {
            size = set.size();
            set.add(head);
            if (set.size() == size) {
                return head;
            }
            head = head.next;
        }
        return null;
    }


}
