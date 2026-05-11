class Solution {
    public int findMaxLength(int[] nums) {
        // [0,1,1,1,1,1,0,0,0]
        // [-1,1,1,1,1,1,-1,-1,-1] 0 -> -1
        // [-1,0,1,2,3,4,3,2,1] // compute prefix sum. 
        // Calc max dist b/w 2 indices with same prefix sum to get the length of subarr
        // because if diff in prefix sum == 0, there has to be equal no of 0 and 1

        Map<Integer, Integer> fIdx = new HashMap<>(); // prefixSum -> first Idx
        fIdx.put(0, -1);
        int prefixSum = 0, maxLen = 0;
        
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i] == 1 ? 1 : -1;
            if (fIdx.containsKey(prefixSum)) {
                maxLen = Math.max(maxLen, i - fIdx.get(prefixSum)); // greedy
            }
            else {
                fIdx.put(prefixSum, i);
            }
        }
        return maxLen;
    }
}