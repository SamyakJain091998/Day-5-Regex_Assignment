import java.util.regex.*; 
import java.util.*;
class UC3 { 

	public static boolean isValidEmail(String email) 
	{ 
		String regex = "^[a-zA-Z0-9]+(([\\.+-][a-z0-9]{1,})?)+@(?:[a-zA-Z0-9])+\\.[a-zA-Z]{2,4}+((\\.[a-z]{2,4})?)$";
		Pattern p = Pattern.compile(regex); 
		Matcher m = p.matcher(email); 
		return m.matches(); 
	} 

	public static void main(String args[]) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the email id: ");
		String email = sc.nextLine();
		System.out.println( 
				email + " is valid: "
			+ isValidEmail(email)); 
	} 
} 
