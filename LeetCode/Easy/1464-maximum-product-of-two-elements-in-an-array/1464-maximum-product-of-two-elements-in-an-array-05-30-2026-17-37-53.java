class Solution {
    public int maxProduct(int[] nums) {
        int h1 = 0, h2 = 0;
        for (int n : nums) {
            if (n > h1) {
                h2 = h1;
                h1 = n;
            }
            else if (n > h2) {
                h2 = n;
            }
        }
        return (h1-1) * (h2-1);
    }
}