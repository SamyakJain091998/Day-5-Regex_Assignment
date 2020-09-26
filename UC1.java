import java.util.regex.*; 
import java.util.*;
class UC1 { 

	public static boolean isValidFirstName(String fname) 
	{ 

		String regex = "^[A-Z]{1}[a-zA-Z]{2,}";
		Pattern p = Pattern.compile(regex); 
		Matcher m = p.matcher(fname); 
		return m.matches(); 
	} 

	public static void main(String args[]) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first name: ");
		String fname = sc.nextLine();
		System.out.println( 
			fname + " is valid: "
			+ isValidFirstName(fname)); 
	} 
} 
