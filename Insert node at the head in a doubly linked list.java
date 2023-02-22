/*
 * Insert node at the head in a doubly linked list
easy
Problem Statement
You are given a Doubly linked list and an integer K . Your task is to insert the integer K at the head of the given linked list
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function insertnew() that takes the head node and the integer K as a parameter.

Constraints:
1 <=N<= 1000
1 <=K, value<= 1000
Output
Return the head of the modified linked list
Example
Sample Input:-
5 2
1 2 3 4 5

Sample Output:
2 1 2 3 4 5
 */




/*

class Node {
    Node next;
    Node prev;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
}
*/



public static Node insertnew(Node head, int new_data) {
    //enter your code here
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    
        return head;
    }