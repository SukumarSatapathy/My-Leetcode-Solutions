class Solution {
    public int[] separateDigits(int[] nums) {
        // using ArrayList and stream
        List<Integer> res = new ArrayList<>();
        for (int num : nums) {
            String s = String.valueOf(num);
            for (int i = 0; i < s.length(); i++) {
                res.add(Integer.parseInt(s.substring(i, i+1)));
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}