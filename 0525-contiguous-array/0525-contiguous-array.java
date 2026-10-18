class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int ones=0;
        int zeroes=0;
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                ones++;
            }
                else{
                    zeroes++;
                }
                int diff=ones-zeroes;
                if(map.containsKey(diff)){
                    res=Math.max(res,i-map.get(diff));
                }
                else{
                    map.put(diff,i);
                }
                }
                return res;
        }
    }
