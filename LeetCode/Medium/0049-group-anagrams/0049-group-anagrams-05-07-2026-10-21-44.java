class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            group.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        for (Map.Entry<String,List<String>> entry : group.entrySet()) {
            result.add(entry.getValue());
        }
        return result;
    }
}