/*
 * First non-repeating character in a String
easy
asked in interviews by 3 companies
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string s, find the first non-repeating character in the string and return its index. If it does not exist, return -1.
Input
First line of the input contains the string s.

Constraints
1<= s. length <= 100000
Output
Print the index of the first non- repeating character in a string
Example
Input
s = "newtonschool"

Output
1

Explanation
"e" is the first non- repeating character in a string

 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc  = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(hm.containsKey(ch)==true){
                int frq  = hm.get(ch);
                hm.put(ch, frq + 1);
            }
            else{
                hm.put(ch, 1);
            }
        }

        int index = -1;
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (hm.get(ch)==1){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}