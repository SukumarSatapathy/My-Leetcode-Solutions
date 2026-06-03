class Solution {
    public String convertDateToBinary(String date) {
        String[] parts = date.split("-");

        return Integer.toBinaryString(Integer.parseInt(parts[0])) + "-" +
               Integer.toBinaryString(Integer.parseInt(parts[1])) + "-" +
               Integer.toBinaryString(Integer.parseInt(parts[2]));
    }
}