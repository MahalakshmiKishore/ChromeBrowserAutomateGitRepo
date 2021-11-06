package com.sgtesting.actitime.utility;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ApplicationIndependent {
	public static void main(String a[])
	{
		String datevalue=getDateTime("dd-MMM-yy");
		System.out.println(datevalue);
	}
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Modified By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	public static Properties property(String FileName)
	{
		FileInputStream fin=null;
		Properties prop=null;
		try
		{
			fin=new FileInputStream(FileName);
			prop=new Properties();
			prop.load(fin);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return prop;
	}
	
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Modified By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	public static String getDateTime(String strDateFormat)
	{
		String strDateTime=null;
		try
		{
			Calendar cal=Calendar.getInstance();
			SimpleDateFormat sdf=new SimpleDateFormat(strDateFormat);
			strDateTime=sdf.format(cal.getTime());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return strDateTime;
	}

	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Modified By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	public static void captureScreenShot(WebDriver oBrowser,String destFilePath)
	{
		try {
			//Convert web driver object to TakeScreenshot
			TakesScreenshot scrShot =((TakesScreenshot) oBrowser );
			//Call getScreenshotAs method to create image file
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			//Move image file to new destination
			File DestFile=new File(destFilePath);
			//Copy file at destination
			FileUtils.copyFile(SrcFile, DestFile);
        } catch (Exception ex) {
            System.err.println(ex);
        }
	}
}
