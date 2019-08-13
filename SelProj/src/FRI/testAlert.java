package FRI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testAlert {
	
	public static void main(String[] args) {
	   
		WebDriver dr=Launch.launch_url("webdriver.chrome.driver","chromedriver_v75.exe",
				"http://demo.guru99.com/test/delete_customer.php");
		dr.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("436");
		dr.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		String al1=dr.switchTo().alert().getText();
		System.out.println(al1);
		dr.switchTo().alert().accept();
		//dr.switchTo().alert().dismiss();
	    String al2=dr.switchTo().alert().getText();
	    System.out.println(al2);
	    dr.switchTo().alert().accept();
	    dr.close();
}

	
}