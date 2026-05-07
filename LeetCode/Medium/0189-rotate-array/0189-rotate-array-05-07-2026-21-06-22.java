class Solution {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        // Simplest sol. O(n) extra space
        int[] result = new int[l];
        k = k % l;
        int j = l - k;
        for (int i = 0; i < k; i++) {
            result[i] = nums[j++];
        }
        j = 0;
        for (int i = k; i < l; i++) {
            result[i] = nums[j++];
        }
        for (int i = 0; i < l; i++) {
            nums[i] = result[i];
        }
    }
}