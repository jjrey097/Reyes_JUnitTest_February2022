package test;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.ValidateToggleAllPage;
import util.BrowserFactory;

public class ValidateToggleAllTest {
	
	WebDriver driver;
	
	@Test
	public void validateUserShouldBeAbleToToggleAll() throws InterruptedException {
		driver = BrowserFactory.init();
		
		
		
		ValidateToggleAllPage validateToggleAllPage = PageFactory.initElements(driver, ValidateToggleAllPage.class);
		validateToggleAllPage.insertFullName("Jonathan");
		validateToggleAllPage.clickAddButton();
		validateToggleAllPage.insertFullName("Johnny");
		validateToggleAllPage.clickAddButton();
		validateToggleAllPage.insertFullName("John");
		validateToggleAllPage.clickAddButton();
		
		validateToggleAllPage.removeSingleElement();
		validateToggleAllPage.removeButton();
		validateToggleAllPage.clickToggleAll();
		validateToggleAllPage.removeButton();

	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	
}
