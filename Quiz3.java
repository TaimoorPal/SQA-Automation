package Quiz3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Quiz3 {
	@Test(dataProvider = "dataSet1")
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\4397\\Documents\\SQA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Util obj = new Util(driver);
		driver.get("http://release01.curemd.com/curemdy/datlogin.asp");
		Thread.sleep(3000);
		obj.login.sendKeys("GlobalPeriod");
		obj.password.sendKeys("SuPPort.2014");
		obj.loginButton.click();
		String parentHandle =  driver.getWindowHandle();
		Thread.sleep(5000);
		driver.switchTo().frame(obj.frame1);
		Actions act = new Actions(driver);
		act.moveToElement(obj.patientButton).click();
		obj.lastname.sendKeys("Aaa");
		obj.firstName.sendKeys("ZIXHEENOQK");
		obj.DOB.sendKeys("01/01/2002");
		obj.searchButton.click();
		
		//Print all the status DropDown
		System.out.println(obj.dataSet1());
		@DataProvider(name = "dataset")
		public Object[] dataSet2()
		{
			return new Object[]
					{"Single", "Married", "Separated", "Divorced", "Widowed", "Partnered", "Unknown"
					};
		}
		
		//now compare data set2 with data set1
		
	
	}
}
