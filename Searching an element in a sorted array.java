/*
 * Searching an element in a sorted array
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a sorted array arr[] of N integers and a number K is given. The task is to check if the element K is present in the array or not.
Note: Use binary search to solve the problem
Input
The first line of input contains a number of test cases T. For each test case, the first line of input contains a number of elements in the array, and the number K is separated by space. The next line contains N elements.

Constraints:
1 ≤ T ≤ 10
1 ≤ N ≤ 105
1 ≤ K ≤ 109
1 ≤ arr[i] ≤ 109

Sum of N over all test cases doesn't exceed 106
Output
If the element is present in the array print "1" else print "-1".
Example
Sample Input:
2
5 6
1 2 3 4 6
5 2
1 3 4 5 6

Sample Output:
1
-1
 */



 static int isPresent(long arr[], int n, long k)
{
	//Scanner sc = new Scanner(System.in);
	//int T = sc.nextInt();
	//int result = 0;
	
		/*for (int i =0; i<n; i++) {
			arr[i] = sc.nextLong();	
		}*/
		boolean flag = false;
		int LE =0; //left index
		int RE = n-1; // right index
		while (LE<=RE) {
			int mid = (LE+RE)/2;
			if (arr[mid]==k) {
				flag = true;
				break;
			} 
			else if (arr[mid] < k){
				LE = mid+1;
			} 
			else if (arr[mid] > k) {
				RE = mid-1;
			}	
		}
		if (flag == true) {
			return 1;
		} else 
			return -1;
		
		
	 
}