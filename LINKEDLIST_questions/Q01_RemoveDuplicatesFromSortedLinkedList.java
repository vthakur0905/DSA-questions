package A04_LinkedList;

// Ques Link -> https://leetcode.com/problems/remove-duplicates-from-sorted-list/

import static A04_LinkedList.ListNode.printLinkedList;

public class Q01_RemoveDuplicatesFromSortedLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        printLinkedList(head) ;
        RemoveDuplicates(head);
        printLinkedList(head) ;


    }

    public static ListNode RemoveDuplicates (ListNode head){
        ListNode node = head ;

        while (node != null && node.next != null){
            if (node.val  != node.next.val ){ // if the next node is not equal to the current node .
                node = node.next ;
            }
            else { // if the node is equal is to current one .
                node.next = node.next.next ;
            }
        }

        return head ;
        // Approach used : just check the current pointer with the next pointer if they are equal then skip to the next one, perform this until you find a unique element and if found then move the current pointer to that one.

    }


}
