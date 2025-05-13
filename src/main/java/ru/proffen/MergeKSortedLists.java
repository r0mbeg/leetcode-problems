package ru.proffen;

public class MergeKSortedLists {

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

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        tail.next = (l1 == null) ? l2 : l1;

        return dummyHead.next;
    }

    public static ListNode mergeKLists(ListNode[] lists) {

        if (lists.length == 0) {
            return null;
        }

        ListNode res = new ListNode();

        for (int i = 0; i < lists.length; i++) {
            if (res.val == null) {
                res = lists[i];
            } else {
                res = mergeTwoLists(res, lists[i]);
            }

        }

        return res;
    }

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(5)));
        ListNode list2 = new ListNode(2, new ListNode(4, new ListNode(6)));

        ListNode[] lists = {list1, list2};


        ListNode sort = mergeKLists(lists);

        printList(sort);


    }
}
