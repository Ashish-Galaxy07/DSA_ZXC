class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> st = new Stack<>();

        for(char c: s.toCharArray()){
            if(!st.isEmpty() && st.peek()[0]==c){
                st.peek()[1]++;
            }
            else{
                st.push(new int[]{c,1});
            }
            if(st.peek()[1]==k){
                st.pop();
            }
        }

        StringBuilder ans = new StringBuilder();
        for(int[] a: st){
            for(int i = 0; i < a[1]; i++){
                ans.append((char)a[0]);
            }
        }
        return ans.toString();
    }
}