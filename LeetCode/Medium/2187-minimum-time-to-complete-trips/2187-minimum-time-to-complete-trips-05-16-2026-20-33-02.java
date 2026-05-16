class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        // [1, min(time)*totalTrips]
        long lo = 1, hi = Long.MAX_VALUE, ans = -1;

        while (lo <= hi) {
            long mid = lo + (hi - lo)/2;
            if (isPossible(time, totalTrips, mid)) {
                ans = mid;
                hi = mid - 1;
            }
            else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    public boolean isPossible(int[] time, int totalTrips, long totalTime) {
        // is it possible for all buses to complete totalTrips trips together within totalTime time
        long trips = 0;
        for (int t : time) {
            trips += totalTime/t;
            if (trips >= totalTrips) return true;
        }
        return false;
    }
}