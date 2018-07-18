package com.practice;

public class Myclass {
	   public int palin(int n)
       {
           int a = 0,x;
          int m;
          m=n;
           while(n > 0)
           {
               x = n % 10;
               a = a * 10 + x;
               n = n / 10;
           }
           if(a == m)
           {
              return 1;
           }
           else
           {
              return 0;
           }
		

}
	   public int power(int n) {
		   
		   if(n == 0)
			    return 0;
			  while(n != 1)
			  {    
			   if(n % 4 != 0)
			      return 0;
			    n = n / 4;      
			  }
			  return 1;
			} 
	   }

	

