class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String,Integer> freq = new HashMap<>(); // DnaSeq -> count
        List<String> repeatedSeq = new ArrayList<>();
        int left = 0, len = s.length(), window = 10;
        for (int right = 0; right < len; right++) {
            if (right >= window - 1) { // window ready
                String seq = s.substring(left, right + 1);
                int count = freq.getOrDefault(seq, 0);
                freq.put(seq, ++count);
        
                if (count == 2) {
                    repeatedSeq.add(seq);
                }
                left++;
            }
        }
        return repeatedSeq;
    }
}