/* Arrays */
/* firstLast6 
Given an array of ints, return true if 6 appears as either the first or last element in the array.
The array will be length 1 or more.
firstLast6([1, 2, 6]) → true */
public boolean firstLast6(int[] nums) {
  int len = nums.length;
  if(nums[0]==6 || nums[nums.length-1]==6){
    return true;
  }
    return false;
}

/* sameFirstLast 
Given an array of ints, return true if the array is length 1 or more,
and the first element and the last element are equal.
sameFirstLast([1, 2, 3]) → false,  sameFirstLast([1, 2, 1]) → true */
public boolean sameFirstLast(int[] nums) {
  int len = nums.length;
  if(len >= 1){
    if(nums[0]==(nums[nums.length-1])){
      return true;
    }
  }
  return false;
}

/* makePi
Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
makePi() → [3, 1, 4] */
public int[] makePi() {
  int []nums = {3,1,4};
  return nums;
}

/* commonEnd
Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
Both arrays will be length 1 or more.
commonEnd([1, 2, 3], [7, 3]) → true,  commonEnd([1, 2, 3], [7, 3, 2]) → false */
public boolean commonEnd(int[] a, int[] b) {
  int lena = a.length;
  int lenb = b.length;
  if(a[0]==b[0] || a[lena-1] == b[lenb-1]){
    return true;
  }
  return false;
}

/* sum3
Given an array of ints length 3, return the sum of all the elements.
sum3([1, 2, 3]) → 6
sum3([5, 11, 2]) → 18 */
public int sum3(int[] nums) {
  int a= 0;
  for(int i=0;i<nums.length;i++){
    a = a +nums[i];
  }
  return a;
}

/*  rotateLeft3
Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
rotateLeft3([1, 2, 3]) → [2, 3, 1]
rotateLeft3([5, 11, 9]) → [11, 9, 5] */
public int[] rotateLeft3(int[] nums) {
  for(int i=0;i<1;i++){
    int j,first;
    first = nums[0]; //stores the first element of the array
    for(j=0;j<nums.length-1;j++){
      nums[j]=nums[j+1]; //shift element of array by one
    }
    nums[j]=first; //first element will be added at the end.
  }
  return nums;
}

/* reverse3
Given an array of ints length 3, return a new array with the elements in reverse order,
so {1, 2, 3} becomes {3, 2, 1}. reverse3([1, 2, 3]) → [3, 2, 1]  */
public int[] reverse3(int[] nums) {
  int n = nums.length;
  int[] b = new int[n]; //creates array of same length as nums
        int j = n; 
        for (int i = 0; i < n; i++) {  //for loop to go through elements of nums array
            b[j - 1] = nums[i]; 
            j = j - 1;
        }
        return b;
}

/*
