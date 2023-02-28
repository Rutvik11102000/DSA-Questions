/*
 * Fruit Market (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You have N kilograms of fruits with you and M types of polybags to put the fruits into. The holding capacity of the ith polybag is pi. Find the minimum number of polybags required to carry all N kilograms of fruits.
Input
The first line contains two integers N and M.
The second line contains M space-separated integers.

Constraints:
1 ≤ N ≤ 1012
1 ≤ M ≤ 105
1 ≤ pi ≤ 108
Output
Print the minimum number of polybags required to carry all N-kilograms of fruits.
Example
Sample Input:
10 4
4 9 8 2

Sample Output:
2

Explaination:
We can carry fruits in polybag 1 and polybag 3. This will give us a total capacity of 4 + 8 = 12 kilograms which is more than that required to carry the fruits.

 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int m=sc.nextInt();
        int [] capacities=new int[m];
        for(int i=0;i<m;i++)
        {
            capacities[i]=sc.nextInt();
        }
        Arrays.sort(capacities);
        int numOfBags=0;
        for(int i=m-1;i>=0;i--){
            if(n<=0)
            {
                break;
            }
            numOfBags++;
            n-=capacities[i];
        }
        System.out.println(numOfBags);
    }
}
