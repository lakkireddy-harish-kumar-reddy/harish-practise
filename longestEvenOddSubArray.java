import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    
// based on kadanes algorithm
    static int longestEvenOddSubArray(int arr[], int n)
    {
    	int res = 1,count=1;
    	for(int i=1;i<n;i++){
    	    if((arr[i]%2 == 0 && arr[i-1]%2 != 0) || (arr[i]%2 !=0 && arr[i-1]%2 == 0)){
    	         count++;
    	         res=Math.max(res,count);
    	    } else{
    	       count=1;
    	    }
    	}
    	
    	return res;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {5,10,20,6,3,8}, n = 6;

      System.out.println(longestEvenOddSubArray(arr, n));

    } 

}