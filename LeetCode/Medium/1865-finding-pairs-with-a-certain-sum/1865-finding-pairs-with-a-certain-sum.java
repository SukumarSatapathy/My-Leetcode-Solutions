class FindSumPairs {
    private int[] nums1, nums2;
    private Map<Integer, Integer> nums2Freq;
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        nums2Freq = new HashMap<>();

        for (int num : nums2) {
            nums2Freq.put(num, nums2Freq.getOrDefault(num, 0) + 1);
        }
    }
    
    public void add(int index, int val) {
        int oldVal = nums2[index];
        nums2Freq.put(oldVal, nums2Freq.get(oldVal) - 1);
        
        nums2[index] += val;
        int newVal = nums2[index];
        nums2Freq.put(newVal, nums2Freq.getOrDefault(newVal, 0) + 1);
    }
    
    public int count(int tot) {
        int pairs = 0;
        for (int num : nums1) {
            pairs += nums2Freq.getOrDefault(tot - num, 0);
        }
        return pairs;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */