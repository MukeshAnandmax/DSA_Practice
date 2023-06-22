public class Q2_IsPrime {
/*
Problem Description
Given a number A. Return 1 if A is prime and return 0 if not.

Note :
The value of A can cross the range of Integer.
 */
-----------------------------------------Final Sub----------------------------------------
    public class Solution {
        public int solve(Long A) {

            // int factcount=0;
            if (A==1){return 0;}
            if (A==2){return 1;}

            if (A%2==0){return 0;}


            for(int i=3;i<=A/i;i+=2){
                if(A%i==0){
                    return 0;
                }

            }
            return 1;
        }
    }
//67010446483


}
//-----------------------------------------Sub-1----------------------------------------
    /*
    public class Solution {
    public int solve(Long A) {
        if(primeCount(A)==2){
            return 1;
        }
        return 0;
    }

      public int primeCount(Long A) {
          int factcount=0;
          for(int i=1;i*i<=A;i++){
              if(A%i==0){
                  if(A/i==i){
                      factcount+=1;
                    }
                    else{
                          factcount+=2;
                    }
                }
            }
            return factcount;
        }
}

     */


//-----------------------------------------Sub-2----------------------------------------

/*
public class Solution {
    public int solve(Long A) {

          int factcount=0;
          for(int i=1;i*i<=A;i++){
              if(A%i==0){
                  if(A/i==i){
                      factcount+=1;
                      if(factcount>2){return 0;}


                    }
                    else{
                          factcount+=2;
                          if(factcount>2){return 0;}
                    }
                }
            }
            return factcount==2?1:0;
        }
}

 */


//-----------------------------------------Sub-3----------------------------------------

/*
public class Solution {
    public int solve(Long A) {

        // int factcount=0;
        if (A==1){return 0;}
        for(int i=2;i*i<=A;i++){
            if(A%i==0){
                return 0;

            }

        }
        return 1;
    }
}
*/

//-----------------------------------------Sub-4----------------------------------------
/*
public class Solution {
    public int solve(Long A) {

         // int factcount=0;
         if (A==1){return 0;}
         if (A==2){return 1;}

         if (A%2==0){return 0;}


          for(int i=3;i*i<=A;i+=2){
              if(A%i==0){
                 return 0;
                }

            }
            return 1;
        }
}

 */

//-----------------------------------------Sub-5(Correct)----------------------------------------
/*
public class Solution {
    public int solve(Long A) {

         // int factcount=0;
         if (A==1){return 0;}
         if (A==2){return 1;}

         if (A%2==0){return 0;}


          for(int i=3;i<=Math.sqrt(A);i+=2){
              if(A%i==0){
                 return 0;
                }

            }
            return 1;
        }
}
//67010446483
 */