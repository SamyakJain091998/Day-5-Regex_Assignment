import java.util.regex.*; 
import java.util.*;
class UC2 { 

	public static boolean isValidLastName(String lname) 
	{ 

		String regex = "^[A-Z]{1}[a-zA-Z]{2,}";
		Pattern p = Pattern.compile(regex); 
		Matcher m = p.matcher(lname); 
		return m.matches(); 
	} 

	public static void main(String args[]) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the last name: ");
		String lname = sc.nextLine();
		System.out.println( 
			lname + " is valid: "
			+ isValidLastName(lname)); 
	} 
} 
