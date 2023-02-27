import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long t = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        long sum =0;
        for(int i=0; i<n-1; i++){
            
           long temp =  arr[i+1]-arr[i];
           if(temp>t){
               sum +=t;
           }else{
               sum +=temp;
           }
        }
        System.out.println(sum+t);
    }
}