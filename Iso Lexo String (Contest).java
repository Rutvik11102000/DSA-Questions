/*
 * Iso Lexo String (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string S find lexicographically minimum isomorphic string of string S.
Two string s and t are said to be isomorphic when the following conditions are satisfied:
> both s and t have equal lengths
> for every i and j one of the following condition holds:
1 - s[i] == s[j] and t[i] == t[j]
2 - s[i] != s[j] and t[i] != t[j]
Input
Input contains a single string S.

Constraints:
1 <= |S| <= 100000
S contains only lowercase english letters.
Output
Print lexicographically minimum isomorphic string of S.
Note - the ouput string should only contain lowercase english letters.
Example
Sample Input
aaaddd

Sample Output
aaabbb

Explanation:
for every i and j if s[i] = s[j] then t[i] = t[j] and if s[i] != s[j] then t[i] != t[j]
aaabb is lexicographically minimum such string.
 */



 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        HashMap<Character , Character> hm = new HashMap<>();
        int n = str.length();
        char ch = 'a';
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i<n; i++){
            char curr = str.charAt(i);
            if(!hm.containsKey(curr)){
                hm.put(curr, ch);
                ch++;
            }
            sb.append(hm.get(curr));
        }
        System.out.print(sb);
    }
}