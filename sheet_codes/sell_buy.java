package sheet_codes;
public class sell_buy {
    public static void main(String[] args) {
        int prices[]={2,4,1};int max=0;
        int lowPrice=prices[0],profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]-lowPrice<=profit){
                lowPrice=prices[i];
            }
            else if(profit<=prices[i]-lowPrice){
                profit=prices[i]-lowPrice;
                max=prices[i];
            }
            System.out.println(lowPrice);

        }
        System.out.println("                "+profit);
        
        System.out.println(max);
        
    }
}
