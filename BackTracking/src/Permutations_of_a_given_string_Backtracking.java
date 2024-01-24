import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Permutations_of_a_given_string_Backtracking {



        public List<String> find_permutation(String S) {
            // Code here
            List<String> res = new ArrayList<>();
            permutation(res,S.toCharArray(),0);
            Collections.sort(res);
            return res;

        }
        public void swap(char[] str,int i,int j){
            char temp = str[i];
            str[i]=str[j];
            str[j]=temp;
        }

        public void permutation(List<String> res, char[] str,int start  ){

            if(start == str.length-1){
                res.add(new String(str));
                return;
            }

            HashSet<Character> hs =new HashSet<>();
            for(int i=start;i<str.length;i++){


                if(!hs.contains(str[i])){

                    hs.add(str[i]);
                    swap(str,start,i);
                    permutation(res,str,start+1);
                    swap(str,i,start);

                }



            }

            return;




    }




}
