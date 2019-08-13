package pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prog6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://examples.codecharge.com/Store/Default.php");
		String ac_title = dr.getTitle();
		String ex_title = "Online Bookstore";
		if(ac_title.matches(ex_title))
		System.out.println("Same title as expected");
		else
		System.out.println("Different title as expected");
		dr.findElement(By.xpath("//option[@value=\"2\"]")).click();
		dr.findElement(By.name("DoSearch")).click();
		dr.findElement(By.linkText("Web Database Development")).click();
		String s = dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/h1")).getText();
		if(s.matches("Web Database Development"))
		System.out.println("Correct text");
		else
		System.out.println("Incorrect text");
		String price = dr.findElement(By.xpath("//*[contains(text(), 'Price: $39.99')]")).getText();
		String price_int = price.substring(8, price.length());
		double p = Double.parseDouble(price_int);
		dr.findElement(By.name("quantity")).clear();
		dr.findElement(By.name("quantity")).sendKeys("2");
		dr.findElement(By.name("Insert1")).click();
		String total = "//*[@class=\"Grid\"]/tbody/tr[2]/td[4]";
		String data = dr.findElement(By.xpath(total)).getText();
		String total_int = data.substring(1, data.length());
		//System.out.println(data);
		double t = Double.parseDouble(total_int);
		if(p * 2 == t)
		System.out.print("Verified");
		else
		System.out.print("Incorrect");
		}
}
