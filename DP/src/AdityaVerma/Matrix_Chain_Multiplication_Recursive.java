package AdityaVerma;

public class Matrix_Chain_Multiplication_Recursive {

        static int matrixMultiplication(int N, int arr[])
        {
            // code here
            return solve(1,arr.length-1,arr);
        }

        public static int solve(int i,int j,int[] arr){

            if(i>=j){
                return 0;
            }
            int min = Integer.MAX_VALUE;
            for(int k=i;k<=j-1;k++){

                int temp = solve(i,k,arr)+ solve(k+1,j,arr)+ arr[i-1]*arr[k]*arr[j];

                if(min>temp){
                    min = temp;
                }


            }

            return min;

        }
    }



