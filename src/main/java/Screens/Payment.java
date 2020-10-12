package Screens;

import java.util.Stack;

public class Payment{
	
	private Menu menu=new Menu();
	//calculate and return the balance to be paid to the user based on the coins collected from the user and the cost of the drink
	public int payBalance(Stack<Integer> stackCoins, int price)
	{		
		int balance=0;
		//find the total amount paid by the user
		int totalPaid=addCoins(stackCoins);
		if(totalPaid>price)
		{	//finds the balance
			balance=totalPaid-price;		
		}
		return balance;
	}
	//finds the coin combination for a specific amount (ex: 45=25+10+10) and store it in a stack 
	public Stack<Integer> getBalanceCoins(int balance)
	{
		int coin;
		Stack<Integer> stackCoins=new Stack<Integer>();
		while(balance>0)
		{
			if(balance>=25)
				coin=25;
			else if(balance>=10)
				coin=10;
			else if(balance>=5)
				coin=5;
			else 
				coin=1;
				
			stackCoins.push(coin);
			balance=balance-coin;
		}
		return stackCoins;
	}
	//collects money from the user and adds to stack
	public Stack<Integer> collectMoney(int price)
	{//prints menu that contains the coin specifications accepted by the machine
		menu.collectCoinsMenu();
		Stack<Integer> stackCoins=new Stack<Integer>();
		Utilities util=new Utilities();
		//each time the user inputs a coin, he/she is prompted to pay the remaining amount 
		int moneyCollected=addCoins(stackCoins);
		while(moneyCollected<price)
		{
			System.out.print("Amount pending "+(price-moneyCollected)+"p, Enter the coin : ");
			int inputChoice=util.getUserInput();
			//checks the input value for cancellation of request (value = 9)
			if(inputChoice==9)
			{	//inserts 9 at the end of stack to show that it is a cancellation request
				stackCoins.push(inputChoice);
				return(stackCoins);
			}
			else 
			{//validates the input and adds to stack 
				if(validateCoin(inputChoice)!=0)
					stackCoins.push(inputChoice);
			}
			moneyCollected=addCoins(stackCoins);
		}
		
		System.out.println("\n	Total amount paid  --> "+moneyCollected+"p");
		return stackCoins;
	}
	//finds the total amount by adding the coins in the stack
	int addCoins(Stack<Integer> stackCoins)
	{
		int total=0;
		for(int coin : stackCoins)
			total=total+coin;
		return total;
	}
	//checks if the user enters valid coins
	int validateCoin(int inputCoin)
	{
		if(!(inputCoin==1 || inputCoin==5 || inputCoin==10 || inputCoin==25))
		{
			System.out.println("Machine accepts 1/5/10/25 cents only, please input a valid amount:");
			inputCoin=0;
		}
		
		return inputCoin;
	}
	
	//prints the coins to the user
	public void giveBalance(Stack<Integer> stackCoins)
	{ 
		System.out.print("Please collect the coins --> ");	
		while(!stackCoins.isEmpty())
			System.out.print(stackCoins.pop() +"p ");
	}
}
