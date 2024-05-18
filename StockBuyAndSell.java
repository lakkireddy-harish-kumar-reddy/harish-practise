/*package whatever //do not write package name here */

import java.io.*;


class GFG {
    
    public static int stockBuyAndSell(int arr[],int size){
      int profit=0;
      for(int i=1;i<size;i++){
          if(arr[i]>arr[i-1]){
              profit+=arr[i]-arr[i-1];
          }
      }
      return profit;
     
    }
	public static void main (String[] args) {
	 int arr[]={1,5,3,1,2,8};
	 int profit = stockBuyAndSell(arr,6);
	 System.out.println(profit);
	}
}