/*
 * Birthday Gift (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Newton being a student of science gifted an nXn matrix to his girlfriend on her birthday and challenge her to solve the matrix. The matrix consists of natural numbers up to 500(1 ≤ n ≤ 500). Newton instructed a few things about matrix to his girlfriend. He said there are two types of symbols on the matrix( L and R ), you need to rotate the matrix 90 degrees to the left for every L symbol and rotate the matrix 90 degrees right for every R symbol. The symbols were only 3 characters in length.
Help Newton's girlfriend to display the final matrix at the end of the complete turns.
Input
The first line consists of one integer n - the size of the matrix.
In the next n lines, you are given n integers, numbers can range from 1 to 500.

Constraints
1 ≤ n ≤ 500
Output
Output the final matrix n X n.

Note You should not print any whitespace or newline if it is not necessary.
Example
Sample input:
2
1 2
3 4
RLR

Sample output:
3 1
4 2

 */




 import java.io.*; // for handling input/output

import java.util.*; // contains Collections framework

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int mat[][] = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                mat[i][j] = sc.nextInt();

            }

        }

        String s = sc.next();
        for (int k = 0; k < s.length(); k++) {

            char ch = s.charAt(k);

            for (int i = 0; i < n; i++) {

                for (int j = i; j < n; j++) {

                    int temp = mat[i][j];

                    mat[i][j] = mat[j][i];

                    mat[j][i] = temp;

                }

            }

            if (ch == 'R') {

                for (int i = 0; i < n; i++) {

                    int low = 0;

                    int high = n - 1;

                    while (low < high) {

                        int temp = mat[i][low];

                        mat[i][low] = mat[i][high];

                        mat[i][high] = temp;

                        low++;

                        high--;
                    }
                }
            }
            if (ch == 'L') {

                for (int i = 0; i < n; i++) {

                    int low = 0;

                    int high = n - 1;

                    while (low < high) {

                        int temp = mat[low][i];

                        mat[low][i] = mat[high][i];

                        mat[high][i] = temp;

                        low++;
                        high--;

                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(mat[i][j] + " ");

            }

            if (i == n - 1)
                break;
            System.out.println();

        }
    }
}