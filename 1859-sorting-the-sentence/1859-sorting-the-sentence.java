class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        int n = words.length;
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            String word = words[i];
            int position = word.charAt(word.length()-1)-'0';
            result[position-1] = word.substring(0, word.length()-1);
        }
        return String.join(" ", result);
    }
}   