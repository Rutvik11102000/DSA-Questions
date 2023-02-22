/*
Door problem
hard
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There is a door at Newton School that can be used only by one person at a time i. e either a person can enter from the door or exit but no two people can do it simultaneously. If two people going in the opposite direction arrived at the door at the same time then these 3 cases should be considered:-
1. If the door was not used before or it was not used in the previous second then the person who wants to exit goes first.
2. If the door has been used in the previous second for entering, then the person who wants to enter goes first.
3. If the door has been used in the previous second for exiting, then the person who wants to exist goes first.

If two people arrive at the same time and go in the same direction then the person whose name in the given list comes first will go first.

Note:- To cross the door, it will take exactly one second for each person.
Input
The first line of input contains a single integer N containing the number of people The second line of input contains N space-separated integers depicting the arrival time of the ith person. The last line of input containing N space-separated integers which are either 0 or 1. 0 indicates that the person wants to enter and 1 indicates he wants to exit.

Constraints:-
1 ≤ N ≤ 50000
0 ≤ Arrival[i] ≤ Arrival [i+1] ≤ 109
Output
Print N space-separated integers denoting the time at which the ith person will cross the door.
Example
Sample Input 1:-
4
0 0 1 5
0 1 1 0

Sample Output 1:-
2 0 1 5


Sample Input 2:-
5
0 1 1 3 3
0 1 0 0 1

Sample Output 2:-
0 2 1 4 3

Explanation:-
At t = 0:- the first and the second person wants to enter and exit. As per the case, 1 2nd person will go first.
At t=1, the first and the 3rd person wants to enter and exit. As per case 3, the 3rd person goes first.
At t= 2, only 1st is the only person standing so he goes.
At t = 3, and 4 no one wants to cross
At t = 5, the 4th person is the only one who wants to cross.
*/



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] time = new int[n];
        int[] direction = new int[n];
        List<Map<Integer, Integer>> entryList = new ArrayList();
        List<Map<Integer, Integer>> exitList = new ArrayList();
        for(int i=0;i<n;i++){
            time[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            direction[i]=sc.nextInt();
            Map<Integer, Integer> map =new HashMap();
            map.put(time[i],i);
            if(direction[i]==0){
                entryList.add(map);
            }
            else
            {
                exitList.add(map);
            }
        }
        int[] res = new int[n];
        Arrays.fill(res, -1);
        int i=0, j=0, t=0, entryTime=0, exitTime=0;
        boolean prevExit = true;
        while(entryList.size()!= i || exitList.size()!= j)
        {
            int s = 0, e= 0;
            if(entryList.size() == i)
            {
                entryTime = Integer.MAX_VALUE;
            }
            else
            {
                for(Map.Entry<Integer, Integer> entry : entryList.get(i).entrySet()){
                    s = entry.getKey();
                }
                entryTime = s;

            }
            if(exitList.size() == j)
            {
                exitTime = Integer.MAX_VALUE;
            }
            else{
                for(Map.Entry<Integer, Integer> entry : exitList.get(j).entrySet()){
                    e = entry.getKey();
                }
                exitTime = e;
            }
            if(entryTime < t) entryTime = t;
            if(exitTime < t ) exitTime = t;
            if(entryTime == exitTime){
                if(entryTime == t){
                if(prevExit){
                    res[exitList.get(j).get(e)]= exitTime;
                    j++;
                    t= exitTime + 1;
                }
                else{
                    res[entryList.get(i).get(s)] = entryTime;
                    i++;
                    t = entryTime + 1;
                }
            }
            else{
                res[exitList.get(j).get(e)] = exitTime;
                j++;
                t=exitTime +1;
                prevExit = true;
            }
        }
        else{
            if(entryTime < exitTime){
                res[entryList.get(i).get(s)] = entryTime;
                i++;
                t = entryTime + 1;
                prevExit = false;
            }
            else{
                res[exitList.get(j).get(e)] = exitTime;
                j++;
                t = exitTime + 1;
                prevExit = true;
            }
        }
    
        }
    for(int value : res)
        System.out.print(value + " ");
    }
}