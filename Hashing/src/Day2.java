import java.util.HashMap;

public class Day2 {

/*************************************************************--Q1--*****************************************************************/
    /***
     *
     * Q1. Count Pair Sum
     * Solved
     * feature icon
     * Using hints is now penalty free
     * Use Hint
     * Problem Description
     * You are given an array A of N integers and an integer B. Count the number of pairs (i,j) such that A[i] + A[j] = B and i ≠ j.
     *
     * Since the answer can be very large, return the remainder after dividing the count with 109+7.
     *
     * Note - The pair (i,j) is same as the pair (j,i) and we need to count it only once.
     *
     *
     * Problem Constraints
     * 1 <= N <= 105
     * 1 <= A[i] <= 109
     * 1 <= B <= 109
     * */

    //https://www.scaler.com/academy/mentee-dashboard/class/89279/homework/problems/27714?navref=cl_tt_lst_sl

    public class Solution1 {
        public int solve(int[] A, int B) {


            HashMap<Integer,Integer> hm = new  HashMap<Integer,Integer>();

            int count =0;

            for(int i=0;i<A.length;i++){

                int x = B-A[i];

                if(hm.containsKey(x)){
                    count=(count+ hm.get(x))%1000000007;
                }

                hm.put(A[i] ,hm.getOrDefault(A[i],0)+1);

            }
            return count;
        }
    }

    /*************************************************************--Q2--*****************************************************************/

    /***
     *
     *Q2. Subarray Sum Equals K
     * Solved
     * feature icon
     * Using hints is now penalty free
     * Use Hint
     * Problem Description
     * Given an array of integers A and an integer B.
     * Find the total number of subarrays having sum equals to B.
     *
     *
     * Problem Constraints
     *  1 <= length of the array <= 50000
     * -1000 <= A[i] <= 1000
     *
     * */

    //https://www.scaler.com/academy/mentee-dashboard/class/89279/assignment/problems/4827/?navref=cl_pb_nv_tb

    public class Solution2 {
        public int solve(int[] A, int B) {

            int[] psum = new int[A.length];
            HashMap<Integer,Integer> hm = new HashMap<>();
            int count=0;

            psum[0] =A[0];
            for(int i=1;i<A.length;i++){

                psum[i]= psum[i-1]+A[i];

            }

            for(int i=0;i<A.length;i++){

                if(psum[i]==B){
                    count++;

                }
                if(hm.containsKey(psum[i]-B)){

                    count+=hm.get(psum[i]-B);
                }

                hm.put(psum[i], hm.getOrDefault(psum[i],0)+1);

            }
            return count;
        }
    }









}
