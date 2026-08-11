class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
    int sum=nums[0];
     for (int i=0;i<nums.length;i++){
        set.add(nums[i]);
     }
     for (int i=0;i<nums.length-1;i++){
        if(nums[i+1]==nums[i]+1){
            sum+=nums[i+1];
            }
            else{
                break;
            }
     }
            int cand = sum;
            while(set.contains(cand)){
                 cand++;
            }
        return cand;
    }
}