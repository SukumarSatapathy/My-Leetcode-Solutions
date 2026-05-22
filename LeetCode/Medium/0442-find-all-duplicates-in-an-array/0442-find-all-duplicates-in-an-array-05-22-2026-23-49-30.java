class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // easy sols - sort (n log n time)
        // counting sort (n time and space)
        // [4,3,2,7,8,2,3,1]
        // flip element at idx to negative. If the element is negative already then add it to result
        List<Integer> duplicates = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n ; i++) {
            int idx = Math.abs(nums[i]) - 1;
            if (nums[idx] > 0) {
                nums[idx] = -nums[idx];
            }
            else {
                duplicates.add(Math.abs(nums[i]));
            }
        }
        return duplicates;
    }
}