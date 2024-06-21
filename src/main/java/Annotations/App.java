package Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class App{
	
	public static void main(String[] args) throws InterruptedException {
		 
	WebDriver driver= new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	
	//Product Search
	driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Brocolli"+Keys.ENTER);
	
	//Increase Count
	driver.findElement(By.className("increment")).click();
	
	//Click the Product
	driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='ADD TO CART'])[1]")).click();
	
	WebElement n=driver.findElement(By.linkText("(//img[@alt='search'])[1]"));
	Actions a = new Actions(driver);
	a.moveToElement(n).perform();
	
}
}