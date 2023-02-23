/*
 * 
 K closest points
easy
Problem Statement
Given a point P in a 2- dimensional plane, a number K, and a list of N points on the plane. You need to find the K closest points to the given Point P.
Here, the distance between two points on a plane is the Euclidean distance.

A point in the xy- plane is represented by two numbers, (x, y), where x and y are the coordinates of the x- and y- axes.

Note: The K closest points will be unique.
Input
User Task:
Since this is a functional problem you don't have to worry about the input. You just have to complete the function kNeighbourPoints() which contains following arguments.

points: Arraylist of N points
P: point from where you have to find the K closest points
K: integer value

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 10^4
1 ≤ K ≤ N
-10^5 ≤ P1, P2 ≤ 10^5
Output
For each testcase, you need to return the Arraylist of pair of the K closest points. You may return the answer in any order. The answer is guaranteed to be unique
Example
Sample Input:
2
5 0 0 3
-2 -1
0 0
1 4
-1 0
1 1
4 0 1 2
-2 1
1 2
3 6
9 2

Sample Output:
-1 0
0 0
1 1
-2 1
1 2

Explanation:-
For test case 1:-
Coordinates of given point :- (0, 0).
(-2, -1) is at a distance of √5
(0, 0) is at a distance of 0
(1, 4) is at a distance of √17
(-1, 0) is at a distance of 1
(1, 1) is at a distance of √2
We need 3 closest point so we pick (0, 0), (1, 1), (-1, 0).
 */





 /*
class pair
{
    
    int first;
    int second;
    pair(int f, int s)
    {
        this.first = f;
        this.second = s;
    }
}
*/
public static ArrayList<pair> kNeighbourPoints(ArrayList<pair> points, pair P, int K)
{
        // Your code here
        ArrayList<pair> ans = new ArrayList<>();
        ArrayList<pair1> dist = new ArrayList<>();
        for(int i = 0; i<points.size(); i++){
            long point1=(points.get(i).first-P.first);
            long point2=(points.get(i).second-P.second);
            long val = point1*point1 + point2*point2;
            dist.add(new pair1(val, points.get(i)));
        }

        Collections.sort(dist,new Comparator<pair1>(){
            public int compare(pair1 p1, pair1 p2){
                return p1.third<p2.third? - 1:1;
            }
        });
        for(int i = 0; i<K; i++){
            ans.add(dist.get(i).p);
        }
        return ans;
 }
 static class pair1{
     long third;
     pair p;
     pair1(long t,pair p){


         this.third= t;
         this.p=p;
     }
 }