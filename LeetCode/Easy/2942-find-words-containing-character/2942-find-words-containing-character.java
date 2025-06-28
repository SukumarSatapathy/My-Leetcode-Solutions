class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int i = 0;
        List<Integer> indices = new ArrayList();
        for (String word : words) {
            if (word.indexOf(x) != -1) {
                indices.add(i);
            }
            i++;
        }
        return indices;
    }
}