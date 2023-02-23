import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while(testCase != 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            for(int i=0;i<n;i++){
                int witdrawAmt = sc.nextInt();
                if(witdrawAmt <= k){
                    System.out.print(1);
                    k = k - witdrawAmt;
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
            testCase--;
        }
    }
}