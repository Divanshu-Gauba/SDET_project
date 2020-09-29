package StepDefinition;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class steps {
	WebDriver driver;
	
	@Before
	public void beforetest()
	{
		System.setProperty("webdriver.chrome.driver", "C://DKS//Software//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void aftertest()
	{
		driver.close();
		
	}
	
	
	@Given("I am able to naviagte onto the login page")
	public void i_am_able_to_naviagte_onto_the_login_page() {
		
		driver.get("http://elearningm1.upskills.in/");
	   
	}

	@Given("I am able to naviagte onto the signup page")
	public void i_am_able_to_naviagte_onto_the_singnup_page() {
		
		driver.get("http://elearningm1.upskills.in/main/auth/inscription.php/");
	   
	}

	@When("I Enter the username as {string}")
	public void I_enter_the_username_as(String string) {
		 driver.findElement(By.id("login")).sendKeys(string);
	}
	
	@When("I Enter the password as {string}")
	public void I_enter_the_password_as(String string) {
		   driver.findElement(By.id("password")).sendKeys(string);
	}
	
	@When("I click on the login button")
	public void I_click_on_the_login_button() throws InterruptedException {
		driver.findElement(By.id("form-login_submitAuth")).click();
		Thread.sleep(3000);
	}	
	    
	@When("I Enter the first name as {string}")
	public void I_Enter_the_first_name_as(String string) {
		 driver.findElement(By.id("registration_firstname")).sendKeys(string);				
	}
	@When("I Enter the last name as {string}")
	public void I_Enter_the_last_name_as(String string) {
		 driver.findElement(By.id("registration_lastname")).sendKeys(string);				
	}
	@When("I Enter the email as {string}")
	public void I_Enter_the_email_as(String string) {
		 driver.findElement(By.id("registration_email")).sendKeys(string);				
	}	
	@When("I Enter the registration username as {string}")
	public void I_Enter_the_registration_username_as(String string) {
		 driver.findElement(By.id("username")).sendKeys(string);				
	}
	@When("I Enter the registration password as {string}")
	public void I_Enter_the_registration_password_as(String string) {
		 driver.findElement(By.id("pass1")).sendKeys(string);				
	}
	@When("I Enter the confirm password as {string}")
	public void I_Enter_the_confirm_password_as(String string) {
		 driver.findElement(By.id("pass2")).sendKeys(string);				
	}
	@When("I Enter the phone as {string}")
	public void I_Enter_the_phone_as(String string) {
		 driver.findElement(By.id("registration_phone")).sendKeys(string);				
	}
	@When("I am creating account for student")
	public void I_am_creating_account_for_student() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='col-sm-8']/div[1]/label/input")).click();
		Thread.sleep(3000);			
	}
	@When("I am creating account for teacher")
	public void I_am_creating_account_for_teacher() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='col-sm-8']/div[2]/label/input")).click();
		Thread.sleep(5000);			
	}	
	@When("I click on the register button")
	public void I_click_on_the_register_button() throws InterruptedException {
		driver.findElement(By.id("registration_submit")).click();
		Thread.sleep(5000);			
	}
	
	@Then("I should see the username as {string}")
	public void I_should_see_the_username_as(String string) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right']/li[2]/a")).click();
		String expected = driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right']//a/p")).getText();
		   Assert.assertEquals(expected, string);
		   Thread.sleep(3000);
		   driver.findElement(By.id("logout_button")).click();
		   Thread.sleep(3000);   
	  
	}
	
	@Then("I should see a Error meassage as {string}")
	public void i_should_see_a_error_meassage_as(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 String getErrortext=driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
	        Assert.assertEquals("Valid Login",getErrortext,"Login failed - incorrect login or password.");
	       
	}



}
