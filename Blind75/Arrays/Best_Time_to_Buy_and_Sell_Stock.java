public class Best_Time_to_Buy_and_Sell_Stock {

    /***************************Approach 1*********************************************/

    public int maxProfit(int[] arr) {
            int buy=arr[0];
            int sell=arr[0],profit=0;
            int n = arr.length;

            for(int i=1;i<n;i++){

                if(arr[i]<buy){
                    buy=arr[i];
                    sell=buy;
                }
                sell=arr[i];
                profit=Math.max(profit,sell-buy);

            }


            return profit;
        }

    /***************************Approach 2*********************************************/
    public int maxProfit(int[] prices) {

        int minTN =Integer.MAX_VALUE;
        int profit =0;

        for(int i=0;i<prices.length;i++){
            minTN= Math.min(minTN,prices[i]);
            profit =Math.max(profit, prices[i]-minTN);
        }

        return profit;

    }

}
