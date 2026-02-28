package gettingstarted;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class LoginLogoutTest {

	public static void main(String[] args) 
	{
		Browser browser = null;
		Page page = null;
	try
	{
	browser=Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
    page=browser.newPage();
    page.navigate("https://demo.automationtesting.in/Index.html");
    PlaywrightAssertions.assertThat(page).hasTitle("Index");
	
   
    page.waitForTimeout(5000);
    /*
    page.locator("#username").fill("student");
	//page.getByPlaceholder("");
	
	page.locator("#password").fill("Password123");
	page.locator("#submit").click();
	PlaywrightAssertions.assertThat(page.locator("xpath=//*[@id=\"loop-container\"]/div/article/div[1]/h1")).containsText("Logged In Successfully");
	
	page.waitForTimeout(5000);
	page.getByText("Home").click();
	
	
    page.locator("#email").fill("testram@test.com");
    page.locator("#enterimg").click();
    PlaywrightAssertions.assertThat(page.locator("xpath=//*[@id=\"section\"]/div/h2")).containsText("Register");
    page.getByPlaceholder("First Name").fill("TestFname");
    page.getByPlaceholder("Last Name").fill("TestLname");
    page.locator("xpath=//textarea[@rows='3']").fill("Test Address Line 1");
    page.locator("xpath=//input[@type='email']").fill("testemail@test.com");
    page.locator("xpath=//input[@type='tel']").fill("9990009991");
    page.locator("xpath=//input[@value='Male']").click();
    page.locator("xpath=//input[@value='Cricket']").click();
    page.locator("xpath=//input[@value='Movies']").click();
    page.locator("#msdd").click();
    page.click("a.ui-corner-all:text('English')");
    
    */
     
    
    
    
    
    
    
    
    
	
	}
	
	
	finally
	{
		//page.close();
	    //browser.close();
	}
    
	}

}
