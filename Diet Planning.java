import java.io.*; // for handling input/output

import java.util.*; // contains Collections framework


 

// don't change the name of this class

// you can add inner classes if needed

class Main {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[7];

        for(int i = 0; i < 7; i++) {

            arr[i] = sc.nextInt();

        }


 

        String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int k = 0;

        while(n > 0) {

            n = n - arr[(k % 7)];

            k++;

        }


 

        k = k - 1;


 

        System.out.print(days[k % 7]);

    }

}
