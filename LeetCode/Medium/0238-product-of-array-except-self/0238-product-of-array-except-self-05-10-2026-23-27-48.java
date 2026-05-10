class Solution {
    public int[] productExceptSelf(int[] nums) {
        // O(n) time, O(1) space
        int n = nums.length, rightProd = 1;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i-1] * nums[i-1];
        }

        for (int i = n-2; i >= 0; i--) {
            rightProd *= nums[i+1];
            res[i] *= rightProd;
        }

        return res;
    }
}