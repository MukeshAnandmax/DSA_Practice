package AdityaVerma;

import java.util.Arrays;

public class Rod_Cutting_Problem {

        int[][] dp;
        public int cutRod(int price[], int n) {
            //code here
            dp =  new int[n+1][n+1];

            for(int[] i:dp){
                Arrays.fill(i,-1);
            }

            return cutRod1(price, n ,n);

        }

        public int cutRod1(int[] price,int n, int len ){

            if(n==0 || len ==0){
                return 0;
            }

            if(dp[n][len]!=-1){
                return dp[n][len];
            }

            if(n>len){
                dp[n][len]= cutRod1( price,n-1,len );
                return dp[n][len];
            }else{

                dp[n][len]= Math.max( price[n-1]+  cutRod1( price,n,len-n ),
                        cutRod1( price,n-1,len ));
                return dp[n][len];

            }




        }
    }



