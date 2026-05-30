class Solution {
    public int findClosest(int x, int y, int z) {
        int closest = 0;
        if (Math.abs(z - x) < Math.abs(z - y)) {
            closest = 1;
        }
        else if (Math.abs(z - x) > Math.abs(z - y)) {
            closest = 2;
        }
        return closest;
    }
}