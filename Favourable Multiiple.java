import java.io.*; // for handling input/output

import java.util.*; // contains Collections framework


 

// don't change the name of this class

// you can add inner classes if needed

class Main {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 5;

        int b = 7;

        int c = 11;

        for(int i = n; i >= 5; i--) {

            if(i % a == 0 || i % b == 0 || i % c == 0) {

                System.out.print(i);

                break;

            }

        }

    }

}

