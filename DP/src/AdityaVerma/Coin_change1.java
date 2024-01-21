package AdityaVerma;

import java.util.Arrays;

public class Coin_change1 {

        long[][] dp;
        public long count(int coins[], int N, int sum) {

            dp = new long[N+1][sum+1];

            for(long[] i:dp){
                Arrays.fill(i,-1);
            }

            return count1(coins,N,sum);
        }
        public long count1(int coins[], int N, int sum) {

            if(sum ==0){
                return 1;
            }
            if(N==0){
                return 0;
            }

            if(dp[N-1][sum]!=-1){
                return dp[N-1][sum];
            }

            if(coins[N-1]>sum){
                dp[N-1][sum]= count1(coins,N-1,sum);
                return dp[N-1][sum];
            }else{

                dp[N-1][sum] = count1(coins,N,sum-coins[N-1])+count1(coins,N-1,sum);
                return dp[N-1][sum];
            }


        }
    }

