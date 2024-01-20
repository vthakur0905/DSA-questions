package A04_LinkedList;

// question link = https://leetcode.com/problems/merge-two-sorted-lists/


import static A04_LinkedList.ListNode.printLinkedList;

public class Q02_MergeTwoSortedLL {
    public static void main(String[] args) {
        ListNode ll1 = new ListNode(1);
        ll1.next = new ListNode(2);
        ll1.next.next = new ListNode(3);
        ll1.next.next.next = new ListNode(5);
        ll1.next.next.next.next = new ListNode(7);

        ListNode ll2 = new ListNode(2);
        ll2.next = new ListNode(3);
        ll2.next.next = new ListNode(5);
        ll2.next.next.next = new ListNode(6);
        ll2.next.next.next.next = new ListNode(8);

        System.out.println("LinkedList ll1:");
        printLinkedList(ll1);

        System.out.println("\nLinkedList ll2:");
        printLinkedList(ll2);

        System.out.println("merged linkedlist");
        printLinkedList(Merge(ll1, ll2));


    }

    public static ListNode Merge(ListNode list1, ListNode list2 ){

        ListNode ans = new ListNode() ;
        ListNode current = ans ;

        while ( list1 != null && list2 != null){

            if (list1.val <= list2.val){
                current.next = list1 ;
                list1 = list1.next ;
                current = current.next ;
            }
            else{
                current.next = list2 ;
                list2 = list2.next ;
                current = current.next ;
            }

            current.next = (list1 != null ) ? list1 : list2 ;
        }

        return ans.next ;

//        Approach used  -> create new ll, then start comparing the elements of list1 and list2 and whichever is the smaller, assign it to the new ll. at last shift the remaining items.
    }
}
