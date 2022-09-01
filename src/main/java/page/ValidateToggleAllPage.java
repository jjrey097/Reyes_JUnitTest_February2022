package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ValidateToggleAllPage extends BasePage {

	WebDriver driver;
	
	public ValidateToggleAllPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	@FindBy(how = How.XPATH, using = "//input[@name='data']")WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/input[2]")WebElement CLICK_ADD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@name='todo[0]']")WebElement REMOVE_SINGLE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@value='Remove']")WebElement REMOVE_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@name='allbox']")WebElement CLICK_TOGGLE_ALL_BOX;
	
	public void insertFullName(String fullname) {
		int genNum = generateRandomNo(999);
		FULL_NAME_ELEMENT.sendKeys(fullname + genNum);
	}
	
	public void clickAddButton() {
		CLICK_ADD_ELEMENT.click();
	}
	
	public void removeSingleElement() {
		REMOVE_SINGLE_ELEMENT.click();
	}
	
	public void removeButton() {
		REMOVE_BUTTON_ELEMENT.click();
	}
	
		
	public void clickToggleAll() {
		CLICK_TOGGLE_ALL_BOX.click();
	}
	
	
	
	
	
	
}
