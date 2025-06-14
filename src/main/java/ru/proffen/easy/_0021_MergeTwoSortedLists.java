package ru.proffen.easy;

public class _0021_MergeTwoSortedLists {
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
                result.append(',').append(next.val);
                next = next.next;
            }
            next = new ListNode(val);
            return result.append(']').toString();
        }
    }


    public static void main(String[] args) {

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));


        ListNode sortedList = mergeTwoLists(list1, list2);
        System.out.println(sortedList);
    }


    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(-1);
        ListNode current = result;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        current.next = list1 == null ? list2 : list1;

        return result.next;
    }
}
