package stepDef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepBean.Bean;

public class Test {

	private WebDriver driver;
	private Bean bean;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe" );
		driver= new ChromeDriver();
	}
	
	@Given("^User is on register page$")
	public void user_is_on_register_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("file:///D:\\Users\\arusmani\\TestingAriz\\FormWeb\\Form.html");
		bean = new Bean(driver);
	}

	@When("^username is invalid$")
	public void username_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setName("");
		bean.setLoginButton();
	}

	@Then("^then show message invalid username$")
	public void then_show_message_invalid_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String exmessage="Enter username";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();
	}

	@When("^password is invalid$")
	public void password_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setName("Ariz");
		bean.setPass("");
		bean.setLoginButton();
	}

	@Then("^then show message invalid password$")
	public void then_show_message_invalid_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String exmessage="Enter password";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();
	}

	@When("^passwordconfirm is invalid$")
	public void passwordconfirm_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^then show message invalid passwordc$")
	public void then_show_message_invalid_passwordc() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^firstname is invalid$")
	public void firstname_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setName("Ariz");
		bean.setPass("binga");
		bean.setFname("");
		bean.setLoginButton();
	}

	@Then("^then show message invalid firstname$")
	public void then_show_message_invalid_firstname() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String exmessage="Enter first name";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();
	}

	@When("^lastname is invalid$")
	public void lastname_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setName("Ariz");
		bean.setPass("binga");
		bean.setFname("Ariz");
		bean.setLname("");
		bean.setLoginButton();
	}

	@Then("^then show message invalid lastname$")
	public void then_show_message_invalid_lastname() throws Throwable {
	    //throw new PendingException();
		String exmessage="Enter last name";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();
	}

	@When("^gender is invalid$")
	public void gender_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setName("Ariz");
		bean.setPass("binga");
		bean.setFname("Ariz");
		bean.setLname("Usmani");
		bean.setGender();
		bean.setLoginButton();
	}

	@Then("^then show message invalid gender$")
	public void then_show_message_invalid_gender() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String exmessage="Enter gender";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();
	}

	@When("^dob is invalid$")
	public void dob_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setName("Ariz");
		bean.setPass("binga");
		bean.setFname("Ariz");
		bean.setLname("Usmani");
		bean.setGender();
		bean.setDob("");
		bean.setLoginButton();
	}

	@Then("^then show message invalid dob$")
	public void then_show_message_invalid_dob() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String exmessage="Enter DOB";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();
	}

	@When("^email is invalid$")
	public void email_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		bean.setName("Ariz");
		bean.setPass("binga");
		bean.setFname("Ariz");
		bean.setLname("Usmani");
		bean.setGender();
		bean.setDob("1/1/1996");
		bean.setEmail("");
		bean.setLoginButton();
	}

	@Then("^then show message invalid email$")
	public void then_show_message_invalid_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String exmessage="Enter email";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();
	}

	@When("^address is invalid$")
	public void address_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setName("Ariz");
		bean.setPass("binga");
		bean.setFname("Ariz");
		bean.setLname("Usmani");
		bean.setGender();
		bean.setDob("1/1/1996");
		bean.setEmail("arizusmani");
		bean.setAddress("");
		bean.setLoginButton();
	}

	@Then("^then show message invalid address$")
	public void then_show_message_invalid_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String exmessage="Enter address";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();
	}

	@When("^city is invalid$")
	public void city_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setName("Ariz");
		bean.setPass("binga");
		bean.setFname("Ariz");
		bean.setLname("Usmani");
		bean.setGender();
		bean.setDob("1/1/1996");
		bean.setEmail("arizusmani");
		bean.setAddress("Hinjewadi");
		bean.setCity("");
		bean.setLoginButton();
	}

	@Then("^then show message invalid city$")
	public void then_show_message_invalid_city() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String exmessage="Enter city";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();
	}

	@When("^mobile is invalid$")
	public void mobile_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bean.setName("Ariz");
		bean.setPass("binga");
		bean.setFname("Ariz");
		bean.setLname("Usmani");
		bean.setGender();
		bean.setDob("1/1/1996");
		bean.setEmail("arizusmani");
		bean.setAddress("Hinjewadi");
		bean.setCity("Pune");
		bean.setPhone("");
		bean.setLoginButton();
	}

	@Then("^then show message invalid mobile$")
	public void then_show_message_invalid_mobile() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String exmessage="Enter phone";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();
	}

	@When("^hobby is invalid$")
	public void hobby_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		bean.setName("Ariz");
		bean.setPass("binga");
		bean.setFname("Ariz");
		bean.setLname("Usmani");
		bean.setGender();
		bean.setDob("1/1/1996");
		bean.setEmail("arizusmani");
		bean.setAddress("Hinjewadi");
		bean.setCity("Pune");
		bean.setPhone("445446");
		bean.setHobby();
		bean.setLoginButton();
	}

	@Then("^then show message invalid hobby$")
	public void then_show_message_invalid_hobby() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new PendingException();
		String exmessage="Enter hobby";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();
	}

	@When("^all valid details$")
	public void all_valid_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	bean.setName("Ariz");
	bean.setPass("binga");
	bean.setFname("Ariz");
	bean.setLname("Usmani");
	bean.setGender();
	bean.setDob("1/1/1996");
	bean.setEmail("arizusmani");
	bean.setAddress("Hinjewadi");
	bean.setCity("Pune");
	bean.setPhone("445446");
	bean.setHobby();
	bean.setLoginButton();
	}

	@Then("^then go to success page$")
	public void then_go_to_success_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.get("file:///D:\\Users\\arusmani\\TestingAriz\\FormWeb\\success.html");
	}


}
