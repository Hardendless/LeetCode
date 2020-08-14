package com.wang.easy;

import com.wang.easy.pojo.ListNode;

public class t22_链表中倒数第k个节点 {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.add(2);
        head.add(3);
        head.add(4);
        head.add(5);

        int k = 2;

        ListNode kthFromEnd = getKthFromEnd(head, k);

        kthFromEnd.print();


    }

    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode former = head;
        ListNode later = head;

        for (int i = 0; i < k; i++) {
            former = former.next;
        }

        while (former != null) {
            former = former.next;
            later = later.next;

        }

        return later;
    }
}
