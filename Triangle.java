/*Triangle
easy
Problem Statement
Sara loves pattern, so this time she wishes to draw a pattern as:-
*****
****
***
**
*
Since Sara does not know how to code, help her to draw this pattern.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Triangle() that takes no parameters.
Output
Print the pattern as shown in the example.
Example
Sample Output:-
*****
****
***
**
*


*/


static void Triangle(){

    int N=5;
    for(int i=N;i>0;i--)
    {
    for(int j=0;j<i;j++)
    {
    System.out.print("*");
    }
    System.out.println();
}
}