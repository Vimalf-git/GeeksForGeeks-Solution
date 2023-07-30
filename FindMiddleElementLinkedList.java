/*
Given a singly linked list of N nodes.
The task is to find the middle of the linked list. For example, if the linked list is
1-> 2->3->4->5, then the middle node of the list is 3.
If there are two middle nodes(in case, when N is even), print the second middle element.
For example, if the linked list given is 1->2->3->4->5->6, then the middle node of the list is 4.


Input:
LinkedList: 1->2->3->4->5
Output: 3 
Explanation: 
Middle of linked list is 3.

Input:
LinkedList: 2->4->6->7->5->1
Output: 7 
Explanation: 
Middle of linked list is 7.
*/


class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         Node A=head;
         Node B=head;
         while(A!=null &&A.next!=null){
            
             A=A.next.next;
             B=B.next;
         }
        // int f=parseInt(B);
         return B.data ;
    }
}
