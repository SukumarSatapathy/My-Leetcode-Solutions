class Solution {
    public int countGoodSubstrings(String s) {
        int len = s.length(), count = 0;
        if (len < 3) {
            return 0;
        }

        for (int i = 2; i < len; i++) {
            char first = s.charAt(i - 2);
            char sec = s.charAt(i - 1);
            char third = s.charAt(i);
            if (first != sec && sec != third && third != first) count++;
            
            first = sec;
            sec = third;
        }
        return count;
    }
}