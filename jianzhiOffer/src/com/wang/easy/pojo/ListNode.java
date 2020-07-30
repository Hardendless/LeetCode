package com.wang.easy.pojo;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int x){
        val = x;
    }

    //添加新的节点
    public void add(int newval){
        ListNode newNode = new ListNode(newval);
        if (this.next == null)
            this.next = newNode;
        else
            this.next.add(newval);
    }

    //打印链表
    public void print(){
        System.out.print(this.val);
        if (this.next != null){
            System.out.print("-->");
            this.next.print();
        }
    }
}
