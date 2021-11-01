package im;

import java.io.IOException;
import java.util.Date;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import commonUtils.BrowserFactory;
import commonUtils.DataFile;
import commonUtils.Screenshot;
import pages.DispenseCollect;
import pages.Login;

public class DispenseCollectTest {
	
	Login login = new Login();
	DispenseCollect dis = new DispenseCollect();
	
	static Date currentdate = new Date();
	static String fname = currentdate.toString().replace(" ","_").replace(":","-");
	@AfterMethod 
	public void takeScreenShotOnFailure(ITestResult testResult) throws IOException, InterruptedException { 
		String methodname = testResult.getName();
		if (testResult.getStatus() == ITestResult.FAILURE) { 
			Screenshot.capture(BrowserFactory.LaunchBrowser(), (methodname+"_"+fname));
		} 
	}
	
	@AfterMethod
	public void waiting() throws InterruptedException {
		Thread.sleep(1500);
	}
	
	@Test
	public void TC001_ClickDispenseCollect() throws IOException, InterruptedException {
		dis.Dispense_Collect();
	}
	
	@Test
	public void TC002_CheckSearch() throws IOException, InterruptedException {
		dis.Search();
		Thread.sleep(1500);
		dis.Logout();
	}
	
	@Test
	public void TC003_GoToUserPortal() throws IOException, InterruptedException {
		String UsrName1 = DataFile.CellData(2, 0);
		String Psword1 = DataFile.CellData(2, 1);
		login.setUsername(UsrName1);
		login.setPassword(Psword1);
		login.clickLogin();
		Thread.sleep(4000);
	}
	
	@Test
	public void TC004_CreateDeviceRequest() throws IOException, InterruptedException {
		dis.CreateRequest();
		Thread.sleep(1500);
		dis.Logout();
	}
	
	@Test
	public void TC005_GoToAdminPortal() throws IOException, InterruptedException {
		String UsrName2 = DataFile.CellData(1, 0);
		String Psword2 = DataFile.CellData(1, 1);
		login.setUsername(UsrName2);
		login.setPassword(Psword2);
		login.clickLogin();
		Thread.sleep(5000);
		dis.Dispense_Collect();
	}
	
	@Test
	public void TC006_ApproveDeviceRequest() throws IOException, InterruptedException {
		dis.ApproveRequest();
	}
	
	@Test
	public void TC007_CollectDeviceRequest() throws IOException, InterruptedException {
		dis.CollectRequest();
	}
	
	@Test
	public void TC008_ReturnDeviceRequest() throws IOException, InterruptedException {
		dis.ReturnRequest();
	}
	
	@Test
	public void TC009_Feedback() throws IOException, InterruptedException {
		dis.feedback();
		Thread.sleep(1500);
		dis.Logout();
	}

}








