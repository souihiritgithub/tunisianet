package tunisianet.bdd;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tunisianet.po.AjoutSuppressionProduitPage;
import tunisianet.po.RechercheProduitPage;

public class StepDefinitionRecherche {

	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	JavascriptExecutor js;
	RechercheProduitPage rechercheproduitpage;
	
	@Given("The user is on the Tunisianet homepage")
	public void i_am_on_the_tunisianet_homepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.tunisianet.com.tn/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		js = (JavascriptExecutor) driver;
		rechercheproduitpage = new RechercheProduitPage(driver);
	
}
	@When("I enter the search word in the search bar")
	public void i_enter_the_search_word_in_the_search_bar(String searchWord) {
		 WebElement searchBar = rechercheproduitpage.getInputtRecherche();
		 searchBar.click();
		 searchBar.sendKeys(searchWord);
	}
	
	

	@When("I click on the search icon")
	public void i_click_on_the_search_icon() {
	   rechercheproduitpage.getIconRechercheBtn().click();
	}

	

@Then("The search results are correctly displayed Les résultats de la recherche pour {string} sont correctement affichés")
public void the_search_results_are_correctly_displayed_les_résultats_de_la_recherche_pour_sont_correctement_affichés(String string) {
	assertEquals("Airpods Au Meilleur Prix Tunisie", rechercheproduitpage.getMotRechrche().getText());
}

	
	
}
