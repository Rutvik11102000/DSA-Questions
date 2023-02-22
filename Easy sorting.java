/*Easy sorting
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
An array of 5 string is given where each string contains 2 characters, Now you have to sort these strings, like in a dictionary.
Input
Input contains 5 strings of length 2 separated by spaces.
String contains only uppercase English letters.
Output
Print the sorted array.
Example
INPUT :
AS KF ER DD JK

OUTPUT :
AS DD ER JK KF
*/



// You need to return the sorted String array
// Backend code will print the result
// arr: Arrays of 5 strings 
function easySorting(arr)
  {
    // Your code here
    for(let i = 1; i < 5; i++)
    {
        let str = arr[i];
        let j = i-1;
        while(j >= 0 && (arr[j].toString().localeCompare(str)) > 0 )
        {
          arr[j+1] = arr[j];
          j--;
        }
        arr[j+1] = str;
    }
    return arr;
  }