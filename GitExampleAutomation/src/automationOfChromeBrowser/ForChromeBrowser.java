package automationOfChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForChromeBrowser {

	public static void main(String[] args) {
		ChromeDriver chrome=null;
		try {
			//to talk java with chrome driver
			System.setProperty("webdriver.chrome.driver", "D:\\14thJuneJAVABatch\\JAVA_Workspace\\CoreJava_Project\\Library\\Drivers\\chromedriver.exe");
			//to open chome creating object
			chrome =  new ChromeDriver();
			//to maximize it
			chrome.manage().window().maximize();
			//giving the url
			chrome.get("http://localhost/login.do");
			Thread.sleep(2000);
			//verify whether it is opened or not
			if(chrome.getTitle().equalsIgnoreCase("actiTIME - Login")) {
				System.out.println("login page is opened successfully");
			}else {
				System.out.println("login page is not opened");
				return;
			}
			//need to login
			chrome.findElement(By.id("username")).sendKeys("admin");
			chrome.findElement(By.name("pwd")).sendKeys("manager");
			chrome.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			//need to check whether logged in ot not
			String strText=chrome.findElement(By.xpath("//td [@class='pagetitle']")).getText();
			if(strText.equalsIgnoreCase("Enter Time-Track")) {
				System.out.println("login is successsful");
			}
			else
			{
				System.out.println("login failed");
				return;
			}
			//close or handle the shortcut window
			if(chrome.findElement(By.id("gettingStartedShortcutsMenuWrapper")).isDisplayed()) {
				chrome.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			}
			Thread.sleep(2000);
			
			//logout from actitime
			chrome.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
			//checking whether logged out r not
			strText=chrome.findElement(By.id("headerContainer")).getText();
			if(strText.equalsIgnoreCase("please identify yourself")) {
				System.out.println("Logout successful");
			}else {
				System.out.println("failed to logout");
				return;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				chrome.close();
				chrome=null;
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	}
