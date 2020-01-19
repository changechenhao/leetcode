package com.ch.linked;

/**
 * @Author : chenhao
 * @Date : 2020/1/14 0014 10:15
 */
public class Num143 {

    public void reorderList(ListNode head) {
        if(head == null || head.next == null|| head.next == null){
            return;
        }
        ListNode pre = head;
        ListNode cur = head;
        while (cur.next != null){
            pre = cur;
            cur = cur.next;
        }

        pre.next = null;
        cur.next = head.next;
        head.next = cur;
        reorderList(head.next.next);
    }
}
