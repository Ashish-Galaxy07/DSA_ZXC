class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();

        for (char c: num.toCharArray()) {
            int n = c-'0';
            while (k>0 && !st.isEmpty() && (st.peek()-'0') > n) {
                st.pop();
                k--;
            }
            st.push(c);
        }
        while(k>0){
            st.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        for(char c: st){
            sb.append(c);
        }

        if(sb.length() == 0) {
            return "0";
        }
        
        while(sb.length() > 1 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}