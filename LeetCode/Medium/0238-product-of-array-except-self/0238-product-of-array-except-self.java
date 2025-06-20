class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int prefix = 1, suffix = 1;
        answer[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefix *= nums[i-1];
            answer[i] = prefix;
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            suffix *= nums[i+1];
            answer[i] *= suffix;
        }

        return answer;
    }
}