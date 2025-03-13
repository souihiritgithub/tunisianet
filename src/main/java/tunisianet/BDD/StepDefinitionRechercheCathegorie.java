package tunisianet.BDD;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tunisianet.po.RechercheCathegoriePage;
import tunisianet.po.RechercheProduitPage;

public class StepDefinitionRechercheCathegorie {
	
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	JavascriptExecutor js;
	RechercheCathegoriePage recherchecathegoriepage;
	
	@Given("The user is on Tunisianet homepage")
	public void i_am_on_the_tunisianet_homepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.tunisianet.com.tn/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		js = (JavascriptExecutor) driver;
		recherchecathegoriepage = new RechercheCathegoriePage(driver);
	}

	
	@When("I click on Sécurité")
	public void i_click_on_sécurité() {
		recherchecathegoriepage.getSécuritéBtn().click();
	}

	@Then("The related subcategories are displayed")
	public void the_related_subcategories_are_displayed() {
		recherchecathegoriepage.getSystèmedalarme().click();
	}

	
	@When("I click on the {string}")
	public void i_click_on_the(String subcategory) {
	    switch (subcategory) {
	        case "Système d'alarme":
	        	recherchecathegoriepage.getSystèmedalarme().click();
	            break;
	        case "Matériel de sécurité":
	        	recherchecathegoriepage.getMatérieldesécurité().click();
	            break;
	        case "Onduleur":
	        	recherchecathegoriepage.getOnduleur().click();
	            break;
	        default:
	            throw new IllegalArgumentException("Sous-catégorie non reconnue: " + subcategory);
	    }
	}



}
