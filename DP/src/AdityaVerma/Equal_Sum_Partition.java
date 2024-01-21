package AdityaVerma;

import java.util.Arrays;

public class Equal_Sum_Partition {


        static int[][] dp;
        static int equalPartition(int N, int nums[])
        {
            // code here

            long sum =0;
            for(int i: nums){
                sum+=i;
            }
            if(sum%2!=0){
                return 0;
            }
            dp =  new int[nums.length+1][((int)sum/2)+1];
            for(int[] i:dp){
                Arrays.fill(i,-1);
            }
            return subset(nums.length,nums,(int)sum/2);

        }

        public static int subset( int n, int[] arr,int sum){

            if(sum==0){
                return 1;
            }
            if(n==0){
                return 0;
            }

            if(dp[n-1][sum]!=-1){
                return dp[n-1][sum];
            }


            if(arr[n-1]>sum){
                dp[n-1][sum] =  subset(n-1,arr,sum);
                return dp[n-1][sum];
            }else{
                dp[n-1][sum] = Math.max( subset(n-1,arr,sum-arr[n-1]) ,subset(n-1,arr,sum));
                return dp[n-1][sum];
            }




        }



}
