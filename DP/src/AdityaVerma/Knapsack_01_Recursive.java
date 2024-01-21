package AdityaVerma;

import java.util.ArrayList;

public class Knapsack_01_Recursive {

        public int solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {
            return knapsack(A,B,C,A.size()-1);
        }

        public int knapsack(ArrayList<Integer> value, ArrayList<Integer> weight, int W, int n){

            if(n==-1 || W ==0){
                return 0;
            }


            if(weight.get(n) <= W){

                return Math.max(
                        (value.get(n)+ knapsack(value,weight,W-weight.get(n),n-1))
                        ,knapsack(value,weight,W,n-1)
                );
            }else{
                return knapsack(value,weight,W,n-1);
            }



        }
    }

}
