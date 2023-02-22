/*
 * Count unique elements
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array arr of numbers, your task is to count the number of unique elements in it.
Input
The first line of the input contains n (Number of elements). The following line contains the information on the array.
For python users, you have to complete the function.

Constraints
1 ≤ n ≤ 106
1 ≤ arr[i] ≤109
Output
Print the number of unique elements in the array.
For python users return the count of unique elements from the given function.
Example
Sample Input 1
4
1 2 3 3

Sample Output 1
3

Sample Input 2
6
1 1 2 2 3 3

Sample Output 2
3
 */




 #include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int main() {

	// Your code here

    int n;
    cin>>n;
    vector<int> arr(n);
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    sort(arr.begin(),arr.end());
    int i=1,c=1;
    while (i<n){
        if(arr[i]!=arr[i-1]){
            c++;
        }
        i++;
    }
    cout<< c;
    return 0;
}