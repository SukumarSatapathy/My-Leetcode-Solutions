class Solution {
    public boolean isValid(String word) {
        int l = word.length();
        boolean hasVowels = false, hasConsonants = false;
        for (int i = 0; i < l; i++) {
            char c = word.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
            if("aeiouAEIOU".indexOf(c) != -1) {
                hasVowels = true;
            }
            else if (Character.isLetter(c)) {
                hasConsonants = true;
            }
        }
        return hasVowels & hasConsonants && l >= 3;
    }
}