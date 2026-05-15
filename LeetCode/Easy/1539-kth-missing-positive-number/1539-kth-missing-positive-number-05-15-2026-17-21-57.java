class Solution {
    public int findKthPositive(int[] arr, int k) {
        // brute force - same dir pointers
        // writer - candidate missing number
        // reader - current natural number
        // count - how many missing numbers found
        int writer = 1, reader = 1, i = 0, count = 0;
        while (count != k) {
            while (i < arr.length && reader != arr[i]) {
                count++;
                if (count == k) return writer;
                
                writer++; reader++;
            }
            while (i < arr.length && reader == arr[i]) {
                reader++; writer++; i++;
            }
            while (i >= arr.length && count != k) {
                count++;
                if (count == k) return writer;
                
                reader++; writer++;
            }
        }
        return writer;
    }
}