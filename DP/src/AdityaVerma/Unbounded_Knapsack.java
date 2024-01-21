package AdityaVerma;

import java.util.Arrays;

public class Unbounded_Knapsack {

        static int[][] dp;
        static int knapSack(int N, int W, int val[], int wt[])
        {
            // code here
            dp = new int[N+1][W+1];

            for(int[] i:dp){
                Arrays.fill(i,-1);
            }

            return knapSack1(N,W,val,wt);
        }

        static int knapSack1(int N, int W, int val[], int wt[])
        {
            // code here

            if(N==0|| W==0){
                return 0;
            }
            if(dp[N-1][W]!=-1){
                return dp[N-1][W];
            }

            if(wt[N-1]>W){
                dp[N-1][W]= knapSack1(N-1,W,val,wt);
                return dp[N-1][W];
            }else{
                dp[N-1][W] =   Math.max(val[N-1]+ knapSack1(N,W-wt[N-1],val,wt),
                        knapSack1(N-1,W,val,wt));
                return dp[N-1][W];
            }
        }
    }

