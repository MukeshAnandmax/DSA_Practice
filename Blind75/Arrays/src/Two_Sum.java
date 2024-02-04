import java.util.HashMap;

public class Two_Sum {

//https://leetcode.com/problems/two-sum/submissions/981760935/
    /***************************Brute Force*********************************************/
        public int[] twoSum(int[] nums, int target) {

            int[] res = new int[2];
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target){
                        res[0]=i;
                        res[1]=j;
                        //System.out.println(i+":"+j);
                        return res;

                    }
                    //System.out.println(i+"::"+j);
                }
            }

            return res;
        }

    /***************************Optimize*********************************************/
    public int[] twoSum1(int[] nums, int target) {

        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] res =  new int[2];

        for(int i=0;i<nums.length;i++){

            int diff = target-nums[i];
            if(hm.containsKey(diff)){

                res[0] = hm.get(diff);
                res[1]=i;
                break;

            }
            hm.put(nums[i],i);
        }



        return res;
    }
}
