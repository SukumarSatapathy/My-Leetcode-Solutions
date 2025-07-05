class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        int high = -1;
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int key : freq.keySet()) {
            if(key == freq.get(key) && key > high) {
                high = key;
            }
        }
        return high;
    }
}