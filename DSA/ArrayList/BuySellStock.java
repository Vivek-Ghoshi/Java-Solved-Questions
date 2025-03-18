package DSA.ArrayList;

public class BuySellStock {
    // best time to buy and sell stock 
    public static int bestTimeToBuySell(int[] arr){
        int minValue = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int elem : arr){
            if(elem < minValue){
                minValue = elem;
            }else{
                maxProfit = Math.max(maxProfit,elem - minValue);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,3,4,5,6,2};
        System.out.println(bestTimeToBuySell(arr));

    }
}
