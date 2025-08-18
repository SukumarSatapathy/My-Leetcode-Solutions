import java.util.*;

class Solution {
    public boolean judgePoint24(int[] cards) {
        List<Double> nums = new ArrayList<>();
        for (int c : cards) nums.add((double) c);
        return dfs(nums);
    }

    private boolean dfs(List<Double> nums) {
        int n = nums.size();
        if (n == 1) return Math.abs(nums.get(0) - 24.0) < 1e-6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                List<Double> next = new ArrayList<>();
                for (int k = 0; k < n; k++) if (k != i && k != j) next.add(nums.get(k));
                double a = nums.get(i), b = nums.get(j);
                List<Double> candidates = new ArrayList<>();
                candidates.add(a + b);
                candidates.add(a - b);
                candidates.add(b - a);
                candidates.add(a * b);
                if (Math.abs(b) > 1e-6) candidates.add(a / b);
                if (Math.abs(a) > 1e-6) candidates.add(b / a);
                for (double c : candidates) {
                    List<Double> newNext = new ArrayList<>(next);
                    newNext.add(c);
                    if (dfs(newNext)) return true;
                }
            }
        }
        return false;
    }
}
