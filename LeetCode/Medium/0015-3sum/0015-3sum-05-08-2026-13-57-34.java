class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            while (i > 0 && i < nums.length - 2 && nums[i] == nums[i-1]) {
                i++;
            }
            int l = i+1, r = nums.length - 1, target = 0 - nums[i];
            while(l < r) {
                if (nums[l] + nums[r] == target) {
                    triplets.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    if (nums[l] == nums[r]) break;
                    while (l < r && nums[l] == nums[l+1]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r-1]) {
                        r--;
                    }
                }
                if (nums[l] + nums[r] < target) {
                    l++;
                }
                else {
                    r--;
                }

            }
        }
        return triplets;
    }
}