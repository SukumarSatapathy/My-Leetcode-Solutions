class Solution {
    public String reverseWords(String s) {
        // dlrow olleh
        // world hello
        // reverse string, then reverse each word
        // O(n) time, O(1) space
        s = s.trim();
        s = reverse(s);
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            words[i] = reverse(words[i]);
            sb.append(words[i]).append(" ");
        }
        return sb.toString().trim();
    }

    public String reverse(String s) {
        int left = 0, right = s.length() - 1;
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