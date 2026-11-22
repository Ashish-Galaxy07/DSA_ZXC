class Solution {
    public int getMaximumGenerated(int n) {
        if(n == 0) return 0;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        int max = 1;
        for(int i = 1; i < n+1; i++){
            if(2*i <= n){ //(2*i >= 2 && 2*i <= n) since 2*i>=2 is automatically true, so no need
                dp[2*i] = dp[i];
            }
            if(2*i+1 <= n){
                dp[2*i+1] = dp[i]+dp[i+1];
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}