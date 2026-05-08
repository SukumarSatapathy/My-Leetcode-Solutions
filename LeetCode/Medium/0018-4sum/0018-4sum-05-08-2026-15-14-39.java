class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> quadruplets = new ArrayList<>();
        for(int i = 0; i < nums.length - 3; i++) {
            while (i > 0 && i < nums.length - 3 && nums[i-1] == nums[i]) {
                i++;
            }
            for(int j = i + 1; j < nums.length - 2; j++) {
                while (j > i + 1 && j < nums.length - 2 && nums[j-1] == nums[j]) {
                    j++;
                }
                long currTarget = (long) target - nums[i] - nums[j];
                int l = j + 1, r = nums.length - 1;
                while (l < r) {
                    long sum = (long) nums[l] + nums[r];
                    if (sum == currTarget) {
                        quadruplets.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        if (nums[l] == nums[r]) break;
                        while (l < r && nums[l] == nums[l+1]) {
                            l++;
                        }
                        while (l < r && nums[r] == nums[r-1]) {
                            r--;
                        }
                        l++;
                        r--;
                    }
                    else if (sum < currTarget) {
                        l++;
                    }
                    else {
                        r--;
                    }
                }
            }
        }
        return quadruplets;
    }
}