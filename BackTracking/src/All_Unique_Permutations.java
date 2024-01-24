import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class All_Unique_Permutations {

//https://www.scaler.com/academy/mentee-dashboard/class/127583/assignment/problems/134?navref=cl_tt_nv

//    Given an array A of size N denoting collection of numbers that might contain duplicates, return all possible unique permutations.
//
//    NOTE: No 2 entries in the permutation sequence should be the same.



        public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            permutation(res,A,0);
            return res;
        }


        public void permutation(ArrayList<ArrayList<Integer>>res, ArrayList<Integer> A,int start  ){

            if(start == A.size()-1){
                res.add(new ArrayList<>(A));
                return;
            }

            HashSet<Integer> hs =new HashSet<>();
            for(int i=start;i<A.size();i++){


                if(!hs.contains(A.get(i))){

                    hs.add(A.get(i));
                    Collections.swap(A,start,i);
                    permutation(res,A,start+1);
                    Collections.swap(A,i,start);

                }



            }

            return;
        }
    }



