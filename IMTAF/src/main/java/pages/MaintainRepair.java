package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonUtils.BrowserFactory;

@SuppressWarnings("unused")
public class MaintainRepair {
	
	public void Maintain_Repair() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(BrowserFactory.LaunchBrowser(), 10);
		BrowserFactory.LaunchBrowser().findElement(By.xpath("//*[@id=\"notActive_/maintain-repair\"]")).click();
		Thread.sleep(1000);
	}
	
//----------------------- ALL DEVICES TAB -----------------------
	
	public void Search() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(BrowserFactory.LaunchBrowser(), 10);
		Actions build = new Actions(BrowserFactory.LaunchBrowser());
		WebElement s = BrowserFactory.LaunchBrowser().findElement(By.xpath("/html/body/app-root/app-layout/div/section/app-maintain-repair/div/div[1]/div[3]/div/div/input"));
		
		String[] searchdata = {"E-TED-000000001","Instrument","CO2/RHT Data Logger","Extech","SD800","Q844201"};
		
		for(int i = 0; i<searchdata.length; i++) {
			s.sendKeys(searchdata[i]);
			build.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(1500);
			BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair/div/div[1]/div[3]/div/div/div[1]/span").click();
			Thread.sleep(1500);
		}
		
	}
	
	public void Filter() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(BrowserFactory.LaunchBrowser(), 10);
		Actions build = new Actions(BrowserFactory.LaunchBrowser());
		
		//CATEGORY
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair/div/div[1]/div[3]/div/div/div[2]/button").click();
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair/div/div[2]/div[1]/div[1]/div/div[1]/p-dropdown/div/div[3]").click();
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair/div/div[2]/div[1]/div[1]/div/div[1]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[2]/li").click();
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair/div/div[2]/div[1]/div[2]/button[1]").click();
		Thread.sleep(1000);
		build.sendKeys(Keys.END).build().perform();
		Thread.sleep(1500);
		build.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair/div/div[2]/div[1]/div[2]/button[2]").click();
		Thread.sleep(1500);
		
		//DEVICE NAME
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair/div/div[1]/div[3]/div/div/div[2]/button").click();
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair/div/div[2]/div[1]/div[1]/div/div[2]/input").sendKeys("Ultrasonic Flow Meter");
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair/div/div[2]/div[1]/div[2]/button[1]").click();
		Thread.sleep(1000);
		build.sendKeys(Keys.END).build().perform();
		Thread.sleep(1500);
		build.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair/div/div[2]/div[1]/div[2]/button[2]").click();
		Thread.sleep(1500);
		
		//DATE
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair/div/div[1]/div[3]/div/div/div[2]/button").click();
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair/div/div[2]/div[1]/div[1]/div/div[5]/div/p-calendar/span/input").sendKeys("08/25/2021");
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair/div/div[2]/div[1]/div[2]/button[1]").click();
		Thread.sleep(1000);
		build.sendKeys(Keys.END).build().perform();
		Thread.sleep(1500);
		build.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair/div/div[2]/div[1]/div[2]/button[2]").click();
		Thread.sleep(1500);
	}
	
	public void ClickBarcodeToViewDeviceDetais() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(BrowserFactory.LaunchBrowser(), 10);
		Actions build = new Actions(BrowserFactory.LaunchBrowser());
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair/div/div[2]/div/div/p-table/div/div[1]/table/tbody/tr[1]/td[1]/div/div[2]/a").click();
		Thread.sleep(2500);
		build.sendKeys(Keys.END).build().perform();
		Thread.sleep(1500);
		build.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1500);
	}
	
//	public void EditDetails() throws IOException, InterruptedException {
//		WebElement edit = BrowserFactory.LaunchBrowser().findElement(By.xpath("/html/body/app-root/app-layout/div/section/app-maintain-repair-detail/div[2]/div[2]/div/div/div[1]/div[2]/span"));
//		JavascriptExecutor js = (JavascriptExecutor)BrowserFactory.LaunchBrowser();
//		js.executeScript("arguments[0].click()", edit);
//		Thread.sleep(2000);
//		
//		WebElement updateButton = BrowserFactory.LaunchBrowser().findElement(By.xpath("/html/body/app-root/app-layout/div/section/app-maintain-repair-detail/div[2]/form/div[2]/div/button[1]"));
//		JavascriptExecutor js1 = (JavascriptExecutor)BrowserFactory.LaunchBrowser();
//		js1.executeScript("arguments[0].click()", updateButton);
//		Thread.sleep(2000);
//	}
	
	public void ConditionCheck() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(BrowserFactory.LaunchBrowser(), 10);
		WebElement element = BrowserFactory.LaunchBrowser().findElement(By.xpath("/html/body/app-root/app-layout/div/section/app-maintain-repair-detail/div[3]/div[1]"));
		((JavascriptExecutor) BrowserFactory.LaunchBrowser()).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1000);
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair-detail/div[3]/div[2]/div/div/div[2]/div/div[2]/div[2]/p-dropdown").click();
		Thread.sleep(500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair-detail/div[3]/div[2]/div/div/div[2]/div/div[2]/div[2]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li").click();
		Thread.sleep(500);
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair-detail/div[3]/div[2]/div/div/div[2]/div/div[3]/div[2]/p-dropdown").click();
		Thread.sleep(500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair-detail/div[3]/div[2]/div/div/div[2]/div/div[3]/div[2]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[2]/li").click();
		Thread.sleep(500);
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair-detail/div[3]/div[2]/div/div/div[2]/div/div[4]/div[2]/p-dropdown").click();
		Thread.sleep(500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair-detail/div[3]/div[2]/div/div/div[2]/div/div[4]/div[2]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[3]/li").click();
		Thread.sleep(500);
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair-detail/div[3]/div[2]/div/div/div[2]/div/div[5]/div[2]/p-dropdown").click();
		Thread.sleep(500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair-detail/div[3]/div[2]/div/div/div[2]/div/div[5]/div[2]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[4]/li").click();
		Thread.sleep(500);
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair-detail/div[3]/div[2]/div/div/div[2]/div/div[6]/div[2]/p-dropdown").click();
		Thread.sleep(500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair-detail/div[3]/div[2]/div/div/div[2]/div/div[6]/div[2]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li").click();
		Thread.sleep(500);
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair-detail/div[3]/div[2]/div/div/div[2]/div/div[7]/div[2]/p-dropdown").click();
		Thread.sleep(500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair-detail/div[3]/div[2]/div/div/div[2]/div/div[7]/div[2]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[2]/li").click();
		Thread.sleep(500);
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair-detail/div[3]/div[2]/div/div/div[2]/div/div[8]/div[2]/p-dropdown").click();
		Thread.sleep(500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair-detail/div[3]/div[2]/div/div/div[2]/div/div[8]/div[2]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[3]/li").click();
		Thread.sleep(500);
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair-detail/div[3]/div[2]/div/div/div[2]/div/div[9]/div[2]/p-dropdown").click();
		Thread.sleep(500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair-detail/div[3]/div[2]/div/div/div[2]/div/div[9]/div[2]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[4]/li").click();
		Thread.sleep(1000);
	}
	
	public void Remarks() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(BrowserFactory.LaunchBrowser(), 10);
		WebElement element = BrowserFactory.LaunchBrowser().findElement(By.xpath("/html/body/app-root/app-layout/div/section/app-maintain-repair-detail/div[4]/div/div/div/div[1]/div/h6"));
		((JavascriptExecutor) BrowserFactory.LaunchBrowser()).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1500);
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair-detail/div[4]/div/div/div/div[2]/div/div/div[1]/div/div[1]/textarea").sendKeys("Automated test remark");
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair-detail/div[4]/div/div/div/div[2]/div/div/div[1]/div/div[2]/button").click();
		Thread.sleep(2000);
		
	}
	
	public void SendForRepair() throws IOException, InterruptedException {
		Actions build = new Actions(BrowserFactory.LaunchBrowser());
		build.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1500);
		WebDriverWait wait = new WebDriverWait(BrowserFactory.LaunchBrowser(), 10);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair-detail/div[1]/div/div[2]/div/div/i").click();
		Thread.sleep(1000);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/div[3]/p-tieredmenusub/ul/li[2]/a").click();
		Thread.sleep(3000);
	}
	
	public void MaintanenceDone() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(BrowserFactory.LaunchBrowser(), 10);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair-detail/div[1]/div/div[2]/div/div/i").click();
		Thread.sleep(1000);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/div[3]/p-tieredmenusub/ul/li[1]/a").click();
		Thread.sleep(1000);
		
		WebElement uploadImage = BrowserFactory.LaunchBrowser().findElement(By.xpath("/html/body/app-root/app-layout/div/section/app-maintain-repair-detail/p-dialog/div/div[2]/div[2]/div[1]/p-fileupload/span/input"));
		uploadImage.sendKeys("E:\\avatar.png");
		Thread.sleep(3000);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair-detail/p-dialog/div/div[2]/div[3]/button[1]").click();
		Thread.sleep(2500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair-detail/div[1]/div/div[1]/a").click();
		Thread.sleep(2000);
	}
	
//----------------------- FOR REPAIR TAB -----------------------
	
	public void RepairTab() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(BrowserFactory.LaunchBrowser(), 10);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair/div/div[1]/div[2]/div/div/div[2]").click();
		Thread.sleep(2000);
		Actions build = new Actions(BrowserFactory.LaunchBrowser());
		build.sendKeys(Keys.END).build().perform();
		Thread.sleep(1000);
		build.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
	}
	
//----------------------- MAINTENANCE DUE TAB -----------------------	
	
	public void MaintenanceDueTab() throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(BrowserFactory.LaunchBrowser(), 10);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-maintain-repair/div/div[1]/div[2]/div/div/div[3]").click();
		Thread.sleep(2000);
		Actions build = new Actions(BrowserFactory.LaunchBrowser());
		build.sendKeys(Keys.END).build().perform();
		Thread.sleep(1000);
		build.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
	}
	
	public void feedback() throws IOException, InterruptedException {
		  BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/app-header/nav/ul/li[1]").click();
		  Thread.sleep(1000);
		  BrowserFactory.LaunchBrowser().findElementById("feedback") .sendKeys("Maintain & Repair Automated Test");
		  Thread.sleep(1000);
		  BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/app-screenfeedback-view-popup/div/p-dialog/div/div[2]/form/p-footer/div/div[1]/button[1]/span").click();
		  Thread.sleep(2000);
	  }
}
