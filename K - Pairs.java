import java.io.*;// for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
// Your code here
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
long k = sc.nextLong();
long[] arr = new long[n];
for(int i = 0; i < n; i++){
arr[i] = sc.nextLong();
}

        Arrays.sort(arr);

        long count = 0;
        int i = 0;
        int j = n-1;

        while(i < j){
            if(arr[i]*arr[j] <= k){
                i++;
            } else{
                count += (j-i);
                j--;
            }
        }

        System.out.print(count);

    }

}
