class Solution {
    public int maxProduct(int[] nums) {
        int ans=nums[0];
        int worst=nums[0];
        int best=nums[0];
        for(int i=1; i<nums.length;i++){
            int v1=nums[i];
            int v2=nums[i]*best;
            int v3=nums[i]*worst;
            best=Math.max(v1,Math.max(v3,v2));
            worst=Math.min(v1,Math.min(v3,v2));
            ans=Math.max(ans,Math.max(best,worst));
        }
        return ans;
    }
}