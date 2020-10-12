package VendingMachineTests;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import Screens.ChooseDrinks;
import VendingMachineData.Drink;

@RunWith(Parameterized.class)
public class SelectedDrinkTest {
	
	Drink drink;int value;
	
	public SelectedDrinkTest(Drink drink,int value)
	{
		this.drink=drink;
		this.value=value;
	}	
	
	@Test
	public void getSelectedDrink()
	{
		ChooseDrinks obj_choosedrink=new ChooseDrinks();
		Assert.assertEquals("Test Failed",drink,obj_choosedrink.getSelectedDrink(value));
	}
	
	@Parameters
	public static List<Object[]> testParametes()
	{
		return(Arrays.asList(new Object[][]
				{{Drink.COK,1},{Drink.PEP,2},{Drink.SOD,3},{null,4},{null,100}}));
	}
	
}
