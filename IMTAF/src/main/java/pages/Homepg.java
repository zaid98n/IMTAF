package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import commonUtils.BrowserFactory;
import commonUtils.ReadConfig;

public class Homepg {
	
	
	public void AllDevice() throws IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(Long.parseLong(ReadConfig.getValue("implicitwait")), TimeUnit.SECONDS);
		BrowserFactory.LaunchBrowser().findElement(By.xpath("//*[@id=\"notActive_/all-devices\"]")).click();
	}
	
	public void MaintainRepair() throws IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(Long.parseLong(ReadConfig.getValue("implicitwait")), TimeUnit.SECONDS);
		BrowserFactory.LaunchBrowser().findElement(By.xpath("//*[@id=\"notActive_/maintain-repair\"]")).click();
	}
	
	public void DispenseCollect() throws IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(Long.parseLong(ReadConfig.getValue("implicitwait")), TimeUnit.SECONDS);
		BrowserFactory.LaunchBrowser().findElement(By.xpath("//*[@id=\"notActive_/device-request\"]")).click();
	}
	
	public void SurveyReport() throws IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(Long.parseLong(ReadConfig.getValue("implicitwait")), TimeUnit.SECONDS);
		BrowserFactory.LaunchBrowser().findElement(By.xpath("//*[@id=\"notActive_/survey-report\"]")).click();
	}
	
	public void DeviceDashboard() throws IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(Long.parseLong(ReadConfig.getValue("implicitwait")), TimeUnit.SECONDS);
		BrowserFactory.LaunchBrowser().findElement(By.xpath("//*[@id=\"notActive_/device-dashbord\"]")).click();
	}

}
