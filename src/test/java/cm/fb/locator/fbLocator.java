package cm.fb.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;   
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.baseClass.BaseClass;

	public  class fbLocator   {
		public static BaseClass base =new BaseClass();
     
		public fbLocator () {
		PageFactory.initElements(base.driver,this);
	}
		@FindBy(xpath = "//input[@data-testid='royal_email']")
		private WebElement mobile;
	
		@FindBy(xpath = "//input[@id='pass']")
		private WebElement pass;
		
		@FindBy(xpath = "//button[@type='submit']")
		private WebElement submit;

		public WebElement getMobile() {
			return mobile;
		}

		public WebElement getPass() {
			return pass;
		}

		public WebElement getSubmit() {
			return submit;
		}
	
		
	}
	

