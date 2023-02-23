/*
 * Stack operations
easy
Problem Statement
Given a stack of integers and N queries. Your task is to perform these operations:-
push:-this operation will add an element to your current stack.
pop:-remove the element that is on top
top:-print the element which is currently on top of stack

Note:-if the stack is already empty then the pop operation will do nothing and 0 will be printed as a top element of the stack if it is empty.
Input
User task:
Since this will be a functional problem, you don't have to take input. You just have to complete the functions:
push():- that takes the stack and the integer to be added as a parameter.
pop():- that takes the stack as parameter.
top() :- that takes the stack as parameter.

Constraints:
1 ≤ N ≤ 103
Output
You don't need to print anything else other than in top function in which you require to print the topmost element of your stack in a new line, if the stack is empty you just need to print 0.
Example
Input:
7
push 1
push 2
top
pop
top
pop
top

Output:
2
1
0

 */



 public static void push(Stack<Integer> st, int x)
    {
        // your code here
        st.push(x);
    }

    // Function to pop element from stack
    public static void pop(Stack<Integer> st)
    {
        //your code here
        if(!st.empty()){
            st.pop();
        }
    }

    public static void top(Stack<Integer> st)
    {
        // your code here
        if(!st.empty()){
            System.out.println(st.peek());
        }
        else{
            System.out.println(0);
        }
    }