class Solution {
    public String reverseWords(String s) {
        // dlrow olleh
        // world hello
        // reverse string, then reverse each word
        // O(n) time, O(1) space
        s = s.trim();
        s = reverse(s, 0, s.length() - 1);
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            words[i] = reverse(words[i], 0, words[i].length() - 1);
            sb.append(words[i]).append(" ");
        }
        return sb.toString().trim();
    }

    public String reverse(String s, int left, int right) {
        char[] chars = s.toCharArray();
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}