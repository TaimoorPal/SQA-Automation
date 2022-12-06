package Quiz3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import java.util.List;

public class Util {
	WebDriver driver;
	@FindBy (id="vchLogin_Name")
	WebElement login;
	@FindBy (id="vchPassword")
	WebElement password;
	
	@FindBy (xpath="//button[@type='button']")
	WebElement loginButton;
	
	@FindBy (xpath="//a[@id='patientBtn']")
	WebElement patientButton;
	
	@FindBy (id="txtLast_Name")
	WebElement lastname;
	
	@FindBy (id="txtFirst_Name")
	WebElement firstName;
	
	@FindBy (xpath="//input[@name='txtDOB']")
	WebElement DOB;
	
	@FindBy (xpath="//td[@class='ButtonItem']")
	WebElement searchButton;
	
	@FindBy (xpath="//select[@name='ddlCountry']")
	WebElement countryDropDown;
	
	@FindBy (xpath="//iframe[@id='fra_Menu_CureMD']")
	WebElement frame1;
	@FindBy (xpath="//option[@value='MAR']")
	WebElement married;
	
	@FindBy (xpath="//option[@value='LS']")
	WebElement Separated;
	
	@FindBy (xpath="//option[@value='DIV']")
	WebElement divorced;
	
	@FindBy (xpath="//option[@value='WD']")
	WebElement widowed;
	
	@FindBy (xpath="//option[@value='PAT']")
	WebElement partnered;
	
	@FindBy (xpath="//option[@value='UN']")
	WebElement unknown;
	
	@FindBy (xpath="//option[@value='SIN']")
	WebElement single;
	
	@FindBy (xpath="//select[@name='cmbvstatus']")
	WebElement statusDropDown;
	@DataProvider(name = "dataset")
	public Object[] dataSet1()
	{
		return new Object[]
				{single, unknown, partnered, widowed, divorced, Separated, married
				};
	}
	
	
	
	
	public Util(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }
}
