class Solution {
    public String reverseVowels(String s) {
        int l = 0, r = s.length() - 1;
        char[] chars = s.toCharArray();
        while (l < r) {
            while (l < r && !isVowel(chars[l])) l++;
            while (l < r && !isVowel(chars[r])) r--;
            // swap safely since both are vowels now
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            l++; r--;
        }
        return new String(chars);
    }

    private boolean isVowel(char c) {
        switch (Character.toLowerCase(c)) {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
                return true;
            default :
                return false;
        }
    }
}