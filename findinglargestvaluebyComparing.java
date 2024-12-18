package com.java.collections;
import java.util.*;
public class findinglargestvaluebyComparing {
	public static void main(String[] args){
	    int[] data={123,2345,67,90987,4567,3456,234567};
	    int max=findingLargest(data);
	    System.out.println(max);
	  }
	  public static int findingLargest(int data[]){
	    int max= data[0];
	    for(int i=1;i<data.length;i++){
	      if(data[i]>max){
	       max=data[i] ;
	      }
	    }
	    return max;
	  }

}

