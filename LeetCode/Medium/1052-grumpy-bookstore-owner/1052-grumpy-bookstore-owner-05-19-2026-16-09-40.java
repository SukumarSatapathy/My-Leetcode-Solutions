class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        
        int baseSatisfied = 0, n = customers.length;
        for (int i = 0; i < n; i++) {
            baseSatisfied += (grumpy[i] == 0) ? customers[i] : 0;
        }

        // max unsatisfied in minutes window
        int unsatisfied = 0, maxUnsatisfied = 0, window = 0;
        for (int i = 0; i < n; i++) {
            if (window == minutes) {
                unsatisfied += (grumpy[i] == 1) ? customers[i] : 0;
                unsatisfied -= (grumpy[i-window] == 1) ? customers[i-window] : 0;
            }
            else {
                unsatisfied += (grumpy[i] == 1) ? customers[i] : 0;
                window++;
            }
            maxUnsatisfied = Math.max(maxUnsatisfied, unsatisfied);
        }
        return baseSatisfied + maxUnsatisfied;
    }
}