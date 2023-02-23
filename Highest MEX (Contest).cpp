/*
 * Highest MEX (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
A multi-set S of N integers, along with an integer K, is provided to Geetha. Given that Geetha can only add a maximum of K integers to the multi-set, she needs to determine the MEX, or minimal excluded non-negative integer, of the multi-set. Help her to determine the highest value of MEX she can get. Here are a few examples of finding the MEX of a multi-set. MEX of multi-set {0} is 1, {1} is 0, {0, 1, 3} is 2, {0, 1, 2, 3, 5, 6} is 4.
Input
The first line of the input contains an integer T denoting the number of test cases. The first line of each test case contains two space-separated integers N and K denoting the size of the multi-set and the maximum number of extra integers that you can add to the multi-set respectively. The second line contains N space-separated integers denoting the multi-set S: S1, S2,..... SN.

Constraints
1 ≤ T ≤ 10
1 ≤ N ≤ 105
0 ≤ K ≤ 105
0 ≤ Si ≤ 2x105
Output
For each test case, output the answer in a single line.
Example
Sample Input :
4
3 0
1 0 2
3 1
1 0 2
4 3
2 5 4 9
2 0
3 4
Sample Output :
3
4
6
0
Explanation :
As K = 0, so we can't add any element to the multi-set. Elements of the set are {1, 0, 2}. The MEX value of this set is 3.
As K = 1, you are allowed to add at most 1 element to the multi-set. The multi-set is {1, 0, 2}. You can add element 3 to the multi-set, and it becomes {1, 0, 2, 3}. The MEX value of this multi-set is 4. There is no other way to have a higher value of MEX of the set by adding at most one element to the multi-set.
 */




 #include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int main() {
	// Your code here
    long long t;
    cin>>t;
    while(t--){
        long long n,k;
        cin>>n>>k;
        unordered_set<long long>st;
        for(long long i = 0; i<n; i++){
            long long x;
            cin>>x;
            st.insert(x);
        }
        for(long long i = 0; i<INT_MAX; i++){
            if(st.find(i)==st.end()){
                if(k==0){
                    cout<<i<<endl;
                    break;
                }
                else{
                    k--;
                }
            }
        }
    }
    return 0;
}