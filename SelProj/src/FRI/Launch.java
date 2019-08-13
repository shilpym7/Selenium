package FRI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launch {
	static WebDriver dr;
	public static WebDriver launch_url(String key,String value,String url)
	{
	System.setProperty(key,value);
	if(key=="webdriver.chrome.driver")
		dr=getChromeDriver();
	else if(key=="webdriver.ie.driver")
		dr=getIEDriver();
	else if(key=="webdriver.gecko.driver")
		dr=getMFDriver();
	dr.get(url);
	return dr;
	}
	public static WebDriver getChromeDriver()
	{
		return new ChromeDriver();
	}
	public static WebDriver getIEDriver()
	{
		return new InternetExplorerDriver();
	}
	public static WebDriver getMFDriver()
	{
		return new FirefoxDriver();
	}
}
