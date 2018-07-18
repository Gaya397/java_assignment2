package com.practice;

public class Avg {
	public static float FindAvg(int arr[])
	{ 
	    float avge;
	    int sum=0;
	    int n=arr.length;
	    for(int i=0;i<arr.length;i++)
	    {
	        sum=sum+arr[i];
	    
	    }
	    avge    =(float)sum/n;

	return avge;
	}
	public static int CheckMax(int arr [])
	{ 
	        int maxValue = arr[0]; 
	        for(int i=1;i < arr.length;i++){ 
	          if(arr[i] > maxValue){ 
	             maxValue = arr[i]; 
	          } 
	        } 
	        return maxValue; 
	      }
	public static int CheckMin(int arr[])
	{ 
	        int minValue = arr[0]; 
	        for(int i=1;i<arr.length;i++){ 
	          if(arr[i] < minValue){ 
	            minValue = arr[i]; 
	          } 
	        } 
	        return minValue; 
	}

}
