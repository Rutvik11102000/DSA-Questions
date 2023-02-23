/*
 * Max Score in Quiz (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Bob participated in N Quizzes. Each quiz consists of M questions. Given an N X M matrix results where results[i][j] = 1 if Bob answered jth question correctly in the ith Quiz.

Each correct answer gives 10 marks and he has the option to select any quiz session for the marks evaluation.

What is the maximum marks Bob can get in a quiz?
Input
First line contains N and M.
Next N lines contain M integers each.

Constraints
1 ≤ N, M ≤ 1000
results[i][j] = 0 or 1
Output
A single integer denotes maximum marks.
Example
Input:
3 4
0 0 1 0
1 0 1 0
1 0 1 1

Output:
30

Explanation:
Bob should choose the 4th Quiz session for evaluation. He answered 3 question correctly so his marks will be 30.
 */


 import java.io.*;
import java.util.*;



public class Main {
     
    public static void main(String[] args) {
        
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        
        int n=Integer.parseInt(in.next());
        int m=Integer.parseInt(in.next());
        int ans=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                int x=Integer.parseInt(in.next());
                count += x;
            }
            ans=Math.max(ans,count);
        }
        ans *= 10;
        out.print(ans);
        out.close();
        
    }

    
    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;
        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void println(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

        public void println(int i) {
            writer.println(i);
        }

    }
}