package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonUtils.BrowserFactory;

@SuppressWarnings("unused")
public class SurveyReport {
	
	
	public void Survey_Report() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(BrowserFactory.LaunchBrowser(), 10);
		BrowserFactory.LaunchBrowser().findElement(By.xpath("//*[@id=\"notActive_/survey-report\"]")).click();
		Thread.sleep(1000);
	}
	
	public void Search() throws IOException, InterruptedException {
		Actions build = new Actions(BrowserFactory.LaunchBrowser());
		WebElement s = BrowserFactory.LaunchBrowser().findElement(By.xpath("/html/body/app-root/app-layout/div/section/app-device-survey-report/div/div[1]/div[3]/div[1]/div/input"));
		
		String[] searchdata = {"E-TED-000000018","Accessories","Ultrasonic Flow Meter","Honeywell","MRU20","PT7-1034E"};
		
		for(int i = 0; i<searchdata.length; i++) {
			s.sendKeys(searchdata[i]);
			build.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(1500);
			BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-device-survey-report/div/div[1]/div[3]/div[1]/div/div[1]/span").click();
			Thread.sleep(1500);
		}
		
	}
	
	public void Filters() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(BrowserFactory.LaunchBrowser(), 10);
		Actions build = new Actions(BrowserFactory.LaunchBrowser());
		
		//Category
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-device-survey-report/div/div[1]/div[3]/div[1]/div/div[2]/button").click();
		Thread.sleep(2000);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-device-survey-report/div/div[2]/div[1]/div[1]/div/div[1]/p-dropdown/div/div[3]").click();
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-device-survey-report/div/div[2]/div[1]/div[1]/div/div[1]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[2]/li").click();
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-device-survey-report/div/div[2]/div[1]/div[2]/button[1]").click();
		Thread.sleep(1000);
		build.sendKeys(Keys.END).build().perform();
		Thread.sleep(1500);
		build.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-device-survey-report/div/div[2]/div[1]/div[2]/button[2]").click();
		Thread.sleep(1500);
		
		//Device Name
		
		//Last verified date
	}

}	