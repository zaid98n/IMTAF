package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonUtils.BrowserFactory;

@SuppressWarnings("unused")
public class DeviceDashboard {
	
	public void PageScroll() throws IOException, InterruptedException {
		Actions builder = new Actions(BrowserFactory.LaunchBrowser());
		builder.sendKeys(Keys.END).build().perform();
		Thread.sleep(1000);
		builder.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
	}
	
	public void TotalDevices() throws IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		BrowserFactory.LaunchBrowser().findElement(By.xpath("/html/body/app-root/app-layout/div/section/app-device-dashbord/div/div[1]/div[2]/div/div/div[1]/p-card/div/div/div")).click();
		Thread.sleep(2000);
		BrowserFactory.LaunchBrowser().findElement(By.xpath("//*[@id=\"notActive_/device-dashbord\"]")).click();
	}
	
	public void AvailableDevices() throws IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		BrowserFactory.LaunchBrowser().findElement(By.xpath("/html/body/app-root/app-layout/div/section/app-device-dashbord/div/div[1]/div[2]/div/div/div[2]/p-card/div/div/div")).click();
		Thread.sleep(2000);
		BrowserFactory.LaunchBrowser().findElement(By.xpath("//*[@id=\"notActive_/device-dashbord\"]")).click();
	}
	
	public void TotalCalibratedDevices() throws IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		BrowserFactory.LaunchBrowser().findElement(By.xpath("/html/body/app-root/app-layout/div/section/app-device-dashbord/div/div[1]/div[2]/div/div/div[3]/p-card/div/div/div")).click();
		Thread.sleep(2000);
		BrowserFactory.LaunchBrowser().findElement(By.xpath("//*[@id=\"notActive_/device-dashbord\"]")).click();
	}
	
	public void CurrentMonthCalibrationDue() throws IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		BrowserFactory.LaunchBrowser().findElement(By.xpath("/html/body/app-root/app-layout/div/section/app-device-dashbord/div/div[1]/div[2]/div/div/div[4]/p-card/div/div/div")).click();
		Thread.sleep(2000);
		BrowserFactory.LaunchBrowser().findElement(By.xpath("//*[@id=\"notActive_/device-dashbord\"]")).click();
	}
	
	public void UpcomingMonthCalibrationDue() throws IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		BrowserFactory.LaunchBrowser().findElement(By.xpath("/html/body/app-root/app-layout/div/section/app-device-dashbord/div/div[1]/div[2]/div/div/div[5]/p-card/div/div/div")).click();
		Thread.sleep(2000);
		BrowserFactory.LaunchBrowser().findElement(By.xpath("//*[@id=\"notActive_/device-dashbord\"]")).click();
	}
	
	public void PendingDeviceRequest() throws IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Actions builder = new Actions(BrowserFactory.LaunchBrowser());
		builder.sendKeys(Keys.END).build().perform();
		Thread.sleep(1000);
		BrowserFactory.LaunchBrowser().findElement(By.xpath("/html/body/app-root/app-layout/div/section/app-device-dashbord/div/div[3]/div/div[1]/div/div[1]/div[2]")).click();
		Thread.sleep(3000);
		BrowserFactory.LaunchBrowser().findElement(By.xpath("//*[@id=\"notActive_/device-dashbord\"]")).click();
	}
	
	public void feedback() throws IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/app-header/nav/ul/li[1]").click();
		BrowserFactory.LaunchBrowser().findElementById("feedback") .sendKeys("Device Dashboard Automated Test");
		Thread.sleep(1000);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/app-screenfeedback-view-popup/div/p-dialog/div/div[2]/form/p-footer/div/div[1]/button[1]/span").click();
		Thread.sleep(2000);
	  }

}
