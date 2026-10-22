class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list=new ArrayList<>();
        int n=intervals.length;
        boolean insert=false;
        for (int i=0;i<n;i++){
            if(!insert&&newInterval[0]<intervals[i][0]){
                list.add(newInterval);
                insert=true;
            }
            list.add(intervals[i]);
        }
        if(!insert){
            list.add(newInterval);
        }
        List<int[]> ans=new ArrayList<>();
        int start=list.get(0)[0];
        int end=list.get(0)[1];
        for(int i=1;i<list.size();i++){
            int s=list.get(i)[0];
            int e=list.get(i)[1];
            if(end>=s){
                end=Math.max(end,e);
            }
            else{
                ans.add(new int[]{start,end});
                start=s;
                end=e;
            }
           }
            ans.add(new int[]{start,end});
            return ans.toArray(new int[ans.size()][]);
        
    }
}