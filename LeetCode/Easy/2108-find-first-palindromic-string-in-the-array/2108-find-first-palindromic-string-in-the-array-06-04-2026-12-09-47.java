class Solution {
    public String firstPalindrome(String[] words) {
        for (String w : words) {
            if (w.equals(new StringBuilder(w).reverse().toString())) {
                return w;
            }
        }
        return "";
    }
}