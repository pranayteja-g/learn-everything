/* Arrays */
/* firstLast6 
Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
firstLast6([1, 2, 6]) → true */
public boolean firstLast6(int[] nums) {
  int len = nums.length;
  if(nums[0]==6 || nums[nums.length-1]==6){
    return true;
  }
    return false;
}

/* sameFirstLast 
Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
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
Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
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

/* maxEnd3
Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value.
Return the changed array.
maxEnd3([1, 2, 3]) → [3, 3, 3] */
public int[] maxEnd3(int[] nums) {
  /* ------using loops----
  if(nums[0]>nums[nums.length-1]){
    for(int i=0;i<nums.length;i++){
      nums[i] = nums[0];
    }
  }else if(nums[nums.length-1] > nums[0]){
     for(int j=0;j<nums.length;j++){
      nums[j] = nums[nums.length-1];
    }
  }if(nums[0] == nums[nums.length-1]){
    int [] numb = {nums[0],nums[0],nums[0]};
    return numb;
  }
  return nums; */
   if(nums[0] == nums[nums.length-1] || nums[0]>nums[nums.length-1]){
    int [] numb = {nums[0],nums[0],nums[0]};
    return numb;
  }
  else if(nums[nums.length-1] > nums[0]){
    nums[0] = nums[nums.length-1];
    nums[1] = nums[nums.length-1];
    nums[2] = nums[nums.length-1];
  }
  return nums;
}

/*  sum2
Given an array of ints, return the sum of the first 2 elements in the array.
If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
sum2([1, 2, 3]) → 3, sum2([1, 1]) → 2 */
public int sum2(int[] nums) {
  int len = nums.length;
  if(len >= 2){
    return nums[0]+nums[1];
  }else if(len == 0){
    return 0;
  }
  return nums[len-1];
}

/* middleWay
Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
middleWay([1, 2, 3], [4, 5, 6]) → [2, 5] */
public int[] middleWay(int[] a, int[] b) {
  int []c = {a[1],b[1]};
  return c;
}

/* makeEnds
Given an array of ints, return a new array length 2 containing the first and last elements from the original array.
The original array will be length 1 or more. makeEnds([1, 2, 3]) → [1, 3] */
public int[] makeEnds(int[] nums) {
  int [] a = {nums[0],nums[nums.length-1]};
  return a;
}

/* has23
Given an int array length 2, return true if it contains a 2 or a 3.
has23([2, 5]) → true */
public boolean has23(int[] nums) {
 for(int i=0;i<nums.length;i++){
    if(nums[i]==2 || nums[i]==3){
      return true;
    }
 }
 return false;
}

/* no23
Given an int array length 2, return true if it does not contain a 2 or 3.
no23([4, 5]) → true */
public boolean no23(int[] nums) {
  for(int i=0;i<nums.length;i++){
    if(nums[i]==2 || nums[i]==3){
      return false;
    }
 }
 return true;
}

/* makeLast
Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0.
makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6] */
public int[] makeLast(int[] nums) {
  int len = nums.length;
  int [] a = new int[2*len];
  a[a.length-1] = nums[len-1];
  return a;
}

/* double23
Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
double23([2, 2]) → true, double23([3, 3]) → true */
public boolean double23(int[] nums) {
  int len = nums.length;
  if(len == 2){
    for(int i=0;i<len;i++){
      if(nums[i]==2 && nums[i+1]==2){
        return true;
      }
      return (nums[i]==3 && nums[i+1]==3);
  }
  }
  return false;
}

/* fix23
Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.
fix23([1, 2, 3]) → [1, 2, 0] */
public int[] fix23(int[] nums) {
  int len = nums.length;
  for(int i=0;i<len;i++){
    if(nums[i]==2 && nums[i+1]==3){
      nums[i+1] = 0;
    }
  }
  return nums;
}

/* start1
Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
start1([1, 2, 3], [1, 3]) → 2 */
public int start1(int[] a, int[] b) {
  int one = 0;
  if(a.length>=1 && a[0] == 1 ){
    one += 1;
  }
  if(b.length >=1 && b[0] == 1){
    one += 1;
  }
  return one;
}


/* biggerTwo
Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum.
In event of a tie, return a. biggerTwo([1, 2], [3, 4]) → [3, 4] */
public int[] biggerTwo(int[] a, int[] b) {
  int sa =0;
  int sb =0;
  int len = a.length;
  for(int i=0;i<1;i++){
    sa = a[i]+a[i+1];
    sb = b[i]+b[i+1];
  }
  int diff = sa - sb;
  if(sa == sb || diff >0){
    return a;
  }
    return b;
}

/* makeMiddle
Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array.
The original array will be length 2 or more. makeMiddle([1, 2, 3, 4]) → [2, 3] */
public int[] makeMiddle(int[] nums) {
  int half = nums.length/2;
  int []a = new int[2];
  a[0] = nums[half-1];
  a[1] = nums[half];
  return a;
}

/*plusTwo
Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4], plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2] */
public int[] plusTwo(int[] a, int[] b) {
  int []c = {a[0],a[1],b[0],b[1]};
  return c;
}

/* swapEnds
Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.
swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1] */
public int[] swapEnds(int[] nums) {
  int []temp = {nums[0],nums[nums.length-1]};
  nums[0] = temp[1];
  nums[nums.length-1] = temp[0];
  return nums;
}

/*  midThree
Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.
midThree([1, 2, 3, 4, 5]) → [2, 3, 4] */
public int[] midThree(int[] nums) {
  int len = nums.length;
  int []a = new int[3];
  a[0] = nums[(len/2)-1];
  a[1] = nums[len/2];
  a[2] = nums[(len/2)+1];
  return a;
}
