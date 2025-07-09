class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int[] ans = new int[2];
        int pos = 0;
        for(int num : nums) {
            if (!seen.add(num)) {
                ans[pos++] = num;
            }
        }
        return ans;
    }
}