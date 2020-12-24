package rough;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Trial {
	
/*	public static void go()// static method
	{
		System.out.println("Inside Go()");
	}
	
	public void go1()// non-static method
	{
		System.out.println("Inside Go1()");
		int d = a + b;// we can access global variable in any method
	}*/
	public static int a = 20, b = 20;//global declaration
	public static void main(String[] args) throws InterruptedException {
	/*	
		//Static Method & Non-Static Methods
		int c =  a + b ;
		go();//static to static no need to create object
		Trial t = new Trial();// non-static method need to create an object
		t.go();//non static method can call to static
		t.go1();//calling non-static method
		//go1(); static cannot call to non static method
*/
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium WebDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.sharekhan.com/");// taking from config.properties file if we want to any changes do there
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
		/*
		//click on google apps button
		// move on Market xpath = //*[@id='mainHeader']/nav/ul/li[1]
		WebElement sourceElement = driver.findElement(By.xpath("//*[@id='mainHeader']/nav/ul/li[1]"));
		//WebElement targetElement = driver.findElement(By.xpath(""));
	    // Capture x and y offset positions of element
		  
		Actions action = new Actions(driver);
		//action.moveToElement(targetElement).clickAndHold().moveToElement(sourceElement).build().perform();
		action.moveToElement(sourceElement).moveToElement(sourceElement).build().perform();
		Thread.sleep(5000);
		
		//ul[@class='subSubMenu']
		//*[@id="mainHeader"]/nav/ul/li[1]/div/div/div[3]/ul
		
		//*[@id="mainHeader"]/nav/ul/li[1]/div/div/div[1]/ul/li[2]/ul/li[1]/a
		//*[@id="mainHeader"]/nav/ul/li[1]/div/div/div[2]/ul/li[1]/ul/li[1]/a
		//*[@id="mainHeader"]/nav/ul/li[1]/div/div/div[3]/ul[1]/li/ul/li[1]/a
		
		WebElement sublist = driver.findElement(By.xpath("//*[@id='mainHeader']/nav/ul/li[1]/div/div/div[1]/ul"));
		WebElement sublist1 = driver.findElement(By.xpath("//*[@id='mainHeader']/nav/ul/li[1]/div/div/div[2]/ul"));
		WebElement sublist2 = driver.findElement(By.xpath("//*[@id='mainHeader']/nav/ul/li[1]/div/div/div[3]/ul"));
		
		//WebElement submenu = driver.findElement(By.xpath("ul[@class='subSubMenu']"));
		//System.out.println("SubMenuList: "+sublist.getText());
		
		System.out.println(sublist.getText());
		System.out.println(sublist1.getText());
		System.out.println(sublist2.getText());
		
*/	
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		System.out.println(driver.findElements(By.tagName("iframe")).get(1).getText());
		
		/*WebElement parentframe = driver.findElement(By.xpath("//iframe[@id='flow_close_btn_iframe']"));
		WebElement childframe = driver.findElement(By.xpath("//iframe[@id='flow_close_btn_iframe']"));
		
		driver.switchTo().frame(childframe);// focus on child frame
*/		
		//app_logs.debug("Mouse Down operation");
		//List<WebElement> myList = new ArrayList<WebElement>();
		//List<WebElement> list =
		//ul[@class='subSubMenu']
		/*for(int i=1;i<=68;i++)
		{
			String xpath=driver.findElement(By.xpath(startswith+i+endswith)).getText();   
			WebElement ans = driver.findElement(By.xpath("xpath"));
			Assert.assertTrue(ans.isEnabled());
			System.out.println(xpath);//simply try to fetch all products name
		
		}
		*/
		
		
		
		
		
		
		
		
/*		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("anagre77@gmail.com");
		//click on next
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		Thread.sleep(6000);
		//password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("@mol1988");
		//click on compose button
		
		//driver.findElement(By.linkText("Compose")).click();
*/
		/*
		driver.switchTo().frame(0);// focus on particular block or frame
		//System.out.println(frame.getText());
		
		driver.findElement(By.linkText("Account")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz/div/div/c-wiz/div/div/ul[1]/li[1]/a/div/span")).click();
		Thread.sleep(3000);
		String actual = driver.getTitle();
		System.out.println("ActualTitle: "+actual);
		String expected = "Google Account";
		System.out.println("Title: "+expected);
		Assert.assertEquals(actual, expected);
		System.out.println("Both title are same");
		//System.out.println("Verify Google Account App");
		driver.navigate().back();
		
		Thread.sleep(4000);
	*/	//driver.close();
		
	}
}

/*WebElement link=driver.findElement(By.xpath("//*[@class='j1ei8c']"));//Xpath of particular dropdown list
		System.out.println(link.getSize());
		System.out.println(link.getText());
		List <WebElement> links=link.findElements(By.tagName("option"));// use option in particular dropdown list
		
		//WebElement str1 = driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz/div/div/c-wiz/div/div/ul[1]/li["));
		//WebElement str2 = driver.findElement(By.xpath("]/a/div/span"));
		String str1="//*[@id='yDmH0d']/c-wiz/div/div/c-wiz/div/div/ul[1]/li[";
		String str2 = "]/a/div/span";
		for(int i=0;i<links.size();i++)
		{
			
			String result=(str1)+(i)+(str2);
			driver.findElement(By.xpath(result)).click();
			System.out.println(result);
			System.out.println(driver.getTitle());
		}
 */