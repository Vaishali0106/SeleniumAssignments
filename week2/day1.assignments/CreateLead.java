package week2.day2.Assignments

public class CreateLead {

	public static void main(String[] args) {
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
		
		WebElement leads = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		leads.click();
		
		WebElement createLead = driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]"));
		createLead.click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("CCC");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Test1");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Test2");
		
		WebElement source = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		Select emp =new Select(source);
		emp.selectByVisibleText("Employee");
		
		WebElement campaign = driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']"));
		Select cam=new Select(campaign);
		cam.selectByValue("9001");
		
		WebElement ownership = driver.findElement(By.xpath("//select[@id='createLeadForm_ownershipEnumId']"));
		Select owner=new Select(ownership);
		owner.selectByIndex(6);
		
		 WebElement country = driver.findElement(By.xpath("//select[@id='createLeadForm_generalCountryGeoId']"));
		Select countr= new Select(country);
		countr.selectByVisibleText("India");
		
		WebElement create = driver.findElement(By.xpath("//input[@name='submitButton']"));
		create.click();
		
		System.out.println(driver.getTitle());
		
		
		
		
	}
	
}	
