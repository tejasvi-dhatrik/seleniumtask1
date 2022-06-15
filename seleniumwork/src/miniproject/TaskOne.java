package miniproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskOne {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\browserdriver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");   //opening the link blazedemo
		
		String title = driver.getTitle();
		System.out.println("the title of the webpage is : " + title);    //printing the title of the webpage
		
		//booking the ticket 
		
		driver.findElement(By.xpath("//body/div[3]/form[1]/select[1]")).sendKeys("boston");
		driver.findElement(By.xpath("//body/div[3]/form[1]/select[2]")).sendKeys("New York");
		driver.findElement(By.xpath("//body/div[3]/form[1]/div[1]/input[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[2]/td[1]/input[1]")).click();
		
		driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Tejasvi Dhatrik");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("flat.no:402,BRC infra,st.clarks");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Boston");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Massachusetts");
		driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("123456");
		
		WebElement card = driver.findElement(By.xpath("//select[@id='cardType']"));
		Select s = new Select(card);       
		s.selectByVisibleText("American Express");
		
		driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("234XXXXXXX45");
		driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("8");
		driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2024");
		driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("D.Tejasvi");
		driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
		driver.findElement(By.xpath("//body/div[2]/form[1]/div[11]/div[1]/input[1]")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Travel The World')]")).click();
	    
	    
		  //counting and printing the total number of links 
	    
		List <WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println("The Total Number of Links in the homepage is : " + link.size());
		
		for(WebElement i:link)
		{
			System.out.println("The Text of Link is : " + i.getText());
		}
		
		
	}

}
