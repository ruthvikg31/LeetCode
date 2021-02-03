class Solution {
    public int searchInsert(int[] nums, int target) {
       if(target < nums[0]) return 0;
        if(target > nums[nums.length -1]) return nums.length;
        int j =0;
        for(int i=0;i<nums.length;i++){
            if(target == nums[i]){
                j=i;
                break;
            }
            if(nums[i] > target){
                j=i;
                break;
            }
        }
        return j;
    }
}
