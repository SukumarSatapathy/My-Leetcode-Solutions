class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        // O(n) time and O(1) space
        Set<Integer> friendIds = new HashSet<>();
        for (int id : friends) {
            friendIds.add(id);
        }

        int i = 0;
        for (int id : order) {
            if (friendIds.contains(id)) {
                friends[i++] = id;
            }
        }
        return friends;
    }
}