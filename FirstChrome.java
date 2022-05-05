import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class FistChrome {
public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shailja.dubey\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
		s1="https://www.google.com";
		s2="https://www.facebook.com";
		s3="https://www.instagram.com";
		s4="https://www.zoho.com";
		s5="https://www.snapchat.com";
		s6="https://stackoverflow.com/";
		s7="https://www.tutorialspoint.com/";
		s8="https://teams.microsoft.com/";
		s9="https://in.mail.yahoo.com";
		s10="https://www.youtube.com/";
		driver.get(s1);// GOOGLE LAUNCHING
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(s2);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(s3);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(s4);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(s5);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(s6);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(s7);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(s8);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(s9);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(s10);
	}
}
