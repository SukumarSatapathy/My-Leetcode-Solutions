class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int win = p.length(), len = s.length();
        int[] pFreq = new int[26];
        int[] winFreq = new int[26];
        List<Integer> indices = new ArrayList<>();
        for (char c : p.toCharArray()) {
            pFreq[c - 'a']++;
        }

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            winFreq[c - 'a']++; // add new

            if (i >= win) { // remove old if i >= k
                winFreq[s.charAt(i - win) - 'a']--;
            }

            // update ans if window is ready
            if (i >= win-1 && Arrays.equals(winFreq, pFreq)) {
                indices.add(i - win + 1);
            }
        }
        return indices;
    }
}