/*
 * Lucky Boys
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There are n boys and m toys. Your task is to distribute the toys so that as many boys as possible will get a toy.
Each boy has a desired toy size, and they will accept any toy whose size is close enough to the desired size.
So if the desired toy size of a particular boy is 'a' and a particular toy has size 'b', then boy will only accept the toy if |b-a| <= k.
Input
The first input line has three integers n, m, and k: the number of boys, the number of toys, and the maximum allowed difference.

The next line contains n integers a[1], a[2],…, a[n]: the desired toy size of each boy. If the desired toy size of a boy is x, he will accept any toy whose size is between x−k and x+k.

The last line contains m integers b[1], b[2],…, b[m]: the size of each toy.

Constraints
1 ≤ n,m ≤ 200000
0 ≤ k ≤ 109
1 ≤ a[i],b[i] ≤ 109
Output
Print one integer: the number of boys who will get a toy.
Example
Sample Input
4 3 5
60 45 80 60
30 60 75

Sample Output
2

Explanation: One possible way can give second toy to first boy and third toy to third boy.

Sample Input:
10 10 0
37 62 56 69 34 46 10 86 16 49
50 95 47 43 9 62 83 71 71 7

Sample Output:
1
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
// Your code here
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int m = sc.nextInt();
int k = sc.nextInt();
int boyArray[]= new int[n];
int toyArray[]= new int[m];
for(int i=0; i<n; i++){
boyArray[i]=sc.nextInt();
}
for(int j=0; j<m; j++){
toyArray[j]=sc.nextInt();
}
Arrays.sort(boyArray);
Arrays.sort(toyArray);

        int i=n-1;
        int j=m-1;
        int count=0;
        while(i>=0 && j>=0){
            if(Math.abs(boyArray[i]-toyArray[j])<=k){
                count++;
                i--;
                j--;
            }else if(boyArray[i]>toyArray[j]){
                i--;
            }else{
                j--;
            }
        }
        System.out.print(count);
    }

}
