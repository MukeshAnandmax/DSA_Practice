package AdityaVerma;

import java.util.Arrays;

public class Minimum_number_of_deletions_and_insertions {



        static int[][]dp;
        public int minOperations(String s1, String s2)
        {
            // Your code goes here
            if(s1.equals(s2)){
                return 0;
            }
            int x = s1.length();
            int y = s2.length();
            dp = new int[x+1][y+1];

            for(int[] i:dp){
                Arrays.fill(i,-1);
            }

            int x1= lcs1(x,y,s1,s2);

            return s1.length()-x1 +s2.length()-x1;

        }

        static int lcs1(int x, int y, String s1, String s2)
        {
            // your code here

            //System.out.print(x+""+s1.length());
            // System.out.print(y+""+s2.length());

            if(x==0|| y==0){
                return 0;
            }
            if(dp[x][y]!=-1){
                return dp[x][y];
            }


            if(s1.charAt(x-1)==s2.charAt(y-1)){
                dp[x][y]= 1+lcs1(x-1,y-1,s1,s2);
                return dp[x][y];
            }else{
                dp[x][y]= Math.max(lcs1(x-1,y,s1,s2) ,lcs1(x,y-1,s1,s2));
                return dp[x][y];
            }


        }
    }


