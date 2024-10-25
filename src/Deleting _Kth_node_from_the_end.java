class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedList {
    public ListNode removeKthFromEnd(ListNode head, int k) {
        // Step 1: Calculate the length of the linked list
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        // Step 2: Determine the position to delete from the start
        int positionFromStart = length - k;

        // Edge case: if we need to delete the head node
        if (positionFromStart == 0) {
            return head.next;
        }

        // Step 3: Traverse to the node before the target node
        temp = head;
        for (int i = 1; i < positionFromStart; i++) {
            temp = temp.next;
        }

        // Step 4: Delete the target node
        if (temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }
}
