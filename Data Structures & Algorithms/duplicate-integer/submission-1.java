class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            for(int c = i+1; c < nums.length; c++){
                if(nums[i] == nums[c]) return true;
            }
        }
        return false;
    }
}