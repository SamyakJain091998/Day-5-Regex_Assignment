import java.util.regex.*; 
import java.util.*;
class UC4 { 

	public static boolean isValidMobileFormat(String number) 
	{ 
		String regex = "^[1-9]{1}[0-9]{1}\\s{1}[1-9]{1}[0-9]{9}$";
		Pattern p = Pattern.compile(regex); 
		Matcher m = p.matcher(number); 
		return m.matches(); 
	} 

	public static void main(String args[]) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the mobile number: ");
		String number = sc.nextLine();
		System.out.println( 
				number + " is valid: "
			+ isValidMobileFormat(number)); 
	} 
} 
