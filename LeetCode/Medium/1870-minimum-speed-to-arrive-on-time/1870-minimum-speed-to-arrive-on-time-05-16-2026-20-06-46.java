class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        // [1, max(dist)]
        int lo = 1, hi = 10_000_000, ans = -1;

        while (lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if (canTravel(dist, hour, mid)) {
                ans = mid;
                hi = mid - 1;
            }
            else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    public boolean canTravel(int[] dist, double hour, int speed) {
        // is it possible to travel at speed s and commute within hour hours
        double time = 0.0;
        int i;
        for (i = 0; i < dist.length-1; i++) {
            time += (dist[i] + speed - 1)/speed;
            if (time >= hour) return false;
        }
        time += 1.0 * dist[i]/speed;
        return time <= hour;
    }
}