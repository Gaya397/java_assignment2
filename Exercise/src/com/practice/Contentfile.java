package com.practice;
import java.nio.file.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Contentfile {
	  public static String fileread(String filename  )
	  {
	  try {
	  
		  File file= new File(filename);
		  BufferedReader br=new BufferedReader(new FileReader(file));
		  String st;
		  while((st=br.readLine())!=null)
			
		  return (st.toUpperCase());
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  return null;
	 
	  
		}
	  public static int filelength(String filename  )
	  {
	  try {
	  
		  File file= new File(filename);
		  BufferedReader br=new BufferedReader(new FileReader(file));
		  String st;
		  while((st=br.readLine())!=null)
			
		  return (st.length());
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  return 0;
	 
	  
		}
	  
}


