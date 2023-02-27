/*
 * Basic Calculator
easy
Problem Statement
Calculators are widely used devices nowadays. It makes calculations easier and faster. A simple calculator consists of the following operators:
1. '+': adding two numbers
2. '- ': subtraction
3. '*': multiplying numbers
4. '/': division

You will be given operator '+' or '- ' or '*' or '/' followed by two operands(integers), you need to perform a mathematical operation based on a given operator.

If '/' operator is used, print the integer value after division
Input
User task:
Since this is a functional problem you don't have to worry about the input. You just have to complete the function calculator() which contains operator(any one of given in the constraints), and two operands i.e. two integers.

Constraints:
operators - {+, - , *, /}
1 <= integers <= 10^4
Output
You need to return the result. If '/' operator is used, return the integer value after division.
Example
Sample Input
*
10 15


Sample Output
150

Explanation:
10*15 = 150

Sample Input:
/
15 4

Sample output:
3

Explanation:
15/4 = 3.75; floor(3.75) = 3
 */


 static int calculator(char ch, int a, int b)
    {
        int result = 0;
        if(ch == '+'){
            result = a+b;
        }else if(ch =='*'){
            result = a*b;
        }else if(ch == '-'){
             result = a-b;
        }else{
            result = a/b;
        }
        return result;
        
     }