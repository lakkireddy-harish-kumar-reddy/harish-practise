import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static int MaxSubArraySum(int arr[], int n)
    {
    	 int maxSubArray = arr[0],res = arr[0];
          for(int i=1;i<n;i++){
              maxSubArray = Math.max(maxSubArray+arr[i],arr[i]);
              res = Math.max(res,maxSubArray);
          }
    	 
    	return res;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {-5,1,-2,3,-1,2,-2}, n = 7;

       System.out.println(MaxSubArraySum(arr, n));

    } 

}