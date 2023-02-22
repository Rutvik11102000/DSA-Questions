/*
 * Reverse alternate K nodes
medium
Problem Statement
Given a linked list consisting of N nodes and an integer K, your task is to reverse every alternate K nodes.

In other words , you have to reverse first k nodes , then skip the next k nodes , then reverse next k nodes and so on .

NOTE: if there are not K nodes to reverse then reverse all the nodes left (See example for better understanding)
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function ReverseAlternateK() that takes head node and K as parameter.

Constraints:
1 <=k<=N<=10000
Output
Return the head of the modified linked list.
Example
Sample Input:-
8 3
1 2 3 4 5 6 7 8

Sample Output:-
3 2 1 4 5 6 8 7

Explanation:
[{1 , 2 ,3 } , {4, 5 , 6} , {7 , 8}]
Reverse 1st segment.
Skip the 2nd segment.
Reverse the 3rd segment.
 */




 /*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/
public static Node ReverseAlternateK(Node head,int k){
    //enter your code here
            Node current = head;
            Node next = null;
            Node prev = null;
            int count = 0;
      
            /* reverse first k nodes of the linked list */
            while (current != null && count < k) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                count++;
            }
      
            /*Now head points to the kth node.  So change next 
             of head to (k+1)th node*/
            if (head != null) {
                head.next = current;
            }
      
            /*We do not want to reverse next k nodes. So move the current 
             pointer to skip next k nodes */
            count = 0;
            while (count < k - 1 && current != null) {
                current = current.next;
                count++;
            }
      
            /*Recursively call for the list starting from current->next.
             And make rest of the list as next of first node */
            if (current != null) {
                current.next = ReverseAlternateK(current.next, k);
            }
      
            /*prev is new head of the input list */
            return prev;
    }