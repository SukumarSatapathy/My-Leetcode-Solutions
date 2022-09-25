class Solution:
    def reverseVowels(self, s: str) -> str:
        l, r = 0, len(s)-1
        A = list(s)
        vowels = set('aeiouAEIOU')
        while l<r:
            if A[l] in vowels and A[r] in vowels:
                A[l], A[r] = A[r], A[l]
                l, r = l+1, r-1
            elif A[l] in vowels:
                r = r-1
            else:
                l = l+1
        
        return ''.join(A)