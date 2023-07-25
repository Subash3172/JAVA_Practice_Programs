package Practice_Programs;

import java.util.*;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		float temperature;
		System.out.print("Enter a temperature: ");
		Scanner sc=new Scanner(System.in);
		temperature=sc.nextFloat();
		
		// fahrenheit formula
		
		temperature=((temperature-32)*5)/9;
		System.out.println("The temperature in celcius is "+temperature);
	}

}
