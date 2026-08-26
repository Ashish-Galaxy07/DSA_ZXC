class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Map<Character, Integer> map = new HashMap<>();

        int low = 0;
        int max_length = 0;

        for(int high = 0; high < s.length(); high++){
            char c = s.charAt(high);

            if(map.containsKey(c) && map.get(c)>=low){ //to check if any duplicates
                low = map.get(c) + 1;
            }

            map.put(c, high);
            int len = high-low+1;
            max_length = Math.max(max_length, len);
        }
        return max_length;
    }
}