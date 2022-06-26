// 1. Two Sum
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.
// https://leetcode.com/problems/two-sum/
// topics: hashmap, arrays

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSumFunc(new int[] {2,7,11,15}, 18)));
        System.out.println(Arrays.toString(twoSumFunc(new int[] {3,2,4}, 6)));
        System.out.println(Arrays.toString(twoSumFunc(new int[] {2,2}, 4)));
    }

    public static int[] twoSumFunc(int[] arr, int target) {
        Map<Integer, Integer> posIndex = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            posIndex.put(arr[i], i);
        }
        for(int i=0; i<arr.length; i++) {
            int reqd = target-arr[i];
            if (posIndex.containsKey(reqd) && posIndex.get(reqd) != i){
                return new int[] {i, posIndex.get(reqd)};
            }
        }
        return null;
    }
}
