package com.java.collections;
import java.util.Arrays;

public class findingLargestValueinArray {
	public static void main(String[] args){
	    int arr[]={123,2345,345,345,345,23456};
	    Arrays.sort(arr);
	    int finals=arr[arr.length-1];
	    System.out.println(finals);
	  }
}
	