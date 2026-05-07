class Solution {
    public boolean checkDistances(String s, int[] distance) {
        Map<Character, Integer> dist = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (dist.containsKey(c)) {
                dist.put(c, i - dist.get(c) - 1);
            }
            else {
                dist.put(c, i);
            }
        }
        for (char c : dist.keySet()) {
            if (dist.get(c) != distance[c - 'a']) return false;
        }
        return true;
    }
}