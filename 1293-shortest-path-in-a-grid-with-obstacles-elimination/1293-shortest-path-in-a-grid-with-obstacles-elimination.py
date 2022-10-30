class Solution:
    def shortestPath(self, grid: list[list[int]], k: int) -> int:
        
        m, n = len(grid), len(grid[0])
        # [1] this check significantly improves runtime, i.e.,
        #    we can use path (0,0) -> (0,n-1) -> (m-1,n-1)
        if k >= m + n - 2: return m + n - 2
       
        # [2] we use deque to store and update a BFS state that is
        #    (x, y, obstacles we can destroy, steps done so far)
        dq = deque([(0, 0, k, 0)])
        # [3] we also keep track of visited cells
        seen = set()
        
        while dq:
            i, j, k, s = dq.popleft()
            # [4] successfully reached lower right corner
            if (i,j) == (m-1,n-1) : return s
            
            # [5] scan all possible directions
            for ii, jj in [(i+1,j),(i-1,j),(i,j+1),(i,j-1)]:
                # [6] check boundaries and obstacles
                if 0 <= ii < m and 0 <= jj < n and k >= grid[ii][jj]:
                    # [7] make (and remember) a step
                    step = (ii, jj, k-grid[ii][jj], s+1)
                    if step[0:3] not in seen:
                        seen.add(step[0:3])
                        dq.append(step)
        
        # [8] failed to reach lower right corner
        return -1