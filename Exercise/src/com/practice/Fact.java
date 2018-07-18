package com.practice;

public class Fact{
	
	   
		    

		    public int intFact(int i,int fn)
		    {
		    	
		        while (true)
		        {
		            System.out.printf("Factorial of%1$d is %2$d.\n", i,fn);
		            if (Integer.MAX_VALUE / fn < (i+1)) {
		            	System.out.printf("Factorial of %d is out of range.\n",(i+1));
		            	break;
		            	
		                
		            }
		           
		            i++;
		            fn *= i;
		        }
		        return fn;
		         
		    }
		    
		    
		    public long printLongFact(long input,long fact)
		    {
		        
		        while (true)
		        {
		         System.out.printf("Factorial of %1$d is %2$d.\n",input,fact);
		            if (Long.MAX_VALUE / fact < (input+1)) {
		            	System.out.printf("Factorial of %d is out of range.\n",(input+1));
		               break; 
		                
		            }
		            
		            input ++;
		            fact *= input;
		        }
		        return fact;
		         
		    }
		}
		    
	