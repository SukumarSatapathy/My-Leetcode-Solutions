# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def dfs(self, root, k, aux):
        if not root:
            return False
        
        if k - root.val in aux:
            return True
        
        aux.add(root.val)
        l = self.dfs(root.left, k, aux)
        r = self.dfs(root.right, k, aux)
        return l or r
    
    def findTarget(self, root: TreeNode, k: int) -> bool:
        aux = set()
        return self.dfs(root, k, aux)