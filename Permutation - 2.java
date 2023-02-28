/*
 * Permutation - 2
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
A ​ permutation is simply a name for a reordering. So the permutations of the string
‘abc’ are ‘abc’, ‘acb’, ‘bac’, ‘bca’, ‘cab’, and ‘cba’. Note that a sequence is a
permutation of itself (the trivial permutation). For this problem, you’ll need
to write a ​ recursive​ function ​​ that takes a string and returns a
list of all its permutations.
A couple of notes on the requirements:
1. The order of the returned permutations must be lexicographically.
2. Avoid returning duplicates in your final list.
Input
Input contains a single string S.

Constraints:-
1<=|S|<=8
Output
Print all the permutations of string S in lexicographical order.
Example
Sample Input:
ABC

Sample Output :
ABC ACB BAC BCA CAB CBA

Explanation:
all permutation are arranged in lexicographical order .

Sample Input:
(T(

Sample Output:-
((T (T( T((
 */


 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Per_two(s,"");
        for(String str:set){
            System.out.print(str+" ");
        }
    }
    public static TreeSet<String>set = new TreeSet<>();
    public static void Per_two(String str, String res){
        if(str.length()==0){
            set.add(res);
            return;
        }
        for(int j=0; j<str.length(); j++){
            char a=str.charAt(j);
            String resstr=str.substring(0, j)+str.substring(j+1);
            Per_two(resstr, res+a);
        }
    }
}