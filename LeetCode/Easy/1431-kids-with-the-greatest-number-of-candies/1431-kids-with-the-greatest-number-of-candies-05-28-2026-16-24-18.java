class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int highest = 0, n = candies.length;
        List<Boolean> result = new ArrayList<>();
        for (int c : candies) {
            highest = Math.max(highest, c);
        }
        for (int c : candies) {
            result.add(c + extraCandies >= highest ? true : false);
        }
        return result;
    }
}