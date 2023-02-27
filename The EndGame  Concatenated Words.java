/*
 * The EndGame : Concatenated Words
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of strings words (without duplicates), return all the concatenated words in the given list of words.
A concatenated word is defined as a string that is comprised entirely of at least two shorter words in the
given array.
Input
The first line contains integer N denoting the length of the array
Second- line contains N space-separated strings (words)

Constraints:-
1 <= N <= 15
1 <= words[i]. length <= 20
words[i] consists of only lowercase English letters.
0 <= sum(words[i]. length) <= 105
Output
Print the concatenated words ;
Note:- If there are no concatenating words then print -1
Example
Sample Input:-
8
cat cats catsdogcats dog dogcatsdog hippopotamuses rat ratcatdogcat

Sample Output:-
catsdogcats dogcatsdog ratcatdogcat

Explanation :
catsdogcats can be concatenated by cats, dog and cats.
dogcatsdog can be concatenated by dog, cats and dog.
ratcatdogcat can be concatenated by rat, cat, dog and cat.

Sample Input:-
3
cat dog catdog

Sample Output:
catdog
 */




 import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args)throws Exception{

    BufferedReader bu= new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb=new StringBuilder();
    int n=Integer.parseInt(bu.readLine());
    String s[]=bu.readLine().split(" ");
    Set<String>set=new HashSet(Arrays.asList(s));
    ArrayList<String>ans=new ArrayList<>();
    for(String x:s){
        set.remove(x);
        if(dfs(x, set, "")) ans.add(x);
        set.add(x);
    }
    if(ans.size()==0) sb.append("-1");
    else for(String x:ans) sb.append(x+" ");
    System.out.println(sb);
        // Your code here

    }
    static boolean dfs(String w, Set<String> set, String p){
        if(!p.equals(""))set.add(p);
        if(set.contains(w))return true;
        for(int i=1; i<w.length();i++){
            String pre=w.substring(0, i);
            if(set.contains(pre) && dfs(w.substring(i, w.length()), set, p+pre)) return true;
        }
        return false;
    }
}