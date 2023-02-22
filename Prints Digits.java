/* 
Print Digits
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a natural number N, your task is to print all the digits of the number in English words. The words have to separate by space and in lowercase English letters.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Print_Digit() that takes integer N as a parameter.

Constraints:-
1 ≤ N ≤ 107
Output
Print the digits of the number as shown in the example.
Note:-
Print all digits in lowercase English letters
Example
Sample Input:-
1024

Sample Output:-
one zero two four

Sample Input:-
2

Sample Output:-
two
*/


static void Print_Digits(int N){
    String ans="";
    while(N>0){
        int p=N%10;
        if(p==0){
            ans="zero "+ans;
        }
        else if(p==1){
            ans="one "+ans;
        }
        else if(p==2){
            ans="two "+ans;
        }
        else if(p==3){
            ans="three "+ans;
        }
        else if(p==4){
            ans="four "+ans;
        }
        else if(p==5){
            ans="five "+ans;
        }
        else if(p==6){
            ans="six "+ans;
        }
        else if(p==7){
            ans="seven "+ans;
        }
        else if(p==8){
            ans="eight "+ans;
        }
        else if(p==9)
            ans="nine "+ans;
            N=N/10;
        }
        System.out.println(ans);
    
    }