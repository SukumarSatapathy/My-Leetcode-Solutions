class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1, most = 0;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            most = Math.max(most, area);
            if (height[l] < height[r]) {
                l++;
            }
            else {
                r--;
            }
        }
        return most;
    }
}