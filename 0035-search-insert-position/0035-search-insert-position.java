class Solution {
    public int searchInsert(int[] nums, int target) {

        int left = 0;
        while(left <= nums.length-1){
            if(nums[left] == target){
                return left;
            }
            else if(nums[left] > target){
                return left;
            }
            left++;
        }
         return left;
        
    }
}