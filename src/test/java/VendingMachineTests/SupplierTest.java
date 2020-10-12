package VendingMachineTests;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import Screens.ChooseDrinks;
import Screens.Utilities;
import VendingMachineData.Drink;

@RunWith(Parameterized.class)
public class SupplierTest {
	
	boolean result;int value;
	
	public SupplierTest(boolean result,int value)
	{
		this.result=result;
		this.value=value;
	}	
	
	@Test
	public void test_validateSupplier()
	{
		Utilities util=new Utilities();
		Assert.assertEquals("TestFailed",result,util.validateSupplier(value));
	}
	
	@Parameters
	public static List<Object[]> testParametes()
	{
		return(Arrays.asList(new Object[][]{{true,999},{false,99},{false,9},{false,-99}}));
	}
	
}
