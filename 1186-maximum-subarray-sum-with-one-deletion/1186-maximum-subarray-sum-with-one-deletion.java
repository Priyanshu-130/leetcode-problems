class Solution {
    public int maximumSum(int[] arr) {
        int max=arr[0];
        int ans=arr[0];
        int del=arr[0];
        for(int i=1;i<arr.length;i++){
            int v2=arr[i];
            del=Math.max(max,del+v2);
            max=Math.max(max+v2,v2);
            ans=Math.max(ans,Math.max(max,del));
        }
        return ans;
    }
}