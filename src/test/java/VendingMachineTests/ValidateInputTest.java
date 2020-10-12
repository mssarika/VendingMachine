package VendingMachineTests;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import Screens.Utilities;

@RunWith(Parameterized.class)
public class ValidateInputTest {
	
	int value,expected;
	
	public ValidateInputTest(int expected,int value)
	{
		this.expected=expected;
		this.value=value;
	}	
	
	@Test
	public void test_validateInput()
	{
		Utilities util=new Utilities();
		Assert.assertEquals("Test failed",expected,util.validateInput(value));
	}
	
	@Parameters
	public static List<Object[]> testParametes()
	{
		return(Arrays.asList(new Object[][]{{1,101},{2,1},{2,2},{2,3},{3,5},{3,10},{3,111},{3,5690}}));
	}
}
