package pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prog7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver_v75.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://examples.codecharge.com/Store/Default.php");

		String t = dr.getTitle();
		String ev = "Online Bookstore";
		if(t.equals(ev)) {
		System.out.println("Verified : "+t);
		}
		else {
		System.out.println("Not Matched");
		}
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[1]/td/select/option[3]")).click();;
		dr.findElement(By.name("DoSearch")).click();
		dr.findElement(By.linkText("Web Database Development")).click();
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[2]/input[1]")).click();
		dr.findElement(By.linkText("Home")).click();
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[1]/td/select/option[3]")).click();;
		dr.findElement(By.name("DoSearch")).click();
		dr.findElement(By.linkText("MySQL")).click();
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[2]/input[1]")).click();
		dr.findElement(By.linkText("Home")).click();
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[1]/td/select/option[3]")).click();;
		dr.findElement(By.name("DoSearch")).click();
		dr.findElement(By.linkText("MySQL and mSQL")).click();
		dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[2]/input[1]")).click();
		String s1 = "Web Database Development";
		String s2 = "MySQL";
		String s3 = "MySQL and mSQL";
		if(s1.equals(dr.findElement(By.xpath("//*[@class=\"Grid\"]/tbody/tr[2]/td[1]")).getText())) {
		System.out.println("Matched for "+s1);
		}else {
		System.out.println("Not Matched");
		}
		if(s2.equals(dr.findElement(By.xpath("//*[@class=\"Grid\"]/tbody/tr[3]/td[1]")).getText())) {
		System.out.println("Matched for "+s2);
		}else {
		System.out.println("Not Matched");
		}
		if(s3.equals(dr.findElement(By.xpath("//*[@class=\"Grid\"]/tbody/tr[4]/td[1]")).getText())) {
		System.out.println("Matched for "+s3);
		}else {
		System.out.println("Not Matched");
		}
		float p1 = Float.parseFloat((dr.findElement(By.xpath("//*[@class=\"Grid\"]/tbody/tr[2]/td[4]")).getText()).substring(1));
		float p2 = Float.parseFloat((dr.findElement(By.xpath("//*[@class=\"Grid\"]/tbody/tr[3]/td[4]")).getText()).substring(1));
		float p3 = Float.parseFloat((dr.findElement(By.xpath("//*[@class=\"Grid\"]/tbody/tr[4]/td[4]")).getText()).substring(1));
		float total = p1+p2+p3;
		//System.out.println(total);
		//System.out.print(dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/p")).getText());
		float getTotal = Float.parseFloat((dr.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/p")).getText()).substring(8, 14));
		//System.out.println(getTotal);
		if(total == getTotal)
		System.out.println("Correct total");
		else
		System.out.println("Incorrect total");
		dr.close();
		}
}
