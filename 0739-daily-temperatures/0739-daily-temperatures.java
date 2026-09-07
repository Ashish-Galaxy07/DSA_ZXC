class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> st = new Stack<>();
        int[] ans = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++) {
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
                int prevDay = st.pop();
                ans[prevDay] = i - prevDay;
            }
            st.push(i); //pushing the index, not the element
        }
        return ans;
    }
}