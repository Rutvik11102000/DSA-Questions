/*
 * Insertion node at kth postition in doubly linked list
hard
asked in interviews by 2 companies
Problem Statement
Given a doubly linked list consisting of N nodes and two integers P and K. Your task is to add an element K at the Pth position from the start of the linked list
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function insertnew(). The description of parameters are mentioned below:

head: head node of the double linked list
K: the element which you have to insert
P: the position at which you have insert

Constraints:
1 <= P <=N <= 1000
1 <=K, Node.data<= 1000

In the sample Input N, P and K are in the order as mentioned below:
N P K
Output
Return the head of the modified linked list.
Example
Sample Input:-
5 3 2
1 3 2 4 5

Sample Output:-
1 3 2 2 4 5
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



public static Node insertnew(Node head, int data ,int position){
    //enter your code here
    position=position-1;
     Node trackedHeadNode = head;
        
         Node nodeToInsert = new Node(data); 
     if(position == 0){nodeToInsert.next = head; 
     return nodeToInsert;}    
        
     int currPosition = 0;
    while (currPosition < position -1 && head.next != null){
            head = head.next;        
            currPosition++;       
        }
    
      
        Node nodeAtPosition = head.next;
        head.next = nodeToInsert;
        head = head.next;
        head.next = nodeAtPosition;
            
        return trackedHeadNode;
    
    }