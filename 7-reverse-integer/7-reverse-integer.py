class Solution:
    def reverse(self, x: int) -> int:
        lim = 2147483648
        x = str(x)
        x_abs = int(x[::-1].replace('-', '', 1))

        if -lim <= x_abs <= lim - 1:
            if x.count('-') == 0:
                return int(x[::-1])
            return -x_abs
        return 0