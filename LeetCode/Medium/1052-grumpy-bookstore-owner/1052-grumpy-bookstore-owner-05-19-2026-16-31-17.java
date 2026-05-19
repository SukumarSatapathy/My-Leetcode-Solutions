class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        
        int baseSatisfied = 0, n = customers.length;
        for (int i = 0; i < n; i++) {
            baseSatisfied += (grumpy[i] == 0) ? customers[i] : 0;
        }

        // max unsatisfied in minutes window
        int unsatisfied = 0, maxUnsatisfied = 0;
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 1) {
                unsatisfied += customers[i];
            }
            if (i >= minutes && grumpy[i-minutes] == 1) {
                unsatisfied -= customers[i-minutes];
            }
            if (i >= minutes-1) {
                maxUnsatisfied = Math.max(maxUnsatisfied, unsatisfied);
            }
        }
        return baseSatisfied + maxUnsatisfied;
    }
}