class Solution {
    public String convertDateToBinary(String date) {
        int len = date.length(), idx = 0, nextIdx = 0;
        String binFormattedDate = "";
        while (idx < len) {
            nextIdx = date.indexOf('-', idx + 1);
            nextIdx = nextIdx != -1 ? nextIdx : len;
            binFormattedDate += decimalToBinary(Integer.parseInt(date.substring(idx, nextIdx))) + '-';
            idx = nextIdx + 1;
        }
        return binFormattedDate.substring(0, binFormattedDate.length() - 1);
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