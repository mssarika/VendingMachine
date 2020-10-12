package Screens;

import VendingMachineData.Drink;

public class Menu {

	//display the Drinks menu to the user
	public void mainMenu()
	{
		System.out.println("\n\n##########################################");
		System.out.println("#	 Vending Machine Menu	     	 #");	
		System.out.println("##########################################");
		System.out.println("#	Option 1: Coke  (Price : 25)	 #");
		System.out.println("#	Option 2: Pepsi (Price : 35)	 #");
		System.out.println("#	Option 3: Soda  (Price : 45)	 #");
		System.out.println("#                                        #");
		System.out.println("#      To reset the machine Enter 101    #");
		System.out.println("##########################################");
		System.out.print("Please select a Drink of your choice -> 1/2/3: ");
	}
	
	//display payment options to the user
	void collectCoinsMenu()
	{
		System.out.println("\n##########################################");
		System.out.println("#		Time To Pay		 #");
		System.out.println("##########################################");
		System.out.println("#The machine accepts 1/5/10/25 cents only#");
		System.out.println("#	Enter one coin at a time	 #");
		System.out.println("#	Enter '9' to cancel anytime	 #");
		System.out.println("##########################################");
	}
	
	//display the balance
	public void balanceMenu()
	{
		System.out.println("\n##########################################");
		System.out.println("#	Please collect your balance	 #");
		System.out.println("##########################################");	
	}
	
	//drink collection display
	public void provideDrinkMenu(Drink selectedDrink)
	{
		System.out.println("\n\n##########################################");
		System.out.println("#	Collect your Drink		 #");
		System.out.println("##########################################");
		System.out.println("	  ENJOY YOUR : "+selectedDrink.getName()+"!!!!!\n\n");					
	}
}
