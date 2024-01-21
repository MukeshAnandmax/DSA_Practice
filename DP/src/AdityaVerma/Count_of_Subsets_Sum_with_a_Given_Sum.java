package AdityaVerma;

import java.util.Arrays;

public class Count_of_Subsets_Sum_with_a_Given_Sum {

        int[][] dp;
        int mod = (int)1e9+7;
        public int perfectSum(int arr[],int n, int sum)
        {
            dp=  new int[n+1][sum+1];

            for(int[] i:dp){
                Arrays.fill(i,-1);
            }
            return perfectSum1(arr,n,sum);
        }

        public int perfectSum1(int arr[],int n, int sum)
        {
            // if(sum==0){
            //     return 1;
            // }
            if(n==0){
                if(sum==0){
                    return 1;
                }
                return 0;
            }

            if(dp[n-1][sum]!=-1){
                return dp[n-1][sum];
            }

            if(arr[n-1]>sum){
                dp[n-1][sum]= perfectSum1(arr,n-1,sum);
                return dp[n-1][sum];
            }else{
                dp[n-1][sum] =( perfectSum1(arr,n-1,sum)+perfectSum1(arr,n-1,sum-arr[n-1]))%mod;
                return dp[n-1][sum];
            }

        }
}
