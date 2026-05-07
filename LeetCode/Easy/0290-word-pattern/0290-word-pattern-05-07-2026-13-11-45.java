class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;
        // bijection mapping pattern. So two hashMaps needed
        Map<Character, String> charToStr = new HashMap<>();
        Map<String, Character> strToChar = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String w = words[i];
            if (charToStr.containsKey(c) && !charToStr.get(c).equals(w)) return false;
            if (strToChar.containsKey(w) && !strToChar.get(w).equals(c)) return false;
            charToStr.put(c, w);
            strToChar.put(w, c);
        }
        return true;
    }
}