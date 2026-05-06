class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        for (int num : nums) {
            if (!uniqueNums.add(num)) { // add returns false if already present
                return true;
            }
        }
        return false;
    }
}