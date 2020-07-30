package com.my;

/**
 * 
 * @author bao
 *
 */
public class Istanceof {

	public static void main(String[] args) {

		
		 /* 老代码
		 Object str = "aaaaaa";
		 if (str instanceof String) {
		 	String s = (String) str;
		 	System.out.println(s);
		 	
		 }
		*/
		
		Object str = "abbcd";
		 
		if(str instanceof String s) {
			System.out.println(s);
		}
	}
	
}
