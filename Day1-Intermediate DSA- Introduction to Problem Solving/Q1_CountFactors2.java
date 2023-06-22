public class Q1CountFactors2 {

    /*
    Problem Description
Given an integer A, you need to find the count of it's factors.

Factor of a number is the number which divides it perfectly leaving no remainder.

Example : 1, 2, 3, 6 are factors of 6
*/


    public class Solution {
        public int solve(int A) {

            int factcount = 0;
            for (int i = 1; i * i <= A; i++) {
                if (A % i == 0) {
                    if (A / i == i) {
                        factcount += 1;
                    } else {
                        factcount += 2;
                    }
                }
            }
            return factcount;
        }
    }


}
