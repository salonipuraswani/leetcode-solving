//problem statemebt 
// Given an array of points where each point is represented as points[i] = [xi, yi] on the X-Y plane and an integer k, return the k closest points to the origin (0, 0).

// The distance between two points on the X-Y plane is the Euclidean distance, defined as: 

// sqrt( (x2 - x1)2 + (y2 - y1)2 )
//url:https://www.geeksforgeeks.org/problems/k-closest-points-to-origin--172242/1


class Solution {
    public int[][] kClosest(int[][] points, int k) {
       PriorityQueue<int[]> pq = new PriorityQueue<>(new SQComparator());
        for(int i=0;i<points.length;i++){
            pq.add(points[i]);
        }
        int[][] arr=new int[k][2];
        for(int i=0;i<k;i++){
            arr[i]=pq.poll();
        }
        return arr;
    }
}
class SQComparator implements Comparator<int[]> {
    public int compare(int[] a, int[] b) {
        int m=a[0]*a[0]+a[1]*a[1];
        int n=b[0]*b[0]+b[1]*b[1];
        return Integer.compare(m,n);
    }
}
