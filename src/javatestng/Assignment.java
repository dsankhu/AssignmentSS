package javatestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment {

     @test
	public void testcase1() {

		System.setProperty("Webdriver.chrome.driver", "D:\\2021\\selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
		driver.get("https://www.channelnewsasia.com/");
		
		String text=driver.findElement(By.cssSelector("a[class^=feature-card__heading]")).getText();

		
		
		driver.findElement(By.cssSelector("a[class^=feature-card__heading]")).click();
		
		
		String text1=driver.findElement(By.cssSelector("h1[class$=page-title]")).getText();
		
		
		if (text.equalsIgnoreCase(text1)) {
			
		System.out.println("Text is matched for Headlines");
			
		}
		
		((JavascriptExecuter)driver).executeScript("scroll(0,100)");
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Expand to read the full story')][1]")).click();
		
		
		
		
	}

	@test
     public void tc2() {
    	
		System.setProperty("Webdriver.chrome.driver", "D:\\2021\\selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
		driver.get("https://www.channelnewsasia.com/");
		
		driver.findElement(By.xpath("//nav[@id='main-nav']//child::li[@class='main-menu__item']//a[contains(text(),'Singapore')]")).click();
		
		
       String text=driver.findElement(By.cssSelector("article[about$=singapore]")).getText();

		
		
		
		
		
		if (text.equalsIgnoreCase("singapore")) {
			
		System.out.println("Text is matched for Headlines");
			
		}
		
		((JavascriptExecuter)driver).executeScript("scroll(0,100)");
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Expand to read the full story')][1]")).click();
    	 
     }
	
	@test
	  public void tc3() {
		  
		  System.setProperty("Webdriver.chrome.driver", "D:\\2021\\selenium\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver =new ChromeDriver();
			driver.get("https://www.channelnewsasia.com/");  
		  
			
			driver.findElement(By.xpath("//*[contains(text(),'+ All Sections')]")).click();
			
			
			driver.findElement(By.xpath("//li[@class='hamburger-menu__item']//child::a[contains(text(),'Weather')][1]")).click();
			
			
			String weather=driver.findElement(By.xpath("/div[contains(text(),'singapore')]//following-sibling::div[@class='tabular-list__view--condition']")).getText();
			System.out.println("Weather condition of Singapore is "+weather);
	  }
	
}





