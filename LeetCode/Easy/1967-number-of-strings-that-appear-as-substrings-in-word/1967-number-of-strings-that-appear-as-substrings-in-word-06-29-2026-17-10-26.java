class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int substrings = 0;
        for (String s : patterns) {
            if (word.indexOf(s) != -1) {
                substrings++;
            }
        }
        return substrings;
    }
}