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
public class BalanceCoinsTest {
	
	Stack<Integer> stackCoins;int value;
	
	public BalanceCoinsTest(Stack<Integer> stackCoins,int value)
	{
		this.stackCoins=stackCoins;
		this.value=value;
	}	
	
	@Test
	public void test_getBalanceCoins()
	{
		Payment obj_payment=new Payment();
		Assert.assertEquals("Test Failed, Balance coins are not as expected",stackCoins,obj_payment.getBalanceCoins(value));
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
		
		Stack<Integer> stackCoins3=new Stack<Integer>();
		stackCoins3.push(10);
		stackCoins3.push(1);
		stackCoins3.push(1);
		stackCoins3.push(1);
		
		return(Arrays.asList(new Object[][]
				{{stackCoins1,37},{stackCoins2,25},{stackCoins3,13}}));
	}
}
