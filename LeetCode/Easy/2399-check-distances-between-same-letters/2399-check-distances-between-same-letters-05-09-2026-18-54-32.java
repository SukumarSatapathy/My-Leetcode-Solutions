class Solution {
    public boolean checkDistances(String s, int[] distance) {
        Map<Character, Integer> firstIdx = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (firstIdx.containsKey(c)) {
                if (i - firstIdx.get(c) - 1 != distance[c - 'a']) return false;
            }
            else {
                firstIdx.put(c, i);
            }
        }
        return true;
    }
}