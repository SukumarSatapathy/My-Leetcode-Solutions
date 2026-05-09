class Solution {
    public void sortColors(int[] nums) {
        // dutch national flag
        // 0 -> low-1 (all 0s)
        // low -> mid-1 (all 1s)
        // mid -> high (unknow region)
        // high+1 -> n-1 (all 2s)
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++; mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}