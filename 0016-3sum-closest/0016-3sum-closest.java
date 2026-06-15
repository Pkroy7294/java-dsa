class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSet = nums[0]+nums[1]+nums[2];
        for(int i = 0; i<nums.length - 1; i++){
            int left = i+1;
            int right = nums.length - 1;
            while(left < right){
                int currentSet = nums[i]+nums[left]+nums[right];
                if(Math.abs(target - currentSet) < Math.abs(target - closestSet)){
                    closestSet = currentSet;
                }
                else if(currentSet < target){
                    left++;
                }
                else if(currentSet > target){
                    right--;
                }
                else
                return currentSet;
            }
        }
        return closestSet;
        
    }
}