package A04_LinkedList;

public class ListNode {
    int val ;
    ListNode next ;

    // constructors
    ListNode(){

    }
    ListNode(int val){
        this.val = val ;
    }
    ListNode(int val, ListNode next){
        this.val = val ;
        this.next = next ;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }
}

