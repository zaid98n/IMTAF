package im;

import java.io.IOException;
import java.util.Date;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import commonUtils.BrowserFactory;
import commonUtils.Screenshot;
import pages.MaintainRepair;

public class MaintainRepairTest {
	
	MaintainRepair main = new MaintainRepair();
	
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
	public void TC001_ClickMaintainRepair() throws IOException, InterruptedException {
		main.Maintain_Repair();
	}
	
	@Test
	public void TC002_CheckSearch() throws IOException, InterruptedException {
		main.Search();
	}
	
	@Test
	public void TC003_CheckFilter() throws IOException, InterruptedException {
		main.Filter();
	}
	
	@Test
	public void TC004_BarcodeToViewDeviceDetais() throws IOException, InterruptedException {
		main.ClickBarcodeToViewDeviceDetais();
	}
	
	@Test
	public void TC005_CheckConditions() throws IOException, InterruptedException {
		main.ConditionCheck();
	}
	
	@Test
	public void TC006_CheckRemarks() throws IOException, InterruptedException {
		main.Remarks();
	}
	
	@Test
	public void TC007_CheckSendForRepair() throws IOException, InterruptedException {
		main.SendForRepair();
	}
	
	@Test
	public void TC008_CheckMaintanenceDone() throws IOException, InterruptedException {
		main.MaintanenceDone();
	}
	
	@Test
	public void TC009_CheckRepairTab() throws IOException, InterruptedException {
		main.RepairTab();
	}
	
	@Test
	public void TC010_CheckMaintenanceDueTab() throws IOException, InterruptedException {
		main.MaintenanceDueTab();
	}
	
	@Test
	public void TC011_feedback() throws IOException, InterruptedException {
		main.feedback();
	}

}
