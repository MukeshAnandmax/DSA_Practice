public class Day1 {
/**
 *
 * Q3. Kth Symbol - Hard
 * Solved
 * feature icon
 * Using hints is now penalty free
 * Use Hint
 * Problem Description
 * On the first row, we write a 0. Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.
 *
 * Given row number A and index B, return the Bth indexed symbol in row A. (The values of B are 0-indexed.).
 *
 *
 *
 * Problem Constraints
 * 1 <= A <= 105
 *
 * 0 <= B <= min(2A - 1 - 1 , 1018)**/
//https://www.scaler.com/academy/mentee-dashboard/class/89304/homework/problems/31788/?navref=cl_pb_nv_tb
    public class Solution {
        public int solve(int A, long B) {

            if(B==0){
                return 0;
            }

            int x = solve(A-1,B/2);

            if(B%2!=0){

                x= 1-x;
            }
            return x;
        }
    }



}
