class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> seenInNums1 = new HashSet<>();
        Set<Integer> seenInNums2 = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        for (int n : nums1) {
            seenInNums1.add(n);
        }
        for (int n : nums2) {
            seenInNums2.add(n);
        }
        for (int n : nums1) {
            if (!seenInNums2.contains(n)) {
                result.get(0).add(n);
                seenInNums2.add(n);
            }   
        }
        for (int n : nums2) {
            if (!seenInNums1.contains(n)) {
                result.get(1).add(n);
                seenInNums1.add(n);
            }   
        }
        return result;
    }
}