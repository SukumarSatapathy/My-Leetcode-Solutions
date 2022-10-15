class Solution:
    def getLengthOfOptimalCompression(self, s: str, k: int) -> int:
        @cache
        def compress(idx, previous, previous_count, k):
            if idx == len(s):
                return 0
  
            current = s[idx]
            if current == previous:
                length = 1 if previous_count == 1 or previous_count == 9 or previous_count == 99 else 0
                return length + compress(idx + 1, previous, previous_count + 1, k)

            keep = 1 + compress(idx + 1, current, 1, k)
            delete = compress(idx + 1, previous, previous_count, k - 1) if k - 1 >= 0 else float('inf')
            return min(keep, delete)

        return compress(0, None, None, k)