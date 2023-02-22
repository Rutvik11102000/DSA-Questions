/*
 * Binary tree to double linked list
medium
Problem Statement
Given a Binary Tree, your task is to convert it to a Doubly Linked List. The left and right pointers in nodes are to be used as previous and next pointers respectively in converted Double linked list. The order of nodes in Double linked list must be same as Inorder of the given Binary Tree. The first node of Inorder traversal (left most node in Binary tree) must be head node of the Doubly linked list.
Input
User Task:
Since this will be a functional problem. You don't have to take input. You just have to complete the function BToDLL() that takes "root" node of binary tree as parameter.

Constraint:-
1 <= Number of Nodes <= 1000
1 <= Node.data <= 1000
Output
The printing is done by the driver code you just need to complete the function.
Example
Sample Input:-
3
1 2 3

Sample Output:-
2 1 3

Sample Input:-
5
6 5 4 3 2

Sample Output:-
3 5 2 6 4
 */




/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} 
*/

static Node prev = null;
  

   static void BToDLL(Node root)
    {
    
        if (root == null)
            return;
  

        BToDLL(root.left);
  
        if (prev == null)
            head = root;
        else
        {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
  
    
        BToDLL(root.right);
    }






