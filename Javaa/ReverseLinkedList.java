class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}

public class ReverseLinkedList {

    public static ListNode reverse(ListNode head){

        ListNode prev=null;

        while(head!=null){
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }

        return prev;
    }
}