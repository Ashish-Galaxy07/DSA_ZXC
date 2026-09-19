class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];

        for(char c: s.toCharArray()){
            freq[c-'a']++;
        }
        int maxOdd = 0;
        int minEven = Integer.MAX_VALUE;

        for(int n: freq){
            if(n == 0) continue;
            if(n%2 != 0){
                maxOdd = Math.max(maxOdd, n);
            }
            else{
                minEven = Math.min(minEven, n);
            }
        }
        return maxOdd-minEven;
    }
}