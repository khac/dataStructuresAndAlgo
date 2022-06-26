// 1423. Maximum Points You Can Obtain from Cards
// https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
// topics: dynamic programming, arrays

import java.util.Arrays;

class maximumPointsYouCanObtainFromCards {
    public static void main (String[] args) {
        System.out.println(maxP(new int[]{1,2,3,4,5,6,1}, 3));
        System.out.println(maxP(new int[]{2,2,2}, 2));
        System.out.println(maxP(new int[]{9,7,7,9,7,7,9}, 7));
    }

    public static int maxP(int[] cardPoints, int k) {
        if(k == cardPoints.length) {
            return Arrays.stream(cardPoints).reduce(0, (a, b) -> a+b);
        }

        int sumk = Arrays.stream(cardPoints, 0, k).reduce(0, (a, b) -> a+b);
        int maxk = sumk;
        for(int i=0; i<k; i++) {
            sumk -= cardPoints[k-1-i];
            sumk += cardPoints[cardPoints.length-1-i];
            maxk = Math.max(sumk, maxk);
        }
        return maxk;
    }
}