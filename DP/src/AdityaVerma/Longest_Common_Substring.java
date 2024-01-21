package AdityaVerma;

public class Longest_Common_Substring {

        int[][]dp;
        int longestCommonSubstr(String A, String B, int n, int m){
            // code here
            int x= n;
            int y= m;
            dp = new int[x+1][y+1];
            int res=0;

            for(int i=0;i<dp.length;i++){
                dp[i][0]=0;
            }

            for(int i=0;i<dp[0].length;i++){
                dp[0][i]=0;
            }

            for(int i=1;i<=x;i++){
                for(int j=1;j<=y;j++){

                    if(A.charAt(i-1)==B.charAt(j-1)){
                        dp[i][j] =  1+dp[i-1][j-1];

                        res =  Math.max(res,dp[i][j] );

                    }else{
                        dp[i][j] =0;
                    }


                }
            }

            return res;
        }




}
