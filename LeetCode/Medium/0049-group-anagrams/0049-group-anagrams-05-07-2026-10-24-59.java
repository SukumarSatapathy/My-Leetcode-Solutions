class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            group.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(group.values());
    }
}