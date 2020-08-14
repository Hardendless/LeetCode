package com.wang.easy;

import com.wang.easy.pojo.ListNode;

public class t25_合并两个排序的链表 {

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        node1.add(2);
        node1.add(4);

        ListNode node2 = new ListNode(1);
        node2.add(3);
        node2.add(4);

        ListNode listNode = mergeTwoLists(node1, node2);
        listNode.print();

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){

        int i = 1;
        ListNode listNode = new ListNode(l1.val);
        while (l1 != null && l2 != null){
            if (l1.val > l2.val){
                listNode.add(l2.val);
                l2 = l2.next;
            }
            else {
                if (i == 1){
                    l1 = l1.next;
                    i++;
                }
                else {

                    listNode.add(l1.val);
                    l1 = l1.next;
                    i++;
                }
            }
        }

        return listNode;
    }
}
