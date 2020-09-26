import java.util.regex.*; 
import java.util.*;
class UC8 { 

	public static boolean isValidPassword(String pswd) 
	{ 
		String s = "(@#$%^&-+=)\\1+";
		//String regex = "^(?=.{8}$)(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^.,:;'!@#$%^&*_+=|(){}[?\-\]\/\\]*[.,:;'!@#$%^&*_+=|(){}[?\-\]\/\\][^.,:;'!@#$%^&*_+=|(){}[?\-\]\/\\]*$).{8}$";
		String regex1= "^(?=.*[A-Z])(?=.*\\d)(?=.*\\W)[a-zA-Z0-9\\@\\_\\-\\+\\#\\*]{8,}$";
		Pattern p = Pattern.compile(regex1); 
		Matcher m = p.matcher(pswd); 
		return m.matches(); 
	} 
//^(?=.{8}$)(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?!.*[<>`])([^.,:;'!@#$%^&*_+=|(){}[?\-\]\/\\]*)[.,:;'!@#$%^&*_+=|(){}[?\-\]\/\\](?1)$

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
