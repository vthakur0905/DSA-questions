package A04_LinkedList;

// ques link -> https://leetcode.com/problems/linked-list-cycle-ii/description/

import static A04_LinkedList.ListNode.printLinkedList;



public class Q04_LinkedListCycle2 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node2; // Create a cycle

//        printLinkedList(detectCycle(head));
    }



    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {

                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;

        // approach used -> first detect the cycle using fast and slow pointer approach, then reset the slow to head and then start moving them by 1 step. where they meet return the index.
    }
}
