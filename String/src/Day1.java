public class Day1 {

/***
 * Q7. Longest Palindromic Substring
 * Solved
 * feature icon
 * Using hints is now penalty free
 * Use Hint
 * Problem Description
 * Given a string A of size N, find and return the longest palindromic substring in A.
 *
 * Substring of string A is A[i...j] where 0 <= i <= j < len(A)
 *
 * Palindrome string:
 * A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.
 *
 * Incase of conflict, return the substring which occurs first ( with the least starting index).
 *
 *
 *
 * Problem Constraints
 * 1 <= N <= 6000
 *
 *
 * */
//https://www.scaler.com/academy/mentee-dashboard/class/89288/assignment/problems/185/?navref=cl_pb_nv_tb
    public class Solution {
        public String longestPalindrome(String A) {

            String res =""+A.charAt(0);

            for(int i=0;i<A.length();i++){
                int p1 =i;
                int p2 =i;

                String temp = expand(A,p1,p2);

                res = res.length()>=temp.length()?res:temp;
            }

            for(int i=0;i<A.length()-1;i++){
                int p1 =i;
                int p2 =i+1;
                String temp = expand(A,p1,p2);

                res = res.length()>=temp.length()?res:temp;


            }
            return res;
        }
        public String expand(String A, int p1,int p2){

            while(p1>=0 && p2<A.length() && A.charAt(p1) == A.charAt(p2) ){

                p1--;
                p2++;
            }
            return A.substring(p1+1,p2);

        }
    }

}
