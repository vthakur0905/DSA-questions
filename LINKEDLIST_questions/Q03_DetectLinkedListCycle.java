package A04_LinkedList;

import static A04_LinkedList.ListNode.printLinkedList;

public class Q03_DetectLinkedListCycle {
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

        System.out.println(DetectCycle(head)) ;
    }

    public static boolean DetectCycle(ListNode head){
        ListNode s = head ;
        ListNode f = head ;

        int i = 0;

        while (s != null && s.next != null && f != null && f.next != null){
            if ( i != 0) {
                if (s == f) {
                    return true;
                }
            }
            else {
                s = head.next ;
                f = head.next.next ;
                i++ ;
            }

        }
        return false ;

    }
}
