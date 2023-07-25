package Practice_Programs;
import java.util.*;
public class GetInputFromUser {

	public static void main(String[] args) {
		int a;
		float b;
		String c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter integer: ");
		a=sc.nextInt();

		
		System.out.print("Enter float: ");
		b=sc.nextFloat();
	
		
		System.out.print("Enter String");
		c=sc.nextLine();

		System.out.println("The integer entered is "+a);
		System.out.println("The float entered is: "+b);
		System.out.println("The string entered is :"+c);
	}

}
