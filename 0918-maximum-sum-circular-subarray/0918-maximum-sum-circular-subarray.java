class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int maxsum=nums[0];
        int minsum=nums[0];
        int ans=nums[0];
        int sum=nums[0];
        for (int i=1;i<nums.length;i++){
            sum+=nums[i];
            maxsum=Math.max(nums[i],maxsum+nums[i]);
            max=Math.max(max,maxsum);
            minsum=Math.min(nums[i],minsum+nums[i]);
            min=Math.min(min,minsum);
        }
        if(max<0){
                return max;
            }
            ans=Math.max(ans,Math.max(max,(sum-min)));
        return ans;
        }
    }
