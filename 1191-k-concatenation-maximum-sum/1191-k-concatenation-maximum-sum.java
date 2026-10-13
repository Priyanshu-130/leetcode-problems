class Solution {
    public int kConcatenationMaxSum(int[] arr, int k) {
        long sum=0;
        for(int x:arr){
            sum+=x;
        }
        long best=0;
        long current=0;
        for(int i=0;i<arr.length*Math.min(k,2);i++){
            int x=arr[i%arr.length];
            current = Math.max(current+x,0);
            best=Math.max(current,best);
        }
        int remaining=k-2;
        long extrasum=0;
        if(remaining>0&&sum>0){
            extrasum=(long)remaining*sum;
        }
        best=best+extrasum;
        return (int)(best%1_000_000_007);
    }
}