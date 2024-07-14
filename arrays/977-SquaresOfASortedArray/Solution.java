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

class OptimizedSolution {
    public int[] sortedSquares(int[] nums) {
        
        if(nums.length == 1) {
            nums[0] *= nums[0];
            return nums;
        }
                
        int i = 0;
        int j = nums.length - 1;
        
        int[] ans = new int[nums.length];
        int index = ans.length - 1;
        
        while(i <= j) {
            //i++ case
            if(Math.abs(nums[i]) >= Math.abs(nums[j])) {
                ans[index] = nums[i] *= nums[i];
                i++;
            }
            //j-- case
            else {
                ans[index] = nums[j] *= nums[j];
                j--;
            }
            index--;
        }
        return ans;
    }
}