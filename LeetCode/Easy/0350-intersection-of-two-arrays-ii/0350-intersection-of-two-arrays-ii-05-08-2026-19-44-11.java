class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> freq1 = new HashMap<>();
        Map<Integer,Integer> freq2 = new HashMap<>();
        List<Integer> common = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        // so much space. Try to optimize it further
        for (int num : nums1) {
            freq1.put(num, freq1.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            freq2.put(num, freq2.getOrDefault(num, 0) + 1);
        }

        for (int num : nums1) {
            if (freq2.containsKey(num) && !seen.contains(num)) {
                seen.add(num);
                int minFreq = Math.min(freq1.get(num), freq2.get(num));
                for (int i = 1; i <= minFreq; i++) {
                    common.add(num);
                }
            }
        }

        int[] result = new int[common.size()];
        int i = 0;
        for (int num : common) {
            result[i++] = num;
        }
        return result;
    }
}