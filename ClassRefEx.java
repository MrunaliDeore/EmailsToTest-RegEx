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
	
	public static boolean mobile(String mobile) {
		String regex = "(91)?[7-9][0-9]{9}";
		Pattern pattern = Pattern.compile(regex);
		Matcher ma = pattern.matcher(mobile);
		System.out.println("The given mobile is : " +mobile + "->" + ma.matches());
		return ma.matches();
	}
	
	public static boolean password(String password) {
		String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z"
				+ "\\d@$!%*?&]{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher ma = pattern.matcher(password);
		System.out.println("The given password is : " +password + "->" + ma.matches());
		return ma.matches();
	}
}



