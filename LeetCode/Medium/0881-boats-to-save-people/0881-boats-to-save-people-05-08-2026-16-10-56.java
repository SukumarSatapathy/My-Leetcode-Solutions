class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int currWeight = 0, boats = 0, l = 0, r = people.length - 1;
        // always put the heaviest person on a boat. If the lightest person can fit with them, pair them; otherwise, the heaviest goes alone.
        while (l <= r) {
            if (people[l] + people[r] <= limit) {
                l++; r--;
            }
            else {
                r--;
            }
            boats++;
        }
        return boats;
    }
}