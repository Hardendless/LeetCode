package com.wang.easy;

import com.wang.easy.pojo.ListNode;

import java.util.List;

public class t18_删除链表节点 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.add(2);
        l1.add(3);
        ListNode newNode = deleteNode(l1, 2);
        newNode.print();
    }

    public static ListNode deleteNode(ListNode head, int val) {
        if(head.val == val) return head.next;
        ListNode pre = head, cur = head.next;
        while(cur != null && cur.val != val) {
            pre = cur;
            cur = cur.next;
        }
        if(cur != null) pre.next = cur.next;
        return head;
    }
}
