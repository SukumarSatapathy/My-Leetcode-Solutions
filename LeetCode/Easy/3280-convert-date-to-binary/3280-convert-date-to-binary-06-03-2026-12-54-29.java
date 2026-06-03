class Solution {
    public String convertDateToBinary(String date) {
        String[] parts = date.split("-");
        String binaryDate = "";
        for (String part : parts) {
            binaryDate += decimalToBinary(Integer.parseInt(part)) + '-';
        }
        return binaryDate.substring(0, binaryDate.length() - 1);
    }

    private String decimalToBinary(int decimal) {
        int rem, base = 2, divident = decimal;
        String binary = "";
        while (divident > 0) {
            rem = divident % base;
            divident /= base;
            binary = rem + binary;
        }
        return binary;
    }
}