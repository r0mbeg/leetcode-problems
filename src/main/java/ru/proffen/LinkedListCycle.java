package ru.proffen;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public static class ListNode {
        Long val;
        ListNode next;
        ListNode() {}
        ListNode(long val) { this.val = val; }
        ListNode(long val, ListNode next) { this.val = val; this.next = next; }
    }
    public static boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        int size;
        while (head != null) {
            size = set.size();
            set.add(head);
            if (set.size() == size) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        node2.next = node1;

        System.out.println(hasCycle(node1));
    }

}
