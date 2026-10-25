class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> str = new Stack<>();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(str.empty()){
                str.push(ch);
            }
            else if(str.peek()==ch){
                str.pop();
            }
            else{
            str.push(ch);
            }
        }
        StringBuilder res=new StringBuilder();
        while(!str.empty()){
            res.append(str.peek());
            str.pop();
        }
        return res.reverse().toString();
    }
}