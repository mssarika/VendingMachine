package VendingMachineTests;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import Screens.Payment;

@RunWith(Parameterized.class)
public class BalanceTest {
	
	Stack<Integer> stackCoins;int value,balance;
	
	public BalanceTest(Stack<Integer> stackCoins,int balance,int value)
	{
		this.stackCoins=stackCoins;
		this.balance=balance;
		this.value=value;
	}	
	
	@Test
	public void test_getBalance()
	{
		Payment obj_payment=new Payment();
		Assert.assertEquals("Test failed, Balance is not as expected",balance,obj_payment.payBalance(stackCoins, value));
	}
	
	@Parameters
	public static List<Object[]> testParametes()
	{
		Stack<Integer> stackCoins1=new Stack<Integer>();
		stackCoins1.push(25);
		stackCoins1.push(10);
		stackCoins1.push(1);
		stackCoins1.push(1);
		
		Stack<Integer> stackCoins2=new Stack<Integer>();
		stackCoins2=new Stack<Integer>();
		stackCoins2.push(25);
		stackCoins2.push(25);
		stackCoins2.push(10);
		
		Stack<Integer> stackCoins3=new Stack<Integer>();
		stackCoins3.push(25);
		stackCoins3.push(5);
		stackCoins3.push(1);
		
		return(Arrays.asList(new Object[][]
				{{stackCoins1,2,35},{stackCoins2,15,45},{stackCoins3,6,25}}));
	}
}
