/*package whatever //do not write package name here */

import java.io.*;


class GFG {
    
    public static void frequncies(int arr[],int size){
    
       int count=1;
       int ele = arr[0];
       for(int i=1;i<size;i++){
           if(arr[i]!=ele){
               System.out.println(ele+" - "+count);
               count=0;
               ele=arr[i];
           }
           count++;
       }
       System.out.println(ele+" - "+count);
}
	public static void main (String[] args) {
	 int arr[]={10,10,10,10};
	 frequncies(arr,4);
	}
}