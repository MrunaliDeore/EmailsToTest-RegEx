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
	
	public static boolean lastname(String lastname) {
		String regex = "[A-Z]{1}[a-z]{3,6}";
		Pattern pattern = Pattern.compile(regex);
		Matcher ma = pattern.matcher(lastname);
		System.out.println("The given last name is : " +lastname + "->" + ma.matches());
		return ma.matches();
	}
	
	public static boolean email(String email) {
		String regex = "[a-z]{3}(.+)[a-z]{3}@[bl](.+)[co](.+)";
		Pattern pattern = Pattern.compile(regex);
		Matcher ma = pattern.matcher(email);
		System.out.println("The given email is : " +email + "->" + ma.matches());
		return ma.matches();
	}
	
}



