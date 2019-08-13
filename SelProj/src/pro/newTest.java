package pro;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class newTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
	WebDriver dr=new ChromeDriver();
	dr.get("http://www.facebook.com");
	dr.findElement(By.id("email")).sendKeys("shilpymishra@rocketmail.com");
	dr.findElement(By.id("pass")).sendKeys("ishcoholic");
	dr.findElement(By.id("loginbutton")).click();
	String profileNmae,title=dr.getTitle();
	profileNmae=dr.findElement(By.xpath("//*[@id=\"u_0_a\"]/div[1]/div[1]/div/a/span/span")).getText();
	System.out.println("title: "+title+"\nprofile name : "+profileNmae);
			
}
}
