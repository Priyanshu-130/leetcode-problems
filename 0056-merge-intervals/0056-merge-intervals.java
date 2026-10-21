class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans=new ArrayList<>();
        int n=intervals.length;
        if(n==0){
            return new int[0][];
        }
         Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int start1=intervals[0][0];
        int end1=intervals[0][1];
        for(int i=1;i<n;i++){
            int s=intervals[i][0];
            int e=intervals[i][1];
            if(end1 >=s){
                end1=Math.max(end1,e);
                continue;
            }
            ans.add(new int[]{start1,end1});
            start1=s;
            end1=e;
        }
        ans.add(new int[]{start1,end1});
        return ans.toArray(new int [ans.size()][]);
    }
}