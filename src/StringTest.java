import java.util.Scanner;
/**
 * 
 * @author Jovanne Li
 *
 */
public class StringTest 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter your name: "); 
		String fname = in.next(); String lname = in.next();
		in.nextLine();
		System.out.print("Please enter a 10-digit phone number: "); 
		String number = in.next();
		
		String fullName = fname + " " + lname;
		String phoneNumber = number;
		String sub = phoneNumber.substring(0,3);
		String sub2 = phoneNumber.substring(3,6);
		String sub3 = phoneNumber.substring(6,10);
		
		System.out.printf("%-20s %-20s", "Name: ", fullName);
		System.out.println();
		System.out.printf("%-20s %-20s", "Phone Number: ", 
				          "(" + sub + ")" + " " + sub2 + "-" + sub3);
	}
	
}
