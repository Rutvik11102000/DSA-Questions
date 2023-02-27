import java.io.*; // for handling input/output

import java.util.*; // contains Collections framework


 

// don't change the name of this class

// you can add inner classes if needed

public class Main {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine().trim());

        

        int count = countNumbers(n, 0, false, false, false);

        System.out.println(count);

    }


 

    public static int countNumbers(long n, long x, boolean three, boolean four, boolean five) {

        if(x > n) {

            return 0;

        }

        int count = 0;

        if(three && four && five) {

            count++;

        }


 

        count += countNumbers(n, x * 10 + 3, true, four, five);

        count += countNumbers(n, x * 10 + 4, three, true, five);

        count += countNumbers(n, x * 10 + 5, three, four, true);

        return count;

    }

}
