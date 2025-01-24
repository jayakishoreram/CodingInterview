package com.recursion;

public class SingleLinkedListSwapPair {

     class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode swapPairs(ListNode head) {
        if(null == head || null == head.next){
            return head;
        }
        ListNode fNode = head;
        ListNode sNode = head.next;
        ListNode tNode = head.next.next;
        sNode.next = fNode;
        fNode.next = swapPairs(tNode);
        return sNode;

    }
}
