class Solution {
    public int reverseDegree(String s) {
        int sum = 0, l = s.length();
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            sum += (int) (123 - c) * (i + 1);
        }
        return sum;
    }
}