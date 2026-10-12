class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        int ans=Math.abs(nums[0]);
        for (int i=1;i<nums.length;i++){
            int v2=nums[i];
            max=Math.max(v2,max+v2);
            min=Math.min(v2,min+v2);
            ans = Math.max(ans, Math.max(Math.abs(max), Math.abs(min)));
        }
        return ans;
    }
}