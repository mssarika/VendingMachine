package Screens;

import VendingMachineData.Drink;

public class ChooseDrinks{	
	
	//Retrieve the drink based in the user input
	public Drink getSelectedDrink(int inputChoice)
	{
		Drink drink=null;
		switch(inputChoice) {
		case 1 : 			
			drink=Drink.COK;
			break;
		case 2 : 
			drink=Drink.PEP;
			break;
		case 3 : 
			drink=Drink.SOD;
			break;			
		}
		return(drink);	
	}
}
