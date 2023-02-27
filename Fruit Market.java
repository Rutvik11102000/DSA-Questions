import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int m=sc.nextInt();
        int [] capacities=new int[m];
        for(int i=0;i<m;i++)
        {
            capacities[i]=sc.nextInt();
        }
        Arrays.sort(capacities);
        int numOfBags=0;
        for(int i=m-1;i>=0;i--){
            if(n<=0)
            {
                break;
            }
            numOfBags++;
            n-=capacities[i];
        }
        System.out.println(numOfBags);
    }
}
