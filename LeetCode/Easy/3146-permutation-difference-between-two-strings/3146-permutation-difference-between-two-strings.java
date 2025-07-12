class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += Math.abs(s.indexOf(c) - t.indexOf(c));
        }
        return sum;
    }
}