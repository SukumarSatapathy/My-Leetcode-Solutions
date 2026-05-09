class Solution {
    public int removeDuplicates(int[] nums) {
        // slow -> group key
        // fast -> explorer
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) { // detect change
                slow++; //update group key pos to write the new key
                nums[slow] = nums[fast];
            }
        }
        return slow + 1; // group key pattern. last value of slow represents last valid index / key (not length)
    }
}