class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        
        //[0,1,3,0,4,0,4,2], val = 2
        //                 i
        // index=5
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}