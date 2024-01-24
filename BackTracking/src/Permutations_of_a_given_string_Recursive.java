import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Permutations_of_a_given_string_Recursive {

        public List<String> find_permutation(String S) {
            // Code here
            List<String> res = new ArrayList<>();
            permutation(res,S,"",S.length());
            Collections.sort(res);
            return res;

        }


        public void permutation(List<String> res, String ip, String op, int n  ){

            if(n==0){
                res.add(op);
                return;
            }

            HashSet<Character> hs = new HashSet<>();
            for(int i=0;i<ip.length();i++){

                if(!hs.contains(ip.charAt(i))){
                    hs.add(ip.charAt(i));
                    String newIp =  ip.substring(0,i)+ ip.substring(i+1,ip.length());
                    String newOp = op+ip.charAt(i);
                    permutation(res,newIp,newOp,newIp.length());
                }
            }

            return;
        }



}


