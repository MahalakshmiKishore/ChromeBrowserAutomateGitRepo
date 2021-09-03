package com.sgtesting.testscripts;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class HTMLReportsDemo {

	public static void main(String[] args) {
		createHTMLFile();

	}
	
	static void createHTMLFile()
	{
		BufferedWriter bw=null;
		try
		{
			bw=new BufferedWriter(new FileWriter("H:\\EXAMPLE\\Test.html"));
			bw.write("<html>");
			bw.write("<head><title>Test Web Page</title></head>");
			bw.write("<body>");
			bw.write("<h1 align=center>Sample Web Page</h1>");
			bw.write("<p>Java is a programming language,It is used for development ...</p>");
			bw.write("<p>Bangalore is a capital city of Karnataka, and It is a garden city...</p>");
			bw.write("</body>");
			bw.write("</html>");
		}catch(Exception e)
		{
			e.printStackTrace();		
		}finally
		{
			try
			{
				bw.flush();
				bw.close();
			}catch(Exception e)
			{
				e.printStackTrace();		
			}
		}
	}

}
