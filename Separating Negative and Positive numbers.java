/*
 * 
 * Separating Negative and Positive numbers
easy
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Separate an array of positive and negative integers while maintaining the relative order of the items using merge sort. All positive numbers should come after negative ones, with the relative order remaining the same.
Input
The first line of input will be n, which represents the array's length, followed by the n array items in the second line.

Constraints:
0< n <=100000
1<= arr[i] <= 100000
Output
The result should be an array with negative numbers separated at the front and the relative order of the elements preserved.
Example
Sample Input:
6
-1 1 2 -4 -6 5

Output:
-1 -4 -6 1 2 5

 */




 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.lang.*;

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) throws IOException
    {
        // Your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine().trim());
        long a[]=new long[(int )(n)];
        String inputLine[]=br.readLine().trim().split(" ");
        for(int i = 0; i<n; i++){
            a[i] = Long.parseLong(inputLine[i]);
        }
        Compute obj = new Compute();
        obj.Rearrange(a,n);

        StringBuilder output = new StringBuilder();
        for(int i = 0; i<n; i++)
            output.append(a[i]+" ");

        System.out.println(output);
            
        
    }
}
class Compute{
    public void Rearrange(long a[], long n)
    {
        long temp[]=new long[a.length];
        int countOfNegEle = 0;
        int leftIndex = 0;

        for(long a1:a){
            if(a1<0){
                countOfNegEle++;
            }
        }

        for(long ele:a){
            if(ele<0){
            temp[leftIndex++]=ele;
        }else{
            temp[countOfNegEle++]=ele;
        }

    }
    for(int i=0; i<n; i++){
        a[i]=temp[i];
    }
}
}