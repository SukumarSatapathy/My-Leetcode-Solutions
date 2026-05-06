class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> common = new HashSet<>();
        for (int num : nums1) {
            seen.add(num);
        }

        for (int num : nums2) {
            if (seen.contains(num)) {
                common.add(num);
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