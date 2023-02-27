/*
 * Sum of the Last K Numbers (Contest)
easy
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer Q representing the number of queries and an integer K. There are two types of queries:
(i) 1 x : Add the number x to the stream
(ii) 2 : Print the sum of last K numbers of the stream. If there are less than K numbers in the stream, print the sum of current stream.
Process all the queries.
Input
First line contains two integers Q and K.
Next Q lines contains the queries.

Constraints
1 <= Q <= 10^5
1 <= x <= 10^5
1 <= K <= Q
There is atleast one query of 2nd type.
Output
For each query of type 2, print the sum of last K numbers of the stream on a new line.
Example
Sample Input 1:
5 2
1 4
2
1 1
1 3
2

Output
4
4

Explanation:
Initial Stream = {}
Add 4. Stream = {4}
Sum of last two elements = 4
Add 1. Stream = {4, 1}
Add 3. Stream = {4, 1, 3}
Sum of last two elements = 4

Sample Input 2:
3 1
1 1
2
2

Output
1
1

Explanation
Initial Stream = {}
Add 1. Stream = {1}
Sum of last element = 1
Sum of last element = 1
 */

 import java.util.*;
class Main {

   public static void main (String[] args) {

       

       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();

       int k = sc.nextInt();

 

       List<Integer> list = new ArrayList<>();

       int summation = 0;

       int result = 0;

       for(int i = 0; i < n * 2; i++) {

           int res = sc.nextInt();

           if(res == 1) {

               int p = sc.nextInt();

               list.add(p);

               i++;

               if(list.size() <= k) {

                   summation = summation + p;

               }

               else{

                   summation = summation - list.get(result);

                   result++;

                   summation = summation + p;

               }

           }

           else {

               i++;

               System.out.println(summation);

           }

       }

   }

}