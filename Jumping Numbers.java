/*
 * Jumping Numbers
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a positive number X. Find all Jumping Numbers smaller than or equal to X.
Jumping Number: A number is called Jumping Number if all adjacent digits in it differ by only 1. All single-digit numbers are considered as Jumping Numbers. For example 7, 8987 and 4343456 are Jumping numbers but 796 and 89098 are not.
Input
The first line of the input contains T denoting the number of test cases. Each test case contains a positive number N.

Constraints:
1 <= T <= 50
1 <= N <= 10^8
Output
For each test case, print a single line containing all the Jumping numbers less than or equal to N from 1 in increasing order
Example
Sample Input:
2
10
50

Sample Output:
1 2 3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9 10 12 21 23 32 34 43 45

Explanation:
Testcase 2: Here, the most significant digits of each jumping number is following increasing order, i.e., jumping numbers starting from 0, followed by 1, then 2 and so on, themselves being in increasing order 2, 21, 23.
 */


 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) throws IOException {
        // Your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int j=0; j<t; j++){
            int n = Integer.parseInt(br.readLine());
            Queue<Integer> q = new LinkedList<>();
            int i=1;
            while(i<=n){
                if(i>9){
                    break;
                }
                System.out.print(i+" ");
                q.add(i);
                i++;
            }

            int newJumping ;
            while(n>9){
                i = q.remove();
                int lastDigit =  i%10;
                if(lastDigit == 0){
                    newJumping = i*10+1;
                    if(newJumping > n){
                        break;
                    }
                    System.out.print(newJumping+" ");
                    q.add(newJumping);
                }
                else if(lastDigit ==9){
                    newJumping = i*10+8;
                    if(newJumping>n){
                        break;
                    }
                    System.out.print(newJumping+" ");
                    q.add(newJumping);
                }else{
                    newJumping=i*10+(lastDigit-1);
                    if(newJumping > n){
                        break;
                    }
                    System.out.print(newJumping+" ");
                    q.add(newJumping);

                   // newJumping = i*10+(lastDigit+1);
                   // q.add(newJumping);

                    newJumping = i*10+(lastDigit+1);
                    if(newJumping > n){
                        break;
                    }
                    System.out.print(newJumping+" ");
                    q.add(newJumping);
                }

            }
            System.out.println();
        }
    }
}