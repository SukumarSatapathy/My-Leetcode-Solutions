class Solution {
    public int firstUniqueEven(int[] nums) {
        int[] seen = new int[101];
        // counting array with one extra than end limit since one indexed
        for (int num : nums) {
            seen[num]++;
        }
        for (int num : nums) {
            if (seen[num] == 1 && num % 2 == 0) return num;
        }
        return -1;
    }
}