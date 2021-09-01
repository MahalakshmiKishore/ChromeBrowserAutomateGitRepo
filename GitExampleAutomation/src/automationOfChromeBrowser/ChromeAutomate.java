package automationOfChromeBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeAutomate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver chrome=null;
		try {
			//to talk java with chrome driver
			System.setProperty("webdriver.chrome.driver", "D:\\14thJuneJAVABatch\\JAVA_Workspace\\CoreJava_Project\\Library\\Drivers\\chromedriver.exe");
			//to open chome creating object
			chrome =  new ChromeDriver();
			//to maximize it
			chrome.manage().window().maximize();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				chrome.close();
				chrome=null;
			}catch(Exception e) {
				e.printStackTrace();
			}
		}}

}
