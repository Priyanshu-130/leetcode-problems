class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->{
            if(a[0]==b[0]){
                return b[1]-a[1];
            }
            return a[0]-b[0];
        });
        int count=0;
        int max_end= -1;
        for(int[] inter : intervals){
            if(inter[1]>max_end){
                count++;
                max_end=inter[1];
            }
        }
        return count;
    }
}