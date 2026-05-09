class Solution {
    public int compress(char[] chars) {
        int slow = 0, fast = 0;
        // slow -> writer, fast -> group explorer
        while (fast < chars.length) {
            int groupCount = 0;
            chars[slow] = chars[fast];
            while (fast < chars.length && chars[fast] == chars[slow]) {
                groupCount++;
                fast++;
            }
            slow++;
            if (groupCount > 1) {
                for (char c : String.valueOf(groupCount).toCharArray()) {
                    chars[slow] = c;
                    slow++;
                }
            }
        }
        return slow;
    }
}