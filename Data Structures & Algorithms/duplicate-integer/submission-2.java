class Solution {
    public boolean hasDuplicate(int[] nums) {
        int size = nums.length;
        for(int i = 0; i < size; i++){
            for(int c = i+1; c < size; c++){
                if(nums[i] == nums[c]) return true;
            }
        }
        return false;
    }
}