// ******** Kadane's Algorithm ***************

/*
Given an array arr[] of integers, find out the maximum difference between any two elements
such that larger element appears after the smaller number.
*/

/*
Input : arr = {2, 3, 10, 6, 4, 8, 1}
Output : 8
Explanation : The maximum difference is between 10 and 2.

Input : arr = {7, 9, 5, 6, 3, 2}
Output : 2
Explanation : The maximum difference is between 9 and 7.

*/


import static java.lang.Math.max;

public class Main {
    int maxDiff(int[] arr,int size){
        int result=arr[size-1]-arr[size-2];
        int suffixmax=arr[size-1];
        for(int i=size-2;i>=0;i--){
            result=max(result,suffixmax-arr[i]);
            suffixmax=max(suffixmax,arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Main maxdiff = new Main();
        int[] arr = {7, 9, 5, 6, 3, 2};
        System.out.println("Maximum difference is " + maxdiff.maxDiff(arr, arr.length));
    }
}