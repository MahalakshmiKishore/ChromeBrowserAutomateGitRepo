package com.sgtesting.htmlfileCreationUsingJavaScript;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class CreateHTMLFileDemo {

	public static void main(String[] args) {
		createHtmlFile();
	}
	
	private static void createHtmlFile()
	{
		BufferedWriter bw=null;
		try
		{
			 bw=new BufferedWriter(new FileWriter("H:\\CITY\\Test1.html"));
			 bw.write("<html>");
			 bw.write("<head><title>Test Web Page</title></head>");
			 bw.write("<body>");
			 bw.newLine();
			 bw.write("<h1 align=center>Sample Web Page</h1>");
			 bw.write("<p>Java is a programming language,It is used for development!!!!</p>");
			 bw.write("<p>Python is a scripting language,It is used for development!!!!</p>");
			 bw.newLine();
			 bw.write("</body>");
			 bw.write("</html>");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
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
