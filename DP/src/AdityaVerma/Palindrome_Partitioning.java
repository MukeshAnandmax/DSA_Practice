package AdityaVerma;

import java.util.Arrays;

public class Palindrome_Partitioning {

        static int[][] dp;
        static int[][] dp2;
        static int palindromicPartition(String str)
        {

            int n = str.length();
            dp = new int[n][n];

            dp2= new int[n][n];
            for(int i[]:dp){
                Arrays.fill(i,-1);
            }
            for(int i[]:dp2){
                Arrays.fill(i,-1);
            }
            for(int i=0;i<dp2.length;i++){
                for(int j=0;j<dp2[0].length;j++){
                    if(i==j){
                        dp2[i][j]=1;
                    }
                }
            }

            return mcm(str,0,str.length()-1);
        }

        public static int mcm( String str, int i,int j){

            if( dp[i][j]!=-1){
                return dp[i][j];
            }

            if(i>=j  || isPalindrom(str,i,j)){

                dp[i][j] =0;
                return 0;
            }




            int temp=0;
            int  ans = Integer.MAX_VALUE;
            for(int k=i;k<=j-1;k++){


                int left=0;
                int right =0;

                if(dp[i][k]!=-1){
                    left = dp[i][k];
                }else{
                    left = mcm( str,i,k);
                    dp[i][k]=left;
                }

                if(dp[k+1][j]!=-1){
                    right =dp[k+1][j];
                }else{
                    right = mcm( str,k+1,j);
                    dp[k+1][j]=right ;
                }

                temp = 1+ left+right;
                ans = Math.min(ans,temp);
            }
            dp[i][j] =ans;

            return dp[i][j];

        }


        public static boolean isPalindrom(String str, int i,int j){

            if(dp2[i][j]!=-1){
                return dp2[i][j]==0?false:true;
            }

            while(i<=j){
                if(str.charAt(i)!=str.charAt(j)){
                    dp2[i][j]=0;
                    return false;
                }
                i++;
                j--;
            }

            dp2[i][j]=1;
            return true;
        }
    }


