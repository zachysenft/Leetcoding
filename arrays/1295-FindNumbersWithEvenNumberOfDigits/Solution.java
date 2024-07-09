class Solution {
    public int findNumbers(int[] nums) {
        
        int evens = 0;
        
        int length = nums.length;
        
        for(int i = 0; i < length; i++) {
            if(String.valueOf(nums[i]).length() % 2 == 0) {
                evens++;
            }
        }
        return evens;
    }
}