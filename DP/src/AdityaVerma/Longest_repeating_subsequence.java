package AdityaVerma;

import java.util.Arrays;

public class Longest_repeating_subsequence {
    
        int[][]dp;
        public int LongestRepeatingSubsequence(String str)
        {
            // code here
            int n = str.length();
            dp = new int[n+1][n+1];

            for(int[] i:dp){
                Arrays.fill(i,-1);
            }

            return lcs(str,n,n);
        }

        public int lcs(String A,int m, int n){

            if(m==0||n==0){
                return 0;
            }


            if(dp[m][n]!=-1){
                return dp[m][n];
            }

            if(A.charAt(m-1)==A.charAt(n-1) && m!=n){
                dp[m][n]= lcs(A,m-1,n-1)+1;
                return dp[m][n];
            }
            else{
                dp[m][n]= Math.max( lcs(A,m-1,n),lcs(A,m,n-1)  );
                return dp[m][n];
            }



        }
    }



