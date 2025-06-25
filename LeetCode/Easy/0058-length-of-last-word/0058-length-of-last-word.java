class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0; 
        s = s.trim();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') 
                len++;
            else 
                len = 0;
        }
        return len;
    }
}