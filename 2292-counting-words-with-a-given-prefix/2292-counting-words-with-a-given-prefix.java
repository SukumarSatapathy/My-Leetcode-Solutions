class Solution {
    public int prefixCount(String[] words, String pref) {
        int c = 0;
        for (String w : words) {
            if (w.startsWith(pref)) c++;
        }
        return c;
    }
}