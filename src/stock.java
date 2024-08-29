class Solution {
    public static int maxProfit(int[] prices) {
        int i=0,j=1,profit=0,pre_profit=profit,n=prices.length;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(prices[i]<prices[j]){
                    pre_profit=profit;
                    profit=prices[j]-prices[i];
                    if(pre_profit>profit){
                        profit=pre_profit;
                    }
                }

            }
        }
        return profit;
    }
    public static void main(String[] args){
        int[] arr={7,6,4,3,1};
        int m = maxProfit(arr);
        System.out.println(m);
    }
}