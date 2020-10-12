package VendingMachineImplementation;

import java.util.Stack;

import Screens.ChooseDrinks;
import Screens.Menu;
import Screens.Payment;
import Screens.Utilities;
import VendingMachineData.Drink;

public class VendingMachine {
	//main method implementing the vending machine function
	public static void main(String[] args)	
	{
	  int count=0;
	  //display the menu
	  Menu obj_menu=new Menu();
	  obj_menu.mainMenu();
	  
	  while(true)
	  {		
		//get users choice 
		Utilities util=new Utilities();		
		int choice=util.getUserInput();
		//validate the entered value : case 1(reset), 2(if selected a drink), 3(for invalid input)
		int result=util.validateInput(choice);
		
		switch (result)
		{	/*if reset option is selected the supplier is validated, if the user enters the supplier code correctly 
			*	the machine resets else try again message will be displayed after 3 tries
			*/
			case 1:
				int countCode=0;
				System.out.print("Please enter valid Supplier Code : ");
				choice=util.getUserInput();
				while(!util.validateSupplier(choice) && countCode++<2)
				{
					System.out.print("Invalid Supplier code, enter again: ");		
					choice=util.getUserInput();
				}
				if(util.validateSupplier(choice))
					System.out.println("RESETING THE MACHINE...");
				else
					System.out.println("Incorrect Supplier Code entered thrice, try again later");
				obj_menu.mainMenu();
				break;
			//if the user selects a drink 
			case 2:
				//displays the drink name
				ChooseDrinks obj_choosedrink=new ChooseDrinks();
				Drink selectedDrink=obj_choosedrink.getSelectedDrink(choice);	
				System.out.println("\n	You selected --> "+selectedDrink.getName());
				//collect coins from the user and stores in the stack
				Payment obj_payment=new Payment();
				Stack<Integer> stackCoins=obj_payment.collectMoney(selectedDrink.getPrice());
				//if the user cancels the request, return the collected coins if any
				if(stackCoins.peek()==9)
				{
					System.out.println("\nCancelling the request.....");
					stackCoins.pop();
					if(!stackCoins.isEmpty())
						obj_payment.giveBalance(stackCoins);
				}
				else
				{	//calculates the balance
					int balance=obj_payment.payBalance(stackCoins,selectedDrink.getPrice());
					if(balance!=0)
					{	//prints the balance collection menu to the user
						obj_menu.balanceMenu();
						System.out.println("Balance to be collected: "+balance+"p");	
						//get the coins corresponding to the balance
						stackCoins=obj_payment.getBalanceCoins(balance);
						//give the coins to the user
						obj_payment.giveBalance(stackCoins);
					}//give the drink to the user
					obj_menu.provideDrinkMenu(selectedDrink);
				}
				obj_menu.mainMenu();
				break;
				/*if the input is invalid, user will be prompted to enter a valid choice
				 *  10 times before printing the main menu again
				 *  */
			case 3:
				++count;
				if(count==10)
				{
					System.out.println("Reprinting the menu for you, Please select your drink");
					obj_menu.mainMenu();
					count=0;
				}
				else					
					System.out.print("Please enter a valid choice from 1/2/3 : ");
				break;
		}
	  }
	}
}
