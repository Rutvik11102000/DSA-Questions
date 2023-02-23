/*
 * Duplicates at a distance k
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of N integers that may contain duplicate elements and an integer K, find if there exists a pair of integers (i, j) such that i < j and arr[i]=arr[j] and i and j are exactly k distance apart i.e ( j - i ) = k.
Input
The first line of input contains two integers N and K, next line contains N space-separated integers.

Constraints:-
1 < = N < = 105
1 < = K < = N
1 < = Arr[i] < = 109
Output
Print 1 if there exist elements else print 0.
Example
Sample Input:
4 3
1 2 2 1

Sample Output:
1

Explanation:-
Pair at index 1, 4 is the required answer so output=1
 */



 import java.io.*;
import java.util.*;
class Main {
public static void main (String[] args) throws Exception{
InputStreamReader br=new InputStreamReader(System.in);
BufferedReader b=new BufferedReader(br);
String s1[]=b.readLine().split(" ");
int n=Integer.parseInt(s1[0]);
int k=Integer.parseInt(s1[1]);
int a[]=new int[n];
HashMap<Integer,Integer> map=new HashMap<>();
String s2[]=b.readLine().split(" ");
int ans=0;
for(int i=0;i<n;i++){
a[i]=Integer.parseInt(s2[i]);
if(map.containsKey(a[i])){
if(i-map.get(a[i])==k){
ans=1;
}
else if(i-map.get(a[i])>k){
map.put(a[i],i);
}
}
else{
map.put(a[i],i);
}
}
for(int i=0;i<n;i++){
}
System.out.println(ans);
}
}