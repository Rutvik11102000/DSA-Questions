import java.io.*; // for handling input/output

import java.util.*; // contains Collections framework

// don't change the name of this class

// you can add inner classes if needed

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }

        Arrays.sort(arr);

        int q = sc.nextInt();

        while (q-- > 0) {

            int left = sc.nextInt();

            int right = sc.nextInt();

            int ans = fastSearch(arr, n, left, right);

            System.out.print(ans + " ");

        }

    }

    public static int fastSearch(int arr[], int n, int left, int right) {

        return rightSide(arr, n, right) - leftSide(arr, n, left) + 1;

    }

    public static int rightSide(int arr[], int n, int right) {

        int low = 0;

        int high = n - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] <= right) {

                low = mid + 1;

            }

            else {

                high = mid - 1;

            }

        }

        return high;

    }

    public static int leftSide(int arr[], int n, int left) {

        int low = 0;

        int high = n - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] >= left) {

                high = mid - 1;

            }

            else {

                low = mid + 1;

            }

        }

        return low;

    }

}
