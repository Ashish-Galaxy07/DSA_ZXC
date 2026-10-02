class Solution {
    public int[] nextGreaterElements(int[] nums) {

        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && nums[i] > nums[st.peek()]){
                ans[st.pop()] = nums[i];
            }
            st.push(i); //pushing the index
        }
        //for circular part, 2nd pass
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && nums[i] > nums[st.peek()]){
                ans[st.pop()] = nums[i];
            }
        }
        //Remaining elements
        while(!st.isEmpty()){
            ans[st.pop()] = -1;
        }
        return ans;
    }
}