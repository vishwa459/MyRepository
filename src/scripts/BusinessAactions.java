package scripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import ui_Obj.UiObjectInfo;

import functionalLib.ExcelRead;

public class BusinessAactions {

	WebDriver driver;
	public  ExcelRead ER = null;
	public  UiObjectInfo Uinfo;
	public String Testdatapath = ("user+dir")+"\\src\\testData.xls";
	
	
	
	
	public void openApplication(){
	
		 ER = new ExcelRead(Testdatapath, "Launch application");
		String browser = ER.getCellData("Browsertype", 4);
			if (browser.equalsIgnoreCase("firefox")){
				driver = new FirefoxDriver();
			}else if (browser.equalsIgnoreCase("chrome")){
				System.setProperty("Webdriver.chrome.driver", ("user+dir")+"\\src\\chromedrive.exe");
				driver = new ChromeDriver();
			}else if (browser.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
		
			driver.get(ER.getCellData("URL", 3));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		
	}
	
	public void closeApplication(){
		driver.quit();
	}


	public void hotelSearch(){
		
			ER = new ExcelRead(Testdatapath, "Testdata");
			
			driver.findElement(By.linkText(Uinfo.Uiobj_hotel_main_link)).click();
			driver.findElement(By.linkText(Uinfo.Uiobj_hotel_Tab_link)).click();
			
			driver.findElement(By.id(Uinfo.Uiobj_hotel_Dst_id)).click();
			driver.findElement(By.id(Uinfo.Uiobj_hotel_Dst_id)).clear();
			driver.findElement(By.id(Uinfo.Uiobj_hotel_Dst_id)).sendKeys(ER.getCellData("Destination", 4));
			
			driver.findElement(By.id(Uinfo.Uiobj_hotel_DateField_id)).sendKeys(ER.getCellData("Check In", 4));
			driver.findElement(By.id(Uinfo.Uiobj_hotel_DateOut_id)).sendKeys(ER.getCellData("Check Out", 4));
			
			Select select = new Select(driver.findElement(By.id(Uinfo.Uiobj_hotel_Sel_Rooms_id)));
			select.selectByValue(ER.getCellData("Rooms", 4));
			
			select = new Select(driver.findElement(By.id(Uinfo.Uiobj_hotel_Sel_Adult_xpath)));
			select.selectByValue(ER.getCellData("Adults", 4));
			
			driver.findElement(By.xpath(Uinfo.Uiobj_hotel_find_id)).click();
			
			/*WebDriverWait wdw = new WebDriverWait(driver, 90);
			wdw.until(ExpectedConditions.elementToBeClickable(By.id(id)))
			*/
			
			
		
	}


	public void searchResults(){
		
		ER = new ExcelRead(Testdatapath, "Testdata");
		
		String resultText = driver.findElement(By.id(Uinfo.Uiobj_hotel_DestName_id)).getText();
		
		String expectedText = ER.getCellData("Destination", 4);
		if(resultText.contains(expectedText)){
			System.out.println("Correct Destination name is displayed");
		}else {
		    System.out.println("Correct Destination name is not displayed");
		}
		
		List<WebElement> hotelRatings = driver.findElements(By.id(Uinfo.Uiobj_hotel_Rating_id));
		//for (hotelRating)
		
	}


}
