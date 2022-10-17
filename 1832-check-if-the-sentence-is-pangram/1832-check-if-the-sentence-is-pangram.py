class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        alphabet = set('abcdefghijklmnopqrstuvwxyz')
        return alphabet == set(sentence)