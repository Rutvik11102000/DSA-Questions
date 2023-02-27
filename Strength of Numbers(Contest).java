/*
 * Strength of Numbers(Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Bob has a list of N numbers. He defines the strength of a number as the sum of all it's digits. If two numbers have the same sum of digits then the greater number will have more strength. For example : 62 and 143 has the same digit sum = 8, but 143 > 62 so the strength of 143 is higher than 62.

Bob wants to arrange the numbers in a line such that they are in increasing order of their strength.
Input
First line contains N.
Next line contains N space separated integers.

Constraints
1 ≤ N ≤ 105
1 ≤ numbers ≤ 109
Output
Print N space separated integers denoting the required arrangement.
Example
Input:
5
12 7 61 99 21

Output:
12 21 7 61 99

Explanation:
numbers => 12 21 7 61 99
strength => 3 3 7 7 18
 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int strength(int n){
        int sum =0;
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Integer[] nums = new Integer[n];

        for(int i=0;i<n;i++){

            nums [i]=sc.nextInt();

        }

        Arrays.sort(nums,new Comparator<Integer>(){

        public int compare(Integer a,Integer b){

            int sumA = strength(a);

            int sumB = strength(b);

            if(sumA != sumB){

                return sumA- sumB;

            }else{

                return a-b;

            }

        }

        });


 

        for(Integer num : nums){

            System.out.print(num +" ");

        }

        sc.close();

    }

}