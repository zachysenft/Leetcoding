class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max = 0;
        int curMax = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                curMax += 1;
            }
            if(nums[i] != 1) {
                if(curMax > max) {
                    max = curMax;
                }
                curMax = 0;
            }
        }
        return Math.max(max, curMax);
    }
}