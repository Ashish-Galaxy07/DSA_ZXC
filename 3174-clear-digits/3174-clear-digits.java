class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                st.pop();
            } else {
                st.push(c);
            }
        }

        for (char c : st) {
            sb.append(c);
        }
        return sb.toString();
    }
}