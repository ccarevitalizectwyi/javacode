package leetcodeSimp;
/*
给你链表的头节点 head ，每?k?个节点一组进行翻转，请你返回修改后的链表。

k 是一个正整数，它的值小于或等于链表的长度。如果节点总数不是?k?的整数倍，那么请将最后剩余的节点保持原有顺序。

你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。

 */
public class FlipListPartly {
    public static void main(String[] args) {

    }
    /*
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||k==1)
            return head;
        ListNode newhead=new ListNode();
        ListNode lastpart=newhead;
        int i;
        ListNode before;
        ListNode after;
        ListNode start;
        ListNode end = null;

        while(true){
            i=1;
            start=before=head;
            if(head==null){
               lastpart.next=null;//返回前将尾节点置空
                return newhead.next;
            }
            head=head.next;
            while(i<k){
                if(head==null){
                    break;
                }
                after=head.next;
                head.next=before;
                end=before=head;
                head=after;
                ++i;
            }
            if(i!=k){
                if(i==1){
                    end=start;//防止i=1是,end未初值化,是实际end的前一个值
                }
                head=start=before=end;
                head=head.next;
                while(i>1){
                    after=head.next;
                    head.next=before;
                    end=before=head;
                    head=after;
                    --i;
                }
                lastpart.next=end;
                start.next=null;
                return newhead.next;
            }
            lastpart.next=end;
            lastpart=start;
        }
    }

    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
      }

     */
    }

