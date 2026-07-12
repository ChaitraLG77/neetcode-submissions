class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit =0,profit=0;
        for(int i=0;i<prices.length;i++){
            int r=i;
            while(r<prices.length){
                if(prices[i]<prices[r]){
                     profit = prices[r]-prices[i];
                     maxprofit=Math.max(maxprofit,profit);
                }
                r++;
            }

        }
        return maxprofit;
        
    }
}
