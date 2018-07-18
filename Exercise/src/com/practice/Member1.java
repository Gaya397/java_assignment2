package com.practice;

public class Member1 {
	
		public static String[] getMemberVariable(String[] strArray)
		{
		Member object=new Member();
		object.name="Harry Potter";
		object.age=30;
		object.salary=(float)2500.3;
		String str=strArray[0].concat(object.name).concat(",").concat(strArray[1]).concat(Float.toString(object.salary)).concat(",").concat(strArray[2]).concat(Integer.toString(object.age));
		return str.split(",");
		}
}
