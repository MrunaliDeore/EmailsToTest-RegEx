package Junit;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassRefEx {

	public static boolean firstname(String name) {
		String regex = "[A-Z]{1}[a-z]{3,6}";
		Pattern pattern = Pattern.compile(regex);
		Matcher ma = pattern.matcher(name);
		System.out.println("The given first name is : " +name + "->" + ma.matches());
		return ma.matches();
	}
	
}



