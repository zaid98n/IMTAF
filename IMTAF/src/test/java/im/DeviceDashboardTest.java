package im;

import java.io.IOException;
import java.util.Date;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import commonUtils.BrowserFactory;
import commonUtils.Screenshot;
import pages.DeviceDashboard;

public class DeviceDashboardTest {
	
	DeviceDashboard dash = new DeviceDashboard();
	
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
	public void TC001_ScrollPage() throws IOException, InterruptedException {
		dash.PageScroll();
	}
	
	@Test
	public void TC002_ClickTotalDevices() throws IOException, InterruptedException {
		dash.TotalDevices();
	}
	
	@Test
	public void TC003_ClickAvailableDevices() throws IOException, InterruptedException {
		dash.AvailableDevices();
	}
	
	@Test
	public void TC004_ClickTotalCalibratedDevices() throws IOException, InterruptedException {
		dash.TotalCalibratedDevices();
	}
	
	@Test
	public void TC005_ClickCurrentMonthCalibrationDue() throws IOException, InterruptedException {
		dash.CurrentMonthCalibrationDue();
	}
	
	@Test
	public void TC006_ClickUpcomingMonthCalibrationDue() throws IOException, InterruptedException {
		dash.UpcomingMonthCalibrationDue();
	}
	
	@Test
	public void TC007_PendingDeviceRequest() throws IOException, InterruptedException {
		dash.PendingDeviceRequest();
	}
	
	@Test
	public void TC008_FeedbackDeviceDashboard() throws IOException, InterruptedException {
		dash.feedback();
	}

}
