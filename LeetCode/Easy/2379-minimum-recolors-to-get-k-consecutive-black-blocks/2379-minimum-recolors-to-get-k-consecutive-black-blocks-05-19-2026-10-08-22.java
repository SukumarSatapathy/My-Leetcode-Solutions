class Solution {
    public int minimumRecolors(String blocks, int k) {
        int recolors = 0, len = blocks.length();
        for (int i = 0; i < k; i++) {
            recolors += blocks.charAt(i) == 'W' ? 1 : 0;
        }

        int minRecolors = recolors;
        for (int i = k; i < len; i++) {
            recolors += blocks.charAt(i) == 'W' ? 1 : 0;
            recolors -= blocks.charAt(i-k) == 'W' ? 1 : 0;
            minRecolors = Math.min(minRecolors, recolors);
        }
        return minRecolors;
    }
}