package AdityaVerma;

import java.util.Arrays;

public class Matrix_chain_multiplication_Memoization {



        static int[][] dp = new int[101][101];
        static int matrixMultiplication(int N, int arr[])
        {
            // code here

            for(int[] i:dp){
                Arrays.fill(i,-1);
            }
            return solve(1,arr.length-1,arr);
        }

        public static int solve(int i,int j,int[] arr){

            if(i>=j){
                return 0;
            }

            if(dp[i][j]!=-1){
                return dp[i][j];
            }

            int min = Integer.MAX_VALUE;
            for(int k=i;k<=j-1;k++){

                int temp = solve(i,k,arr)+ solve(k+1,j,arr)+ arr[i-1]*arr[k]*arr[j];
                if(min>temp){
                    min = temp;
                }
            }
            dp[i][j]= min;

            return dp[i][j];

        }
    }



