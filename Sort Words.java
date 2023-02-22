/*
Sort Words
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a sentence, your task is to print the sentence with its words present in a sorted manner.
For eg:- The sentence:- "i am a rockstar developer" will be printed as "a am developer i rockstar"
Input
The Input contains only a sentence.

Constraints:-
Total characters present in the sentence will be less than equal to 1000

Note:- The sentence will contain only lowercase English letters.
Output
Print the given sentence with the words present in the sorted order.
Example
Sample Input:-
i am a rockstar developer

Sample Output:-
a am developer i rockstar
*/



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        Arrays.sort(words);
        StringBuilder output = new StringBuilder();
        for (String word : words) {
            output.append(word + " ");
        }
        System.out.println(output);
    }
}