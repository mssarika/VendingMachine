package Screens;

import java.util.Scanner;

public class Utilities {

	private static Scanner scan = new Scanner(System.in);
	//function to get input from the user
	public int getUserInput()
	{
		int inputValue=0;
		try 
		{
			inputValue=Integer.parseInt(scan.nextLine());
		}
		catch(NumberFormatException nfe){}
		return inputValue;
	}
	//function that validates if the supplier code entered by the user is as expected (=999)
	public boolean validateSupplier(int code)
	{
		if(code==999)
			return true;
		else
			return false;
	}	
	/*function to check if the value entered by the user is valid
	 * returns 1 if choice is to reset the machine
	 * returns 2 if a drink is selected (ie user input = 1/2/3)
	 * returns 3 if any other value is received
	 */	
	public int validateInput(int choice)
	{
		if(choice==101)
			return 1;
		if((0<choice) && (4>choice))
			return 2;
		else
			return 3;
	}
	
}
