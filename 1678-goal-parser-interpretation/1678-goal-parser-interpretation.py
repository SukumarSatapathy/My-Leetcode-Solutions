class Solution:
    def interpret(self, command: str) -> str:
        mapped = {'G':'G','()':'o','(al)':'al'}
        tmp = ''
        res = ''
        for i in command:
            tmp += i
            if tmp in mapped:
                res += mapped[tmp]
                tmp = ''
        return res