class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int h : hours) {
            count += h >= target ? 1 : 0;
        }
        return count;
    }
}