import java.util.ArrayList;
import java.util.Collections;

public class Permutations {

//    Problem Description
//    Given an integer array A of size N denoting collection of numbers , return all possible permutations.
//
//            NOTE:
//
//    No two entries in the permutation sequence should be the same.
//    For the purpose of this problem, assume that all the numbers in the collection are unique.
//    Return the answer in any order
//    https://www.scaler.com/academy/mentee-dashboard/class/127583/assignment/problems/138?navref=cl_tt_nv
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

        for(int i=start;i<A.size();i++){

            Collections.swap(A,start,i);
            permutation(res,A,start+1);
            Collections.swap(A,i,start);

        }
        return;
    }
}
