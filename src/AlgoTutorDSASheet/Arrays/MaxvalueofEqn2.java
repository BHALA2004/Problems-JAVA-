package AlgoTutorDSASheet.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class MaxvalueofEqn2 {
    public static int findMaxValueOfEquation(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
            return (b[1] - b[0]) - (a[1] - a[0]);
        });
        int ans = Integer.MIN_VALUE;
        for(int i = 0;i<points.length;i++){
            //Neglecting unwanted from priority queue so want we attain below answer but the pq is not empty always
            while(!pq.isEmpty() && points[i][0] - pq.peek()[0] > k){
                pq.poll();
            }
            if(!pq.isEmpty()){
                int temp[] = pq.peek();
                int x1 = temp[0];
                int y1 = temp[1];
                int x2 = points[i][0];
                int y2 = points[i][1];
                ans = Math.max(ans,y1+y2+Math.abs(x2-x1));
            }
            pq.offer(new int[]{points[i][0], points[i][1]});
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] points = {{1,3},{2,0},{5,10},{6,-10}};int
        k =1;
        System.out.println(findMaxValueOfEquation(points,k));
    }
}
