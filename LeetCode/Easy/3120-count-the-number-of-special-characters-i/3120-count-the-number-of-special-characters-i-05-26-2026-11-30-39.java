class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> seen = new HashSet<>();
        int count = 0;
        for (char c : word.toCharArray()) {
            char opposite = Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c);
            if (!seen.contains(c) && seen.contains(opposite)) {
                count++;
            }
            seen.add(c);
        }
        return count;
    }
}