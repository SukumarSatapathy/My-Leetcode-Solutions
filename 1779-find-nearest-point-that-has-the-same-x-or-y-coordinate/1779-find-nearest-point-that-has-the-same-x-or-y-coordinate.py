class Solution:
    def nearestValidPoint(self, x1, y1, points):
        minIdx, minDist = -1, inf
        for i,point in enumerate(points):
            x2, y2 = point
            if x1 == x2 or y1 == y2:
                dist = abs(x1-x2) + abs(y1-y2)
                if dist < minDist:
                    minIdx = i
                    minDist = min(dist,minDist)
        return minIdx