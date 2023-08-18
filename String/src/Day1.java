public class Day1 {
    /******************************************---Q1----***************************************************/
/**
 * Q1. tolower()
 * Solved
 * feature icon
 * Using hints is now penalty free
 * Use Hint
 * Problem Description
 * You are given a function to_lower() which takes a character array A as an argument.
 *
 * Convert each character of A into lowercase characters if it exists. If the lowercase of a character does not exist, it remains unmodified.
 * The uppercase letters from A to Z are converted to lowercase letters from a to z respectively.
 *
 * Return the lowercase version of the given character array.
 *
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 105
 *
 * */

//https://www.scaler.com/academy/mentee-dashboard/class/89288/assignment/problems/10696?navref=cl_tt_lst_sl

public class Solution1 {
    public char[] to_lower(char[] A) {

        for(int i=0;i<A.length;i++){

            if(A[i]>='A'&& A[i]<='Z'){
                A[i] = (char)(A[i]+32);
            }
        }
        return A;
    }
}
    /******************************************---Q2----***************************************************/


/***
 *
 * Q2. toupper()
 * Solved
 * feature icon
 * Using hints is now penalty free
 * Use Hint
 * Problem Description
 * You are given a function to_upper() consisting of a character array A.
 *
 * Convert each character of A into Uppercase character if it exists. If the Uppercase of a character does not exist, it remains unmodified.
 * The lowercase letters from a to z is converted to uppercase letters from A to Z respectively.
 *
 * Return the uppercase version of the given character array.
 *
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 105
 * */
//https://www.scaler.com/academy/mentee-dashboard/class/89288/assignment/problems/10697?navref=cl_tt_lst_sl

public class Solution {
    public char[] to_upper(char[] A) {

        for(int i=0;i<A.length;i++){

            if(A[i]>='a'&& A[i]<='z'){
                A[i] = (char)(A[i]-32);
            }
        }
        return A;



    }
}






    /******************************************---Q7----***************************************************/

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
    public class Solution7 {
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
