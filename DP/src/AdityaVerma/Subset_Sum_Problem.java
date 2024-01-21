package AdityaVerma;

import java.util.Arrays;

public class Subset_Sum_Problem {


        static int[][] dp;

        static Boolean isSubsetSum(int N, int arr[], int sum){

            dp= new int[N+1][sum+1];

            for(int[] i:dp){
                Arrays.fill(i,-1);
            }



            return isSubsetSum1(N,arr,sum)==0?false:true;

        }

        static int isSubsetSum1(int N, int arr[], int sum){

            if(sum==0){
                return 1;
            }
            if(N==0){
                return 0;
            }


            if(dp[N-1][sum]!=-1){
                return dp[N-1][sum];
            }


            if(arr[N-1]>sum){

                dp[N-1][sum]= isSubsetSum1(N-1, arr, sum);
                return dp[N-1][sum];

            }else{
                dp[N-1][sum] =  Math.max(
                        isSubsetSum1(N-1, arr, sum-arr[N-1])
                        ,isSubsetSum1(N-1, arr, sum));

                return dp[N-1][sum];
            }



        }




}
