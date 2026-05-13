/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
// 1 1 1 1 0 0 0 0 0 0
// lower bound version. a[i] >= target type
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int m, l = 0, r = n;
        while (l < r) { // since we are doing r = m in correct case
            m = l + (r-l)/2;
            if (isBadVersion(m)) {
                r = m; // include m in the search space since it may be the ans
            }
            else {
                l = m + 1;
            }
        }
        return r; 
    }
}