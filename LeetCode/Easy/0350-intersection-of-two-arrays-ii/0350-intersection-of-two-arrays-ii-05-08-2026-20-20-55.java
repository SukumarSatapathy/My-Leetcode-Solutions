class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Sorting and 2 pointers O(nlog n + mlog m) but O(1) space
        // Use HashMap + counting array for linear time and constant space
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> common = new ArrayList<>();

        int p1 = 0, p2 = 0;
        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] == nums2[p2]) {
                common.add(nums1[p1]);
                p1++;
                p2++;
            }
            else if (nums1[p1] <= nums2[p2]) {
                p1++;
            }
            else {
                p2++;
            }
        }
        // using stream for learning. Use manual for loop in real interviews
        return common.stream().mapToInt(Integer::intValue).toArray();
    }
}