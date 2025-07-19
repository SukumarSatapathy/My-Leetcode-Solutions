class Solution {
    public int[] shuffle(int[] nums, int n) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ans.add(nums[i]);
            ans.add(nums[i+n]);
        }
        for (int i = 0; i <= 2*n - 1; i++) {
            nums[i] = ans.get(i);
        }
        return nums;
    }
}