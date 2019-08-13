package pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class prog8 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
	dr.findElement(By.name("user_login")).sendKeys("shilpy7");
	dr.findElement(By.name("user_password")).sendKeys("MishraShilpy");
	dr.findElement(By.name("first_name")).sendKeys("Shilpy");
	dr.findElement(By.name("last_name")).sendKeys("Mishra");
	dr.findElement(By.name("email")).sendKeys("shilpymishra788@gmail.com");
	dr.findElement(By.name("address1")).sendKeys("Sector 50 Noida");
	dr.findElement(By.name("city")).sendKeys("Noida");
	 WebElement we1=dr.findElement(By.name("state_id"));
	 Select s1=new Select(we1);
	 s1.selectByVisibleText("Virginia");
	 dr.findElement(By.name("zip")).sendKeys("78768");
	 WebElement we2=dr.findElement(By.name("country_id"));
	 Select s2=new Select(we2);
	 s2.selectByVisibleText("India");
	 dr.findElement(By.name("phone_home")).sendKeys("678729");
	 dr.findElement(By.name("phone_work")).sendKeys("698808");
	 WebElement we3=dr.findElement(By.name("language_id"));
	 Select s3=new Select(we3);
	 s3.selectByVisibleText("English");
	 WebElement we4=dr.findElement(By.name("age_id"));
	 Select s4=new Select(we4);
	 s4.selectByVisibleText("18-24");
	 WebElement we5=dr.findElement(By.name("gender_id"));
	 Select s5=new Select(we5);
	 s5.selectByVisibleText("Female");
	 WebElement we6=dr.findElement(By.name("education_id"));
	 Select s6=new Select(we6);
	 s6.selectByVisibleText("Other");
	 WebElement we7=dr.findElement(By.name("income_id"));
	 Select s7=new Select(we7);
	 s7.selectByVisibleText("over $75,000");
	 dr.findElement(By.name("note")).sendKeys("I am the best! LOL");
	 dr.findElement(By.name("Insert")).click();
	 String s=dr.findElement(By.xpath("//*[text()='shilpy7']")).getText();
	 if(s.equals("shilpy7"))
		 System.out.println("User Registered Successfully");
	 else
		 System.out.println("User not Registered Successfully");
		 
}
}
