class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> potential = new ArrayList<>();
        for (int c : candies) {
            max = Math.max(c, max);
        }
        for (int c : candies) {
            potential.add(c + extraCandies >= max ? true: false);
        }
        return potential;
    }
}