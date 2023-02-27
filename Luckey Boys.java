import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
// Your code here
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int m = sc.nextInt();
int k = sc.nextInt();
int boyArray[]= new int[n];
int toyArray[]= new int[m];
for(int i=0; i<n; i++){
boyArray[i]=sc.nextInt();
}
for(int j=0; j<m; j++){
toyArray[j]=sc.nextInt();
}
Arrays.sort(boyArray);
Arrays.sort(toyArray);

        int i=n-1;
        int j=m-1;
        int count=0;
        while(i>=0 && j>=0){
            if(Math.abs(boyArray[i]-toyArray[j])<=k){
                count++;
                i--;
                j--;
            }else if(boyArray[i]>toyArray[j]){
                i--;
            }else{
                j--;
            }
        }
        System.out.print(count);
    }

}
