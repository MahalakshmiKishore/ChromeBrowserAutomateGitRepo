package com.sgtesting.calculator.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({com.sgtesting.calculator.tests.AdditionTestCases.class,
		com.sgtesting.calculator.tests.MultiplicationTestCases.class})
public class TestSuite {
	public static void main(String args[]) {
		
	}
}
