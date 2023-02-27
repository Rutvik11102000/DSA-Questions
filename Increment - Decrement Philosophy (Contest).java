import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static int max(int arr[], int n){
int x = arr[0];
Arrays.sort(arr);
for(int i=0; i<n; i++){
if(arr[i]> x){
x += (arr[i] - x+1)/2;
}
}
return x;
}
public static void main (String[] args) {
// Your code here
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
int arr[] = new int[n];
for(int i=0; i<n; i++){
arr[i]= scn.nextInt();
}
System.out.println(max(arr,n));
}
}
