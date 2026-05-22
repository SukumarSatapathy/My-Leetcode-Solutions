class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // easy straight forward solutions. think different
        // add to set and check what nums are not in set (linear space and time)
        // sort and check (no extra space. n log n time)
        List<Integer> absent = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1;
            nums[idx] = nums[idx] < 0 ? nums[idx] : -nums[idx];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) { // it means i + 1 never existed in the array
                absent.add(i + 1);
            }
        }
        return absent;
    }
}