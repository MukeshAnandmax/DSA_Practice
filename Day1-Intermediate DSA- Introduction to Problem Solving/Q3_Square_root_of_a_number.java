public class Q3_Square_root_of_a_number {

/*
Problem Description

Given a number A. Return square root of the number if it is perfect square otherwise return -1.

Note: A number is a perfect square if its square root is an integer.

Problem Constraints

1 <= A <= 108
 */

    public class Solution {
        public int solve(int A) {


            for(int i=1;i<=A/i;i++){

                if(i==A/i){return i;}
            }

            return -1;

        }
    }
//84226506

    //-----------------------------------------Sub-1----------------------------------------

    /*
    public class Solution {
    public int solve(int A) {


        for(int i=1;i<=A;i++){

            if(i==A/i){return i;}
        }

        return -1;

    }
}

     */


}
