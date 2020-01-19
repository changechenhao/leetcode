package com.ch.linked;

/**
 * @Author : chenhao
 * @Date : 2020/1/14 0014 9:41
 */
public class Num86 {

    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode first = new ListNode(0);
        ListNode firstHead = first;
        ListNode second = new ListNode(0);
        ListNode secondHead = second;
        ListNode cur = head;
        while (cur != null){
            if(cur.val < x){
                first.next = cur;
                first = first.next;
//                first.next.next = null;
//                first = first.next;
            }else{
                second.next = cur;
                second = second.next;
//                cur = cur.next;
//                second.next.next = null;
//                second = second.next;
            }
            cur = cur.next;


        }

        second.next = null;

        first.next = secondHead.next;

        return firstHead.next;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(4);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(2);
        node.next.next.next.next = new ListNode(5);
        node.next.next.next.next.next = new ListNode(2);
        Num86 num86 = new Num86();
        ListNode partition = num86.partition(node, 3);
        while (partition != null){
            System.out.print(partition.val + "->");
            partition = partition.next;
        }
    }
}
