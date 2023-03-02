// You need to return sorted array, not string
// arr: input array
// arrSize: size of array
function sortEvenOdd(arr, arrSize) {
  let oddArray = [];
  let evenArray = [];
  for (let i = 0; i < arrSize; i++) {
    if (arr[i] % 2 == 0)
    evenArray.push(arr[i]);
    else oddArray.push(arr[i]);
  }
  oddArray.sort(function(a,b){return b -a});
  evenArray.sort(function(a,b){return a-b});
  return oddArray.concat(evenArray);
}