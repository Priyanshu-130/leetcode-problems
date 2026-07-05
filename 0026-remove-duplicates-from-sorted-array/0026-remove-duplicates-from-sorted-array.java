class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int cm=1;
        int off=0;   
        while (cm<nums.length){
            if(nums[cm]==nums[cm-1]){
                cm++;
            }
            else{nums[off+1]=nums[cm];
            cm++;
            off++;
            count++;
            }
        }
        return count;
    }
}