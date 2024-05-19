import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static int getMaxConsecutiveOnes(int arr[], int n)
    {
    	int res = 0,count=0;
    	for(int i=0;i<n;i++){
    	    if(arr[i]!=1){
    	         res=Math.max(res,count);
    	         count=0;
    	    } else{
    	        count++;
    	        res=Math.max(res,count);
    	    }
    	}
    	
    	return res;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {1,0,1,1,1,1,0,1,1}, n = 9;

      System.out.println(getMaxConsecutiveOnes(arr, n));

    } 

}