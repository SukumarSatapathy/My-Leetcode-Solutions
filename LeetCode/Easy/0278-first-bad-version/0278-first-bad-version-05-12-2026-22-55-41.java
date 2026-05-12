/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int m, ver = n, l = 0, r = n;
        while (l <= r) {
            m = l + (r-l)/2;
            if (isBadVersion(m)) {
                ver = m;
                r = m - 1;
            }
            else {
                l = m + 1;
            }
        }
        return ver; 
    }
}