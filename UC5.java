import java.util.regex.*; 
import java.util.*;
class UC5 { 

	public static boolean isValidPassword(String pswd) 
	{ 
		String regex = "^[a-zA-Z0-9\\@\\_\\-\\+\\#\\*]{8,}$";
		Pattern p = Pattern.compile(regex); 
		Matcher m = p.matcher(pswd); 
		return m.matches(); 
	} 

	public static void main(String args[]) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a valid password: ");
		String pswd = sc.nextLine();
		if(isValidPassword(pswd)){
			System.out.println("The password is valid");
		}else{
			System.out.println("Oops! The password is not valid");
		}
	} 
} 
