class Solution {
    public int trap(int[] height) {
        int water = 0;
        for (int i = 0; i < n; i++) {
            int leftMax = 0;
            for (int j = 0; j <= i; j++)
                leftMax = Math.max(leftMax, height[j]);

            int rightMax = 0;
            for (int j = i; j < n; j++)
                rightMax = Math.max(rightMax, height[j]);

            water += Math.min(leftMax, rightMax) - height[i];
        }
        return water;
    }
}
