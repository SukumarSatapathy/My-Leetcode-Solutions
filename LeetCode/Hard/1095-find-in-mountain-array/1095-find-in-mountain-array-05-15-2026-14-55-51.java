/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        // find peak -> search in the left sorted -> search in the right sorted
        int n = mountainArr.length();
        int m, l = 0, r = n - 1;
        while (l < r) {
            m = l + (r - l)/2;
            if (mountainArr.get(m) < mountainArr.get(m+1)) { // asc slope. look right half
                l = m + 1;
            }
            else {
                r = m;
            }
        }
        // peak = l = r
        int idx = binSearchAsc(mountainArr, target, 0, l);
        return (idx == -1) ? binSearchDesc(mountainArr, target, l + 1, n - 1) : idx;
    }

    public int binSearchAsc(MountainArray mountainArr, int target, int l, int r) {
        // asc arr bin search
        while (l <= r) {
            int m = l + (r - l)/2;
            int e = mountainArr.get(m);
            if (e == target) { 
                return m;
            }
            else if (e < target) { //look right half
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }
        return -1;
    }

    public int binSearchDesc(MountainArray mountainArr, int target, int l, int r) {
        // desc arr bin search
        while (l <= r) {
            int m = l + (r - l)/2;
            int e = mountainArr.get(m);
            if (e == target) { 
                return m;
            }
            else if (e < target) { //look left half
                r = m - 1;
            }
            else {
                l = m + 1;
            }
        }
        return -1;
    }
}