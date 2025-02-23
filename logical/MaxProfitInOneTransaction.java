package logical;

public class MaxProfitInOneTransaction {


    public static void main(String[] args) {
        int[] prices= {20,10,30,90,50,12,110,50};
        System.out.println(maxProfit(prices));

    }
//    op=100
public static int maxProfit(int [] prices){
  int maxP=0;
  int minPrice=Integer.MAX_VALUE;

   for(int price: prices){
       minPrice=Math.min(minPrice,price);
       maxP=Math.max(maxP, price-minPrice);
    }
    return maxP;
}

}
