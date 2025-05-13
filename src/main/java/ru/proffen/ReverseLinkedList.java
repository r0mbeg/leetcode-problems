package ru.proffen;

import java.util.List;

public class ReverseLinkedList {

    public static class ListNode {
        Long val;
        ListNode next;
        ListNode() {}
        ListNode(long val) { this.val = val; }
        ListNode(long val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder();
            result.append('[').append(val);
            while (next != null) {
                result.append("->").append(next.val);
                next = next.next;
            }
            next = new ListNode(val);
            return result.append(']').toString();
        }





    }
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode nextTemp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);



        System.out.println(reverseList(node1));
    }
}
