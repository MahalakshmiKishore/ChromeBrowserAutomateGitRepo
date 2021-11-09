package com.sgtesting.calculator.tests;

import org.junit.Assert;
import org.junit.Test;

import com.sgtesting.calculator.sourcecode.Calculator;

public class MultiplicationTestCases {
	
	Calculator calculator=new Calculator();
	/**
	 * Created By:
	 * Modified By:
	 * Reviewed By:
	 * Test Case ID:
	 * @Parameters :
	 * @return :
	 * Purpose:
	 * Description:
	 */
	@Test
	public void multiplyTwoPositiveNumbers()
	{
		int expectedResult=80;
		try
		{
			int x,y;
			x=10;y=8;
			int actualResult=calculator.multiplication(x,y);
			Assert.assertEquals(expectedResult, actualResult);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Created By:
	 * Modified By:
	 * Reviewed By:
	 * Test Case ID:
	 * @Parameters :
	 * @return :
	 * Purpose:
	 * Description:
	 */
	@Test
	public void multiplyTwoNegativeNumbers()
	{
		int expectedResult=70;
		try
		{
			int x,y;
			x=-10;y=-7;
			int actualResult=calculator.multiplication(x,y);
			Assert.assertEquals(expectedResult, actualResult);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Created By:
	 * Modified By:
	 * Reviewed By:
	 * Test Case ID:
	 * @Parameters :
	 * @return :
	 * Purpose:
	 * Description:
	 */
	@Test
	public void multiplyOnePositiveAndOneNegativeNumbers()
	{
		int expectedResult=-30;
		try
		{
			int x,y;
			x=-15;y=2;
			int actualResult=calculator.multiplication(x,y);
			Assert.assertEquals(expectedResult, actualResult);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Created By:
	 * Modified By:
	 * Reviewed By:
	 * Test Case ID:
	 * @Parameters :
	 * @return :
	 * Purpose:
	 * Description:
	 */
	@Test
	public void multiplyOnePositiveOrNegativeNumebrWithZero()
	{
		int expectedResult=0;
		try
		{
			int x,y;
			x=-30;y=0;
			int actualResult=calculator.multiplication(x,y);
			Assert.assertEquals(expectedResult, actualResult);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
