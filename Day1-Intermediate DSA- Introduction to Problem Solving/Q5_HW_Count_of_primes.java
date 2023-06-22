public class Q5_Count_of_primes {


    /*
    Problem Description
You will be given an integer n. You need to return the count of
prime numbers less than or equal to n.
     */

    public class Solution {
        public int solve(int A) {

            if(A==1||A==0){return 0;}
            int primeCount=0;

            for(int i=2;i<=A;i++){
                if(isPrime(i)==1){
                    primeCount++;
                }

            }

            return primeCount;

        }

        public int isPrime(int A){

            if(A==1||A==0){return 0;}

            if(A==2){return 1;}
            if(A%2==0){return 0;}

            for(int i=3;i<=A/i;i+=2){

                if(A%i==0){return 0;}

            }
            return 1;

        }
    }

}
