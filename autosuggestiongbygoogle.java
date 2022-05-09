import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestiongbygoogle {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shailja.dubey\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> dropdownoptions=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		Thread.sleep(3000);
		System.out.println(dropdownoptions.size());
		for(int i=0;i<dropdownoptions.size();i++)
		{
			System.out.println(dropdownoptions.get(i).getText());
		}
		search.sendKeys(Keys.ENTER);
	}
}
