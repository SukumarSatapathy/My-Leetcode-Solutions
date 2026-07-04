class Solution {
    public String convert(String s, int numRows) {
        // row1 - P   A   H   N
        // row2 - A P L S I I G
        // row3 - Y   I   R
        // 0 to numRows - 1
        // r1 + r2 + r3 = P   A   H   N A P L S I I G Y   I   R
        // ans = PAHNAPLSIIGYIR
        
        if (numRows == 1 || numRows > s.length()) return s;
        StringBuilder[] rows = new StringBuilder[numRows]; // one for each row

        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currRow = 0;
        boolean moveDown = true; // true if going down, false otherwise

        for (char ch : s.toCharArray()) {
            rows[currRow].append(ch); // put curr char into curr row
            if (currRow == 0) {
                moveDown = true;
            }
            else if (currRow == numRows - 1) {
                moveDown = false;
            }
            currRow += moveDown ? 1 : -1; // change curr row based on flag
        }

        StringBuilder ans = new StringBuilder();
        for (StringBuilder row : rows) {
            ans.append(row); // append each row chars to the ans
        }
        return ans.toString();
    }
}