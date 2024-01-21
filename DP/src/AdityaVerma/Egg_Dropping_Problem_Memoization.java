package AdityaVerma;

import java.util.Arrays;

public class Egg_Dropping_Problem_Memoization {



        //Function to find minimum number of attempts needed in
        //order to find the critical floor.
        static int dp[][];
        static int eggDrop(int e, int f)
        {
            dp = new int[201][201];

            for(int[] i:dp){
                Arrays.fill(i,-1);
            }


            return eggDrop1( e,  f);

        }


        static int eggDrop1(int e, int f)
        {

            if(dp[e][f]!=-1){
                return dp[e][f];
            }

            if(f==0|| f==1){
                return f;
            }

            if(e==1){
                return f;
            }


            int min = Integer.MAX_VALUE;
            for(int i=1;i<=f;i++){

                int temp = 1+ Math.max(eggDrop1(e-1,i-1 ),eggDrop1(e,f-i ));
                min = Math.min(temp,min);

            }

            dp[e][f]=min;

            return dp[e][f];

        }





    }



