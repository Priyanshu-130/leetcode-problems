class Solution {
    int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
    int dayofyear(String date){
        int month=Integer.parseInt(date.substring(0,2));
        int day=Integer.parseInt(date.substring(3,5));
        int total=day;
        for(int i=0;i<month-1;i++){
            total+=days[i];
        }
        return total;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int a1=dayofyear(arriveAlice);
        int a2=dayofyear(leaveAlice);
        int a3=dayofyear(arriveBob);
        int a4=dayofyear(leaveBob);
        int start=Math.max(a1,a3);
        int end=Math.min(a2,a4);
        if(start>end){
            return 0;
        }
        else{
            return end-start+1;
        }
        
    }
}