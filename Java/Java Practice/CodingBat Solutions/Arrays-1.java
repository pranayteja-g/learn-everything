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
