class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Used : 1 HashMap
        // O(n) time, O(n) space
        Map<Integer, Integer> lastIdxMap = new HashMap<>(); // value -> lastIdx
        for (int i = 0; i < nums.length; i++) {
            if (lastIdxMap.containsKey(nums[i])) {
                int prevIdx = lastIdxMap.get(nums[i]);
                if (i - prevIdx <= k) return true;
            }
            lastIdxMap.put(nums[i], i);
        }
        return false;
    }
}