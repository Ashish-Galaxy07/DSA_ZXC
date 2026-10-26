class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        for (int i = 0; i < words.length; i++){
            boolean consistent = true;
            for (int j = 0; j < words[i].length(); j++){
                if (allowed.indexOf(words[i].charAt(j)) == -1){
                    consistent = false;
                    break;
                }
            }
            if (consistent){
                count++;
            }
        }
        return count;
    }
}