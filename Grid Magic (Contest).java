/*
 * Grid Magic (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a square character grid of side length N (where N is odd). You have to find whether the given grid is magical or not. A grid is said to be magical if it contains the same character on each element in its diagonal. Moreover, all the elements that are not present on the diagonal have to have the same character (which is different than the one on the diagonal).
Input
The first line contains integer N.
Each of the next N lines contain N lowercase English latin characters.

Constraints:
3 <= N <= 500
N is odd.
Output
Print "YES" if the given grid is magical, else print "NO", without the quotes.
Example
Sample Input:
3
aba
bab
aba

Sample Output:
YES

Explaination:
All characters on its diagonal are the same.
All the characters other than the diagonal are same.
The characters on the diagonal and the rest of the grid do not match.
Thus, it is a magical grid.
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
        char arr[][]= new char[n][n];
        Map<Character, Integer>map = new HashMap<>();
        char a = 'A', b= 'A';
        for(int i =0; i<n; i++){
            String str = sc.next().toLowerCase();
            for(int j = 0; j<n; j++){
                arr[i][j]= str.charAt(j);
                if(!map.containsKey(str.charAt(j))){
                    map.put(str.charAt(j),1);
                }
                else{
                    map.put(str.charAt(j),map.get(str.charAt(j)));
                }
            }
            if(i==0){a=str.charAt(i);}
            else if(i==1){b=str.charAt(i);}
        }
        for(int i =1; i<n; i++){
            if(arr[i][i]!=arr[i-1][i-1]){
                System.out.print("NO");
                return;
            }
        }
        if(map.size()==2){
        if(map.get(a)==n){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
    else{
        System.out.println("NO");
    }
    }
}