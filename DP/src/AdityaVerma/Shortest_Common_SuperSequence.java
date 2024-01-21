package AdityaVerma;

import java.util.Arrays;

public class Shortest_Common_SuperSequence {



        static int[][] dp;
        //Function to find length of shortest common supersequence of two strings.
        public static int shortestCommonSupersequence(String X,String Y,int m,int n)
        {
            //Your code here
            dp =  new int[m+1][n+1];
            for(int[]i:dp){
                Arrays.fill(i,-1);
            }

            return m+n-lca(X,Y,m,n);
        }
        public static int lca(String s1, String s2, int m, int n){

            if(m==0||n==0){
                return 0;
            }


            if(dp[m][n]!=-1){
                return dp[m][n];
            }

            if(s1.charAt(m-1)==s2.charAt(n-1)){
                dp[m][n]=lca(s1,s2,m-1,n-1)+1;
                return dp[m][n];

            }else{
                dp[m][n]= Math.max(lca(s1,s2,m-1,n),lca(s1,s2,m,n-1));
                return dp[m][n];
            }


        }

}
