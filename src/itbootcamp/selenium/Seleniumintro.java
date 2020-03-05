package itbootcamp.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
			
		//imena klase se pisu vel slovom, iza klase ide tacka
		//objekat(web driver)
		//driver je univerzalan za selenium
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//interfejsi manage i navigate
		
		driver.get("https:\\www.google.com");
		
		//metoda get koju smo vec def,
		
		driver.navigate().to("https://www.youtube.com");
		//funkcionalnosi u browseru se pozivaju preko navigate
		
		//driver.navigate().back();
		
		//driver.navigate().forward();
		
		//driver.findElement(By.id("search")).click();;
		
		driver.findElement(By.id("search")).sendKeys("Sport");
		driver.findElement(By.id("search-icon-legacy")).click();
		
		
		
	}

}
