package com.Facebook;


import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.fb.baseClass.BaseClass;

import cm.fb.locator.fbLocator;
import io.cucumber.java.en.When;

	public class login {
		public static BaseClass Base =BaseClass.getInstance();
		public static BaseClass base = BaseClass.getInstance();
		public static fbLocator locators = new fbLocator();
		public static HSSFWorkbook readWorkbook;
		public static HSSFSheet readSheet;
		public static String password;
		public static HSSFCell mobile;
		
		@When("User enters email address or phone number {string}")
		public void user_enters_email_aSddress_or_phone_number(String mobileNo) {
			base.sendText(locators.getMobile(), mobileNo);
		}

		@When("User enters the password {string}")
		public void user_enters_the_password(String password) {
			base.sendText(locators.getPass(), password);
		}

		@When("User clicks on login button")
		public void user_clicks_on_login_button() {
		
			base.button(locators.getSubmit());
		}

//		@Then("Validate the user credentials in db and proceed to homepage {string}{string}{string}")
//		public void validate_the_user_credentials_in_db_and_proceed_to_homepage
//		(String mobileNo, String dbPassword, String url) {
//			try {
//				readWorkbook = base.readWorkbook("C:\Users\MJ\eclipse-workspace\cucumber\target\\Account Details.xlsx");
//				readSheet = readWorkbook.getSheet("User Accounts");
//				for(int i=1;i<readSheet.getPhysicalNumberOfRows();i++) {
//					mobile = readSheet.getRow(i).getCell(2);
//					password = readSheet.getRow(i).getCell(5).getStringCellValue();
//					mobile.setCellType(CellType.STRING);
//	                String dbMobile= mobile.getStringCellValue();
//					if(dbMobile.equals(mobileNo) && dbPassword.equals(password)) {
//						BaseClass.driver.navigate().to(url);
//					}
//					else {
//						System.out.println("Please enter valid username and password");
//						i = readSheet.getPhysicalNumberOfRows();
//					}
//				}
//				base.closeReadFile();
//				Thread.sleep(3000);
//			} catch (Exception e) {
//				e.printStackTrace();
//			} 
//		}
	}


