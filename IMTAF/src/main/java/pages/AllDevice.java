package pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonUtils.BrowserFactory;
import commonUtils.ReadConfig;

public class AllDevice {
	
	public void AllDevices() throws IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		BrowserFactory.LaunchBrowser().findElement(By.xpath("//*[@id=\"notActive_/all-devices\"]")).click();
	}
	
	public void CreateNewDevice() throws IOException, InterruptedException, AWTException {
		
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(Long.parseLong(ReadConfig.getValue("implicitwait")), TimeUnit.SECONDS);

		BrowserFactory.LaunchBrowser().findElement(By.xpath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[1]/div[2]/div[2]/div/button/span")).click();
		Thread.sleep(1000);
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[2]/div[1]/div[1]/input").sendKeys("Device A");
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[2]/div[1]/div[2]/input").sendKeys("1001");
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[2]/div[2]/div[1]/input").sendKeys("01");
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[2]/div[2]/div[2]/input").sendKeys("Lutron");
		
//		Select drop = new Select(BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[2]/div[3]/div[1]/p-dropdown/div/label"));
//		drop.selectByVisibleText("Available");
//		WebElement status= BrowserFactory.LaunchBrowser().findElement(By.xpath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[2]/div[3]/div[1]/p-dropdown/div/div[4]/div/ul"));
//		List<WebElement> statusop = status.findElements(By.tagName("li"));
//		for (WebElement li : statusop) {
//		if (li.getText().equals("Available")) {
//		     li.click();
//		   }
//		}
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[2]/div[3]/div[1]/p-dropdown/div").click();
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[2]/div[3]/div[1]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li").click();
		
		Actions builder = new Actions(BrowserFactory.LaunchBrowser());
		builder.sendKeys(Keys.END).build().perform();
		Thread.sleep(1000);
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[2]/div[4]/div[1]/p-dropdown/div").click();
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[2]/div[4]/div[1]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li").click();
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[2]/div[4]/div[2]/p-dropdown/div").click();
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[2]/div[4]/div[2]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li").click();
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[2]/div[5]/div/textarea").sendKeys("Test accessories");

		WebElement datasheet = BrowserFactory.LaunchBrowser().findElement(By.xpath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[2]/div[6]/div[1]/p-fileupload/span/input"));
		datasheet.sendKeys("D:\\avatar.png");
		
		WebElement uploadusermanual = BrowserFactory.LaunchBrowser().findElement(By.xpath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[2]/div[6]/div[2]/p-fileupload/span/input"));
		uploadusermanual.sendKeys("D:\\avatar.png");
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[2]/div[7]/div/input").sendKeys("https://www.youtube.com/embed/cWzGDEDVEgY");
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[3]/form[1]/div/div[3]/div[1]/button[2]").click();
		Thread.sleep(2000);
//		}
		
//		Actions builder = new Actions(BrowserFactory.LaunchBrowser());
		builder.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
		
	}
	
	public void Search() throws IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(Long.parseLong(ReadConfig.getValue("implicitwait")), TimeUnit.SECONDS);
		Actions build = new Actions(BrowserFactory.LaunchBrowser());
		WebElement s1 = BrowserFactory.LaunchBrowser().findElement(By.xpath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[1]/div[2]/div[1]/div/input"));
		
		String[] searchdata = {"E-TED-000000001","Instrument","CO2/RHT Data Logger","Extech","SD800","Q844201","UAE","For Repr"};
		
		for(int i = 0; i<searchdata.length; i++) {
			s1.sendKeys(searchdata[i]);
			build.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(1000);
			BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[1]/div[2]/div[1]/div/div[1]/span").click();
			Thread.sleep(1000);
		}
		
	}
	
	@SuppressWarnings("unused")
	public void Filters() throws IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(Long.parseLong(ReadConfig.getValue("implicitwait")), TimeUnit.SECONDS);
		Actions build = new Actions(BrowserFactory.LaunchBrowser());
		
		//Category
		BrowserFactory.LaunchBrowser().findElement(By.xpath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[1]/div[2]/div[1]/div/div[2]/button/span[2]")).click();
		WebDriverWait wait = new WebDriverWait(BrowserFactory.LaunchBrowser(), 10);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[2]/div[1]/div[1]/div/div[1]/p-dropdown/div/div[3]").click();
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[2]/div[1]/div[1]/div/div[1]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[2]/li").click();
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[2]/div[1]/div[2]/div/button[1]/span").click();
		Thread.sleep(1000);
		build.sendKeys(Keys.END).build().perform();
		Thread.sleep(1000);
		build.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[2]/div[1]/div[2]/div/button[2]/span").click();
		Thread.sleep(1000);
		
		//Name
		BrowserFactory.LaunchBrowser().findElement(By.xpath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[1]/div[2]/div[1]/div/div[2]/button/span[2]")).click();
		WebDriverWait wait1 = new WebDriverWait(BrowserFactory.LaunchBrowser(), 10);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[2]/div[1]/div[1]/div/div[2]/input").sendKeys("sdfdsf");
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[2]/div[1]/div[2]/div/button[1]/span").click();
		Thread.sleep(1000);
		build.sendKeys(Keys.END).build().perform();
		Thread.sleep(1000);
		build.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[2]/div[1]/div[2]/div/button[2]/span").click();
		Thread.sleep(1000);
		
		//Calibration Due
		BrowserFactory.LaunchBrowser().findElement(By.xpath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[1]/div[2]/div[1]/div/div[2]/button/span[2]")).click();
		WebDriverWait wait2 = new WebDriverWait(BrowserFactory.LaunchBrowser(), 10);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[2]/div[1]/div[1]/div/div[5]/div/p-calendar/span/input").click();
		Thread.sleep(1000);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[2]/div[1]/div[1]/div/div[5]/div/p-calendar/span/div/div/div[2]/table/tbody/tr[5]/td[3]/a").click();
		Thread.sleep(1000);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[2]/div[1]/div[2]/div/button[1]/span").click();
		Thread.sleep(1000);
		build.sendKeys(Keys.END).build().perform();
		Thread.sleep(1000);
		build.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[2]/div[1]/div[2]/div/button[2]/span").click();
		Thread.sleep(1000);
		
		//Country
		BrowserFactory.LaunchBrowser().findElement(By.xpath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[1]/div[2]/div[1]/div/div[2]/button/span[2]")).click();
		WebDriverWait wait3 = new WebDriverWait(BrowserFactory.LaunchBrowser(), 10);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[2]/div[1]/div[1]/div/div[6]/p-dropdown/div/div[3]").click();
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[2]/div[1]/div[1]/div/div[6]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[2]/li").click();
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[2]/div[1]/div[2]/div/button[1]/span").click();
		Thread.sleep(1000);
		build.sendKeys(Keys.END).build().perform();
		Thread.sleep(1000);
		build.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[2]/div[1]/div[2]/div/button[2]/span").click();
		Thread.sleep(1000);
		
		//Availability
		BrowserFactory.LaunchBrowser().findElement(By.xpath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[1]/div[2]/div[1]/div/div[2]/button/span[2]")).click();
		WebDriverWait wait4 = new WebDriverWait(BrowserFactory.LaunchBrowser(), 10);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[2]/div[1]/div[1]/div/div[7]/div/p-dropdown/div/div[3]/span").click();
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[2]/div[1]/div[1]/div/div[7]/div/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li").click();
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[2]/div[1]/div[2]/div/button[1]/span").click();
		Thread.sleep(1000);
		build.sendKeys(Keys.END).build().perform();
		Thread.sleep(1000);
		build.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[2]/div[1]/div[2]/div/button[2]/span").click();
		Thread.sleep(1000);
	}
	
	public void DownloadCalDetails() throws IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(Long.parseLong(ReadConfig.getValue("implicitwait")), TimeUnit.SECONDS);
		Actions build = new Actions(BrowserFactory.LaunchBrowser());
		
		BrowserFactory.LaunchBrowser().findElement(By.xpath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[1]/div[3]/div/div[1]/p-checkbox/div/div[2]")).click();
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[2]/div/p-table/div/div[1]/table/thead/tr/th[1]/p-tableheadercheckbox/div/div[2]").click();
		
		build.sendKeys(Keys.END).build().perform();
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[2]/div[2]/div/button").click();
		Thread.sleep(1000);
//		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/div[3]/p-tieredmenusub/ul/li[2]/a").click();
//		Thread.sleep(4000);
//		build.sendKeys(Keys.CONTROL+"j").build().perform();
//		Thread.sleep(1500);
//		build.sendKeys(Keys.CONTROL+"1").build().perform();
//		Thread.sleep(1500);
		build.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(500);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[1]/div[3]/div/div[1]/p-checkbox/div/div[2]").click();
	}
	
	public void DeviceDetails() throws IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(Long.parseLong(ReadConfig.getValue("implicitwait")), TimeUnit.SECONDS);
		Actions build = new Actions(BrowserFactory.LaunchBrowser());
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-all-device/div/div[2]/div/p-table/div/div[1]/table/tbody/tr[1]/td[1]/div/div[2]/a").click();
		Thread.sleep(2000);
		build.sendKeys(Keys.END).build().perform();
		Thread.sleep(1000);
		build.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-device-detail/div/div[3]/div/div[1]/div/div/div[2]").click();
		Thread.sleep(1000);
		build.sendKeys(Keys.END).build().perform();
		Thread.sleep(1000);
		build.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-device-detail/div/div[3]/div/div[1]/div/div/div[3]").click();
		Thread.sleep(1000);
		build.sendKeys(Keys.END).build().perform();
		Thread.sleep(1000);
		build.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-device-detail/div/div[1]/div/div[2]/div/span").click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		build.sendKeys(Keys.END).build().perform();
		Thread.sleep(1000);
		build.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[2]/div/div/div[2]").click();
		Thread.sleep(1000);
		build.sendKeys(Keys.END).build().perform();
		Thread.sleep(1000);
		build.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[2]/div/div/div[3]").click();
		Thread.sleep(1000);
		build.sendKeys(Keys.END).build().perform();
		Thread.sleep(1000);
		build.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
		
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/section/app-edit-device/div/div[1]/div/a").click();
		Thread.sleep(1000);
	}
	
	public void feedback() throws IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(Long.parseLong(ReadConfig.getValue("implicitwait")), TimeUnit.SECONDS);
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/app-header/nav/ul/li[1]").click();
		BrowserFactory.LaunchBrowser().findElementById("feedback") .sendKeys("All Devices Automated Test");
		BrowserFactory.LaunchBrowser().findElementByXPath("/html/body/app-root/app-layout/div/app-screenfeedback-view-popup/div/p-dialog/div/div[2]/form/p-footer/div/div[1]/button[1]/span").click();
		Thread.sleep(2000);
	  }

}
