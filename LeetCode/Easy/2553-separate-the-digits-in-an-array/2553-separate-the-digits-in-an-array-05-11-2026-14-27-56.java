class Solution {
    public int[] separateDigits(int[] nums) {
        int count = 0;
        for (int num : nums) {
            count += num < 10 ? 1 : String.valueOf(num).length();
        }

        int[] res = new int[count];
        int curr = 0;
        for (int num : nums) {
            String s = String.valueOf(num);
            for (int i = 0; i < s.length(); i++) {
                res[curr] = Integer.parseInt(s.substring(i, i+1));
                curr++;
            }
        }
        return res;
    }
}