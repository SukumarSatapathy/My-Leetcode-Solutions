class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>(); // num -> index
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (seen.containsKey(compliment)) {
                return new int[]{seen.get(compliment), i};
            }
            seen.put(nums[i], i);
        }
        return new int[]{}; // In case pair not found. Not possible tho
    }
}