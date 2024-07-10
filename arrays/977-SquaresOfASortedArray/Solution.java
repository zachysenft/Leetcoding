import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        
        //square first in place
        for(int i = 0; i < nums.length; i++) {
            nums[i] = nums[i]*nums[i];
        }
                
        Arrays.sort(nums);
        return nums;
        
    }
}