/*
 * Frequency Sort
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array A[] of integers, sort the array according to frequency of elements. That is elements that have higher frequency come first. If frequencies of two elements are same, then smaller number comes first.
Input
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows. The first line of each test case contains a single integer N denoting the size of an array. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤105
1 ≤A[i] ≤ 104

The Sum of N over all test cases does not exceed 2*105
Output
For each testcase, in a new line, print each sorted array in a separate line. For each array its numbers should be separated by space.
Example
Sample Input:
2
5
5 5 4 6 4
5
9 9 9 2 5

Sample Output:
4 4 5 5 6
9 9 9 2 5

Explanation:
Test Case 1: The highest frequency here is 2. Both 5 and 4 have that frequency. Now since the frequencies are the same then smaller element comes first. So 4 4 comes first then comes 5 5. Finally comes 6.
The output is 4 4 5 5 6.

Test Case2: The highest frequency here is 3. The element 9 has the highest frequency. So 9 9 9 comes first. Now both 2 and 5 have same frequency. So we print smaller element first.
The output is 9 9 9 2 5.

 */


 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while(tc-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i<arr.length ; i++){
                arr[i] = sc.nextInt();
            }
            
            HashMap <Integer , Integer> hm = new HashMap<>();

            for(int num : arr){
                hm.put(num , hm.getOrDefault(num , 0)+1);
            }

            List <Integer>[] bucket = new List[n];
            for(int key : hm.keySet()){
                int freq = hm.get(key);
                if(bucket [freq-1] == null){
                    bucket[freq-1] = new ArrayList <>();
                }
                bucket[freq-1].add(key);
            }

            StringBuilder res = new StringBuilder();
            for(int i = n-1 ; i>=0; i--){
                if(bucket[i] != null){
                    Collections.sort(bucket[i]);
                    for(int num : bucket[i]){
                        for(int j = 0 ;j<hm.get(num) ; j++){
                            res.append(num).append(" ");
                        }
                    }
                }
            }

            System.out.println(res.toString().trim());
        }
        sc.close();
    }
}