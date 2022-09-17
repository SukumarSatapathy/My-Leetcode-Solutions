class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for c in s:
            if c == '(' or c == '{' or c == '[':
                stack.append(c)
            else:
                if not stack:
                    return False
                b = stack.pop()
                if c == ')' and b == '(' or c == '}' and b == '{' or c == ']' and b == '[':
                    pass
                else:
                    return False
        return not stack