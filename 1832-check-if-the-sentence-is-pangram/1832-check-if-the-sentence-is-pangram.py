class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        return set('abcdefghijklmnopqrstuvwxyz') == set(sentence)