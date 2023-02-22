/*
Removing duplicates from lists
Easy

hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
given a list say [a, b, b, b, c], remove duplicates and convert it to a list like [a, b, c], the user would enter any 5 characters which would form a part of the list.
print the list without any duplicates.
hint - you might use sets for this.

note- print the SORTED LIST
Input
a
b
b
b
c
Output
['a', 'b', 'c']
Example
-*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> hs = new HashSet<String>();

        hs.add("'"+sc.next()+"'");
        hs.add("'"+sc.next()+"'");
        hs.add("'"+sc.next()+"'");
        hs.add("'"+sc.next()+"'");
        hs.add("'"+sc.next()+"'");

         // Sorting HashSet using List
        List<String> list = new ArrayList<String>(hs);
        Collections.sort(list);

        System.out.println(list);
  

                      // Your code here
    }
}



//2
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            char c = sc.next().charAt(0);
            list.add(c);
        }
        
        // create a set from the list to remove duplicates
        Set<Character> set = new HashSet<>(list);
        
        // convert the set back to a list and sort it
        List<Character> newList = new ArrayList<>(set);
        Collections.sort(newList);
        
        // print the new list
        System.out.println(newList);
    }
}