package org.planning.tutorial.HelloMaven;
import org.apache.commons.lang3.StringUtils;
import org.omg.CORBA.PUBLIC_MEMBER;

public class CheckNumeric {

	public static void main(String[] args) {
		String text1="0123a4";
		String text2="01234";
		
		boolean result1 = StringUtils.isNumeric(text1);
		boolean result2 = StringUtils.isNumeric(text2);
	 System.out.print(text1 + "is a numeric ?"+result1);
	 System.out.print(text1 + "is a numeric?"+result2);
	
	
	
	}
	

};
