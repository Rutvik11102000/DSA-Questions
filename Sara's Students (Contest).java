/*
 * Sara's Students (Contest)
medium
Problem Statement
Sara has 2*N chocolate boxes with uneven chocolates in them. She wants to distribute the boxes to N of her students. For each student, Sara will pick one box from the start and one box from the end. Since the chocolates are uneven Sara wants to know the maximum number of chocolates a student received.

The boxes are represented by a singly linked list in which each node represents the number of chocolates in the current box.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function maxChocolates() that takes the head node of the linked list as a parameter.

Constraints:
1 <=N <= 5000
1 <=node.data<= 10000
Output
Print the maximum number of chocolates a student received.
Example
Sample Input:-
5
1 2 3 4 5 3 2 1 4 5

Sample Output:-
8

Explanation:-
Given list:- 1- >2- >3- >4- >5- >3- >2- >1- >4- >5
Student 1 received:- 1 + 5 = 6
Student 2 received:- 2 + 4 = 6
Student 3 received:- 3 + 1 = 4
Student 4 received:- 4 + 2 = 6
Student 5 received:- 5 + 3 = 8

Sample Input:-
2
1 4 2 3

Sample Output:-
6
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
public static int maxChocolates(Node head) {
    //Enter your code here
     Node slow  = head;
     Node fast = head;
      int max =Integer.MIN_VALUE;
      while(fast!= null && fast.next!=null){
          fast = fast.next.next;
          slow  =slow.next;
      }
      slow  = reverseLL(slow);
      fast = head;
      while(slow!=null){
          max = Math.max((slow.val+fast.val),max);
          slow = slow.next;
          fast= fast.next;
      }
      return max;
            
    }
    public static Node reverseLL(Node head){
        Node prev =null;
        Node cur= head;
        while(cur!= null){
            Node temp = cur.next;
            cur.next = prev;
            prev= cur;
            cur= temp;
        }
        head =prev;
        return head;
    }