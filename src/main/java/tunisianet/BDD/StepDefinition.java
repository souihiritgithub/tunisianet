package tunisianet.BDD;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tunisianet.po.AjoutSuppressionProduitPage;
import static org.junit.Assert.assertEquals;

public class StepDefinition {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	JavascriptExecutor js;
	AjoutSuppressionProduitPage ajoutproduitaupanierPage;
	
	@Given("I'am on the Tunisianet homepage")
	public void i_am_on_the_tunisianet_homepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.tunisianet.com.tn/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		js = (JavascriptExecutor) driver;
		ajoutproduitaupanierPage = new AjoutSuppressionProduitPage(driver);
	}

	@When("I click on Téléphonie & Tablette")
	public void i_click_on_téléphonie_tablette() {
		ajoutproduitaupanierPage.getTéléphonieTablette().click();
	}


	@And("I click on the subcategory")
	public void i_click_on_the_subcategory(String docString) {
		ajoutproduitaupanierPage.getTéléphonePortable().click();
	}
	
	
	@Then("I verify product on stock")
	public void i_verify_product_on_stock() {
		assertEquals("En stock", ajoutproduitaupanierPage.getEnStock().getText());
	}
	


	@When("I click on the available product in stock")
	public void i_click_on_the_available_product_in_stock() {
	    // Write code here that turns the phrase above into concrete actions
		ajoutproduitaupanierPage.getProductPhone().click();
	}

	@When("I click on Ajouter Au Panier")
	public void i_click_on_ajouter_au_panier() {
		ajoutproduitaupanierPage.getPanierButton().click();
	}

	@Then("The message Produit ajouté au panier avec succès is displayed")
	public void the_message_produit_ajouté_au_panier_avec_succès_is_displayed() {
		ajoutproduitaupanierPage.getTextSuccesPanier().click();
		assertEquals("Produit ajouté au panier avec succès", ajoutproduitaupanierPage.getTextSuccesPanier().getText());
		
	}

	@When("Click on Continuer")
	public void click_on_continuer() {
		ajoutproduitaupanierPage.getContinuerButton().click();
	}
	
	

	@Then("The page displays with the product added to the Panier")
	public void the_page_displays_with_the_product_added_to_the_panier() {
		WebElement quantityInput = ajoutproduitaupanierPage.getQuantitywanted();

	    // Obtenir la valeur de l'attribut "value"
	    String quantityValue = quantityInput.getAttribute("value");

	    // Vérifier que la quantité est bien égale à "1"
	    assertEquals("1", quantityValue);
	}

	//Supression
	
	

	
	@When("I click on the Panier icon")
	public void i_click_on_the_panier_icon() {
		driver.get("https://www.tunisianet.com.tn/");
		ajoutproduitaupanierPage.getPanierIcon().click();
	}


	@When("I click on the remove icon")
	public void i_click_on_the_remove_icon() {
		ajoutproduitaupanierPage.getSupprimerIcon().click();
	}


	

	
	
}
