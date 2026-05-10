class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> freq = new HashMap<>();

        for (int num : nums) {
            int f = freq.getOrDefault(num, 0);
            freq.put(num, ++f);
            if (f > n/2) return num;
        }
        return -1; // dummy return as per ques
    }
}