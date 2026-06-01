class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String w : words) {
            if (isConsistent(allowed, w)) {
                count++;
            }
        }
        return count;
    }

    private boolean isConsistent(String allowed, String word) {
        for (char c : word.toCharArray()) {
            if (allowed.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}