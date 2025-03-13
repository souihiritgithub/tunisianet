package tunisianet.BDD;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tunisianet.po.AjoutSuppressionProduitPage;
import tunisianet.po.FiltragePage;

public class StepDefinitionFiltrage {

	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	JavascriptExecutor js;
	FiltragePage filtragePage;
	
	@Given("The user is on the homepage Tunisianet")
	public void i_am_on_the_tunisianet_homepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.tunisianet.com.tn/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		js = (JavascriptExecutor) driver;
		filtragePage = new FiltragePage(driver);
	}
	
	@When("I click on informatique")
	public void i_click_on_informatique() {
		filtragePage.getButnInformatique().click();
	}

	@When("I click on the Ordinateur Portable section")
	public void i_click_on_the_ordinateur_portable_section() {
		filtragePage.getTéléphonePortable().click();
	}

	@Then("The search results are correctly displayed")
	public void the_search_results_are_correctly_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I select the Fabricant under Fabricants")
	public void i_select_the_fabricant_under_fabricants(String docString) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The display shows the searched products correctly filtered by Fabricant")
	public void the_display_shows_the_searched_products_correctly_filtered_by_fabricant() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
}
