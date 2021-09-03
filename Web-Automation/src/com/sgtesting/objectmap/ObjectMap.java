package com.sgtesting.objectmap;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.regex.Pattern;

import org.openqa.selenium.By;

public class ObjectMap {
	public static String path=null;
	Properties prop=null;
	public ObjectMap(String fileName)
	{
		FileInputStream fin=null;
		try
		{
			path=System.getProperty("user.dir")+"\\ObjectMap\\"+fileName;
			fin=new FileInputStream(path);
			prop=new Properties();
			prop.load(fin);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public By getLocator(String logicalname)
	{
		By by=null;
		try
		{
			String locatorinfo=prop.getProperty(logicalname);
			Pattern pattern=Pattern.compile("[||]");
			String[] locator=pattern.split(locatorinfo);
			String locatorname=locator[0];
			String locatorvalue=locator[2];
			if(locatorname.equalsIgnoreCase("id"))
			{
				by=By.id(locatorvalue);
			}
			else if(locatorname.equalsIgnoreCase("name"))
			{
				by=By.name(locatorvalue);
			}
			else if(locatorname.equalsIgnoreCase("xpath"))
			{
				by=By.xpath(locatorvalue);
			}
			else if(locatorname.equalsIgnoreCase("linktext"))
			{
				by=By.linkText(locatorvalue);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return by;
	}

}
