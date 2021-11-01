package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonUtils.BrowserFactory;

@SuppressWarnings("unused")
public class DispenseCollect {
	
	
	public void Dispense_Collect() throws IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		BrowserFactory.LaunchBrowser().findElement(By.xpath("//*[@id=\"notActive_/device-request\"]")).click();
		Thread.sleep(1000);
	}
	
	public void Search() throws IOException, InterruptedException {
		Actions build = new Actions(BrowserFactory.LaunchBrowser());
		WebElement s = BrowserFactory.LaunchBrowser().findElement(By.xpath("/html/body/app-root/app-layout/div/section/app-device-request/div/div[2]/div[1]/div/div/input"));
		
		String[] searchdata = {"R-000000031","Not Approved"};
		
		for(int i = 0; i<searchdata.length; i++) {
			s.sendKeys(searchdata[i]);
			build.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(1500);
			BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-device-request/div/div[2]/div[1]/div/div/div[1]/span").click();
			Thread.sleep(1500);
		}
		
	}
	
	public void Logout() throws IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement logout = BrowserFactory.LaunchBrowser().findElement(By.xpath("/html/body/app-root/app-layout/div/app-header/nav/ul/li[3]/a"));
		JavascriptExecutor js = (JavascriptExecutor)BrowserFactory.LaunchBrowser();
		js.executeScript("arguments[0].click()", logout);
		Thread.sleep(2000);
	}
	
	public void CreateRequest() throws IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-device-request/div/div[2]/div[2]/div/div[2]/div/p-table/div/div[1]/table/tbody/tr[1]/td[1]/p-tablecheckbox/div/div[2]").click();
		Thread.sleep(500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-device-request/div/div[2]/div[2]/div/div[2]/div/p-table/div/div[1]/table/tbody/tr[2]/td[1]/p-tablecheckbox/div/div[2]").click();
		Actions build = new Actions(BrowserFactory.LaunchBrowser());
		build.sendKeys(Keys.END).build().perform();
		Thread.sleep(500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-device-request/div/div[2]/div[3]/button").click();
		build.sendKeys(Keys.HOME).build().perform();
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device-request/div/form/div[1]/div[2]/div/div[1]/div[1]/input").sendKeys("Automation Site");
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device-request/div/form/div[1]/div[2]/div/div[1]/div[2]/input").sendKeys("Automation Project");
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device-request/div/form/div[1]/div[2]/div/div[2]/div/p-checkbox/div/div[2]").click();
		Thread.sleep(500);
		build.sendKeys(Keys.END).build().perform();
		Thread.sleep(500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device-request/div/form/div[3]/div[2]/div/div[1]/div/p-checkbox/div/div[2]").click();
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device-request/div/form/div[4]/div[1]/button[1]").click();
		Thread.sleep(3000);
	}
	
	public void ApproveRequest() throws IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-device-request/div/div[2]/div[1]/div/div/input").sendKeys("Pending");
		Actions build = new Actions(BrowserFactory.LaunchBrowser());
		build.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-device-request/div/div[2]/div[2]/div/p-table/div/div[1]/table/tbody/tr[1]/td[1]/a").click();
		Thread.sleep(3000);
		build.sendKeys(Keys.END).build().perform();
		Thread.sleep(1500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-device-request-detail/div/div[2]/div[5]/div[1]/button[1]").click();
		Thread.sleep(1500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-device-request-detail/div/p-dialog[2]/div/div[2]/form/div[3]/div/textarea").sendKeys("Automated Approval");
		Thread.sleep(1000);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-device-request-detail/div/p-dialog[2]/div/div[2]/form/p-footer/div/div/button[1]").click();
		Thread.sleep(2500);
		build.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
	}
	
	public void CollectRequest() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(BrowserFactory.LaunchBrowser(), 10);
		Actions build = new Actions(BrowserFactory.LaunchBrowser());
		build.sendKeys(Keys.END).build().perform();
		Thread.sleep(1500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-device-request-detail/div/div[2]/div[5]/div[1]/button").click();
		Thread.sleep(1500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-device-request-detail/div/p-dialog[3]/div/div[2]/form/div[2]/div[1]/div/p-calendar/span/input").sendKeys("10/09/2021");
		Thread.sleep(1000);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-device-request-detail/div/p-dialog[3]/div/div[2]/form/div[2]/div[1]/div/span/img").click();
		Thread.sleep(1000);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-device-request-detail/div/p-dialog[3]/div/div[2]/form/div[2]/div[2]/div/p-calendar/span/input").sendKeys("10/09/2021");
		Thread.sleep(1000);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-device-request-detail/div/p-dialog[3]/div/div[2]/form/div[2]/div[2]/div/span/img").click();
		Thread.sleep(1000);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-device-request-detail/div/p-dialog[3]/div/div[2]/form/p-footer/div/div/button[1]").click();
		Thread.sleep(3000);
		build.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
	}
	
	public void ReturnRequest() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(BrowserFactory.LaunchBrowser(), 10);
		Actions build = new Actions(BrowserFactory.LaunchBrowser());
		build.sendKeys(Keys.END).build().perform();
		Thread.sleep(1500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-device-request-detail/div/div[2]/div[4]/div[2]/p-table/div/div[1]/table/thead/tr/th[1]/p-tableheadercheckbox/div/div[2]").click();
		Thread.sleep(1000);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-device-request-detail/div/div[2]/div[5]/div[1]/button").click();
		Thread.sleep(1500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-device-request-detail/div/p-dialog[4]/div/div[2]/form/div[2]/div/textarea").sendKeys("Automated Return");
		Thread.sleep(1000);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-device-request-detail/div/p-dialog[4]/div/div[2]/form/p-footer/div/div/button[1]").click();
		Thread.sleep(2000);
		build.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-device-request-detail/div/div[1]/div/div[1]/a/img").click();
		Thread.sleep(3500);
	}
	
	public void feedback() throws IOException, InterruptedException {
		  BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/app-header/nav/ul/li[1]").click();
		  Thread.sleep(1000);
		  BrowserFactory.LaunchBrowser().findElementById("feedback") .sendKeys("Dispense & Collect Automated Test");
		  Thread.sleep(1000);
		  BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/app-screenfeedback-view-popup/div/p-dialog/div/div[2]/form/p-footer/div/div[1]/button[1]/span").click();
		  Thread.sleep(2000);
	  }

}

