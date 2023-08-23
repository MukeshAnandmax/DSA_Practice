import java.util.HashMap;

public class Day1 {


    /******************************************************--Q1--***********************************************/
    /***
     *
     * Q1. Frequency of element query
     * Solved
     * feature icon
     * Using hints is now penalty free
     * Use Hint
     * Problem Description
     * Given an array A. You have some integers given in the array B.
     * For the i-th number, find the frequency of B[i] in the array A and return a list containing all the frequencies.
     *
     *
     * Problem Constraints
     * 1 <= |A| <= 105
     * 1 <= |B| <= 105
     * 1 <= A[i] <= 105
     * 1 <= B[i] <= 105
     *
     *
     * */
    //https://www.scaler.com/academy/mentee-dashboard/class/89308/assignment/problems/31492?navref=cl_tt_lst_sl
    public class Solution1 {
        public int[] solve(int[] A, int[] B) {


            HashMap<Integer,Integer> hm = new  HashMap<Integer,Integer>();


            for(int i=0;i<A.length;i++){


                hm.put(A[i], hm.getOrDefault(A[i] ,0)+1);


            }


            for(int i=0;i<B.length;i++){

                B[i] =  hm.getOrDefault(B[i] ,0);
            }
            return B;
        }
    }



}
