import resource.ListNode;

public class RemoveNthNode {


    /**
     * Removes nth node from end
     *
     * Uses fast pointer to traverses the linkedlist to n-1 steps
     * Using slow pointer to reach the point before nth node from end till fast pointer reaches the end
     * Slow pointer will reach the correct node since the distance from the fast to end will equal the index of the node
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) {
            return head;
        }

        ListNode fast = head;
        ListNode slow = head;

        while(n>1){
            fast = fast.next;
            n--;
        }

        ListNode temp = null;
        while(fast.next!=null){
            fast = fast.next;
            temp = slow;
            slow = slow.next;
        }

        if(temp==null){
            return slow.next;
        }

        temp.next = slow.next;

        return head;

    }
}
