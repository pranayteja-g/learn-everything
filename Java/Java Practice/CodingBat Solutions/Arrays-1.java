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
    int [] numl = {nums[nums.length-1],nums[nums.length-1],nums[nums.length-1]};
    return numl;
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

