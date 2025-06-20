class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int index1 = 0, index2 = numbers.length-1;
        while (index1 <= index2) {
            if (numbers[index1] + numbers[index2] == target) {
                return new int[] {++index1, ++index2};
            }
            else if (numbers[index1] + numbers[index2] > target) {
                index2--;
            }
            else {
                index1++;
            }
        }
        return new int[] {};
    }
}