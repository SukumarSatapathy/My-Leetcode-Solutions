class Solution {
    public int[] transformArray(int[] nums) {
        int odd = 0, even = 0;
        for (int num : nums) {
            if (num % 2 == 0)
                even++;
            else 
                odd++;
        }
        
        for (int i = 0; i < even; i++) {
            nums[i] = 0;
        }
        for (int i = even; i < even + odd; i++) {
            nums[i] = 1;
        }

        return nums;
    }
}