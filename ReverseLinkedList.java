/*
Given a linked list of N nodes. The task is to reverse this list.

Input:
LinkedList: 1->2->3->4->5->6
Output: 6 5 4 3 2 1
Explanation: After reversing the list, 
elements are 6->5->4->3->2->1.

Input:
LinkedList: 2->7->8->9->10
Output: 10 9 8 7 2
Explanation: After reversing the list,
elements are 10->9->8->7->2.
*/

class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        Node Prev=null;
        Node next;
        while(head!=null){
            next=head.next;
            head.next=Prev; //change direction
            Prev=head;
            head=next;
        }
        return Prev;
    }
}
