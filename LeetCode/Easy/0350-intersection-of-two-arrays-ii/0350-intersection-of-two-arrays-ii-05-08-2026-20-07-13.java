class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array to optimize space
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        Map<Integer,Integer> freq = new HashMap<>();
        List<Integer> common = new ArrayList<>();

        for (int num : nums1) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            if (freq.containsKey(num) && freq.get(num) != 0) {
                common.add(num);
                freq.put(num, freq.get(num) - 1);
            }
        }

        //converting to int[] using streams
        return common.stream().mapToInt(Integer::intValue).toArray();
    }
}