package week2.day1.Assignments;

public class CreateAccount {

	public static void main(String[] args) {
		/*
		 * //Pseudo Code
		 * 
		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		 * 
		 * 2. Enter UserName and Password Using Id Locator
		 * 
		 * 3. Click on Login Button using Class Locator
		 * 
		 * 4. Click on CRM/SFA Link
		 * 
		 * 5. Click on Accounts Button
		 * 
		 * 6. Click on Create Account
		 *  
		 * 7. Enter AccountName Field Using Xpath Locator value as Debit Limited Account
		 * 
		 * 8. Enter DEscriptiion as "Selenium Automation Tester"
		 * 
		 * 9. Enter LocalName Field Using Xpath Locator
		 * 
		 * 10. Enter SiteName Field Using Xpath Locator
		 * 
		 * 11. Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
		 * 
		 * 12. Select Industry as ComputerSoftware
		 * 
		 * 13. Select OwnerShip as S-Corporation using SelectByVisibletext
		 * 
		 * 14. Select Source as Employee using SelectByValue
		 * 
		 * 15. Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
		 * 
		 * 16. Select State/Province as Texas using SelectByValue 
		 * 
		 * 17. Click on Create Account using Xpath Locator
        
      
        
      
		 */
				WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("crmsfa");
		
		WebElement login = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		login.click();
		
		WebElement crmsfa = driver.findElement(By.xpath("//div[@class='crmsfa']//div[1]"));
		crmsfa.click();
		
		WebElement accountsTab = driver.findElement(By.xpath("//div[@class='x-panel-header']//a[contains(text(),'Accounts')]"));
		accountsTab.click();
		
		WebElement createAccount = driver.findElement(By.xpath("//div[@class='frameSectionBody']//ul/li[2]//a"));
		createAccount.click();
		
		WebElement accountName = driver.findElement(By.id("accountName"));
		accountName.sendKeys("Debit Limited Account");
		
		WebElement description = driver.findElement(By.xpath("//textarea[@name='description']"));
		description.sendKeys("Selenium Automation Tester");
		
		WebElement localName = driver.findElement(By.xpath("//input[@id='groupNameLocal']"));
		localName.sendKeys("Demo");
		
		WebElement siteName = driver.findElement(By.xpath("//input[@id='officeSiteName']"));
		siteName.sendKeys("test");
		
		WebElement annualRevenue = driver.findElement(By.xpath("//table[@class='fourColumnForm']//tbody//tr[3]//input[@name='annualRevenue']"));
		annualRevenue.sendKeys("4000000");
		
		WebElement 	industry = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select dd= new Select(industry);
		dd.selectByVisibleText("Computer Software");
		
		WebElement ownership = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select dd2=new Select(ownership);
		dd2.selectByVisibleText("S-Corporation");
		
		WebElement source = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select dd3=new Select(source);
		dd3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement campaign = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select dd4=new Select(campaign);
		dd4.selectByIndex(6);
		
		WebElement state = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select dd5=new Select(state);
		dd5.selectByValue("TX");
		
		WebElement createAccount1 = driver.findElement(By.xpath("//input[@value='Create Account']"));
		createAccount1.click();
		
		System.out.println("Pass");
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
