import resource.ListNode;

public class ReverseList {

    /**
     * Reverses a LinkedList
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while(head!=null){
            ListNode nextHead = head.next;
            head.next = newHead;
            newHead = head;
            head = nextHead;
        }
        return newHead;
    }
}
