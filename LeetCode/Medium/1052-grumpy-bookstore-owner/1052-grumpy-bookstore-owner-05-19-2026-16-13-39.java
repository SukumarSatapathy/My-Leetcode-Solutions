class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        
        int baseSatisfied = 0, n = customers.length;
        for (int i = 0; i < n; i++) {
            baseSatisfied += (grumpy[i] == 0) ? customers[i] : 0;
        }

        // max unsatisfied in minutes window
        int unsatisfied = 0, maxUnsatisfied = 0;
        for (int i = 0; i < n; i++) {
            unsatisfied += (grumpy[i] == 1) ? customers[i] : 0;
            if (i >= minutes) {
                unsatisfied -= (grumpy[i-minutes] == 1) ? customers[i-minutes] : 0;
            }
            maxUnsatisfied = Math.max(maxUnsatisfied, unsatisfied);
        }
        return baseSatisfied + maxUnsatisfied;
    }
}