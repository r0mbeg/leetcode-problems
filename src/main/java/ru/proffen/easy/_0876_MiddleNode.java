package ru.proffen.easy;

public class _0876_MiddleNode {

    public static class ListNode {
        Long val;
        ListNode next;

        ListNode() {
        }

        ListNode(long val) {
            this.val = val;
        }

        ListNode(long val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode next = head;
        while (next != null) {
            length++;
            next = next.next;
        }
        for (int i = 0; i < length / 2; i++) {
            head = head.next;
        }
        return head;
    }
}
