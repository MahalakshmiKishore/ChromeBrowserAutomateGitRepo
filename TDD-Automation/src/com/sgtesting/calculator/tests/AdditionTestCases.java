package com.sgtesting.calculator.tests;

import org.junit.Assert;
import org.junit.Test;

import com.sgtesting.calculator.sourcecode.Calculator;

public class AdditionTestCases {
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
	public void addTwoPositiveNumbers()
	{
		int expectedResult=80;
		try
		{
			int x,y;
			x=30;y=50;
			int actualResult=calculator.addition(x,y);
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
	public void addTwoNegativeNumbers()
	{
		int expectedResult=-70;
		try
		{
			int x,y;
			x=-50;y=-20;
			int actualResult=calculator.addition(x,y);
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
	public void addOnePositiveAndOneNegativeNumbers()
	{
		int expectedResult=-30;
		try
		{
			int x,y;
			x=-50;y=20;
			int actualResult=calculator.addition(x,y);
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
	public void addOnePositiveOrNegativeNumebrWithZero()
	{
		int expectedResult=-30;
		try
		{
			int x,y;
			x=-30;y=0;
			int actualResult=calculator.addition(x,y);
			Assert.assertEquals(expectedResult, actualResult);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
