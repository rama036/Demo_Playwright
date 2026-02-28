package gettingstarted;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class vtechsolution {

	public static void main(String[] args) {
		Browser browser = null;
		Page page = null;
		
		try {
			
			//Launch the browser
			Playwright pw =	Playwright.create();
			BrowserType browserType= pw.chromium();
			browser=	browserType.launch(new BrowserType.LaunchOptions().setHeadless(false));
			page=	browser.newPage();
			//Open URL
			page.navigate("https://vinothqaacademy.com/");
			String title =page.title();
			System.out.println("Title of the page is "+ title);
			PlaywrightAssertions.assertThat(page).hasTitle("Vinoth Tech Solutions – Empowering Tech Careers ");
			
			//page.waitForTimeout(5000);
			//page.getByText("Home").click();
			//PlaywrightAssertions.assertThat(page.locator("xpath =//h2[contains(normalize-space(.), 'Our Company Vision')]\r\n")).containsText("Our Company Vision");
			
			//Click on tutorial link
			page.locator("xpath = //a[text()='Tutorials']").nth(1).click();
			PlaywrightAssertions.assertThat(page.locator("xpath = //h2[text()='API Testing']")).containsText("API Testing");
			page.waitForTimeout(5000);
			
			//Click on registration form 
			page.getByText("Demo Site").nth(1).click();
			page.getByText("Practice Automation").nth(1).click();
			page.getByText("Registration Form").nth(1).click();
			
			//Start filling registration form 
			
			page.locator("#vfb-5").fill("Test User Fname");
			page.locator("#vfb-7").fill("Test User Lname");
			page.getByText("Male").nth(0).click();
			page.getByText("Selenium WebDriver").click();
			page.locator("#vfb-13-address").fill("Address Line1");
			page.locator("#vfb-13-address-2").fill("Address Line2");
			page.locator("#vfb-13-city").fill("Noida");
			page.locator("#vfb-13-state").fill("UP");
			page.locator("#vfb-13-zip").fill("201305");
			page.locator("xpath=//span[@role='combobox' and @aria-haspopup='true']").nth(0).click();
			page.locator("xpath=//li[text()='India']").click();
			page.locator("#vfb-14").fill("testram@test.com");
			page.locator("#vfb-18").click();
			page.locator("xpath=//a[text()='4']").click();
			page.locator("xpath = //span[@role='presentation']").nth(1).click();
			page.locator("xpath =//input[@role='searchbox']").fill("07");
			page.locator("xpath=//li[@role='option' and text()='07']").click();
			page.locator("xpath=//span[@role='presentation']").nth(2).click();
			page.locator("xpath=//input[@role='searchbox']").fill("15");
			page.locator("xpath=//li[@role='option' and text()='15']").click();
			page.locator("#vfb-19").fill("9080909090");
			page.locator("#vfb-23").fill("Test Query");
			page.locator("#vfb-3").fill("33");
			page.getByText("Submit").click();
			PlaywrightAssertions.assertThat(page.locator("xpath=//h2[text()='Transaction Details']")).containsText("Transaction Details");
			
			
			
		}
		finally {
			page.close();
			//browser.close();
		}
		
		
		
		
		
	}

}
