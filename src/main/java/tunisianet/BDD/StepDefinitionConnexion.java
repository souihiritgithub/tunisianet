package tunisianet.bdd;

import static org.junit.Assert.assertEquals;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tunisianet.po.AjoutSuppressionProduitPage;
import tunisianet.po.ConnexionPage;
import org.junit.jupiter.api.Test;

public class StepDefinitionConnexion {

	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	JavascriptExecutor js;
	ConnexionPage connexionPage;
	

@Given("I m on the Tunisianet Homepage")
public void i_m_on_the_tunisianet_homepage() {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("start-maximized");
	options.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(options);
	driver.get("https://www.tunisianet.com.tn/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	js = (JavascriptExecutor) driver;
	connexionPage = new ConnexionPage(driver);
}

@When("I click on the login icon")
public void i_click_on_the_login_icon() {
	connexionPage.getIconCnx().click();
}

@When("I click on Connexion")
public void i_click_on_connexion() {
	connexionPage.getButtonCnx().click();
}

@Then("The page Connectez-vous à votre compte is displayed")
public void the_page_connectez_vous_à_votre_compte_is_displayed() {
	assertEquals("CONNECTEZ-VOUS À VOTRE COMPTE", connexionPage.getTextConnectezVous().getText());
	
}

@When("I fill in the field {string}")
public void i_fill_in_the_field(String field, DataTable data) {
    // Convertir DataTable en liste de listes
    List<List<String>> rows = data.asLists(String.class);

    // Récupérer la première ligne après les titres (les valeurs)
    String value = rows.get(1).get(0);  // Prendre la valeur de la deuxième ligne (index 1), première colonne (index 0)
   
    // remplir les champs
   
    if ("email".equalsIgnoreCase(field)) {
        connexionPage.getInputEmail().click();
        connexionPage.getInputEmail().sendKeys(value);  // Remplir le champ email avec la valeur
    } else if ("password".equalsIgnoreCase(field)) {
        connexionPage.getInputPassword().click();
        connexionPage.getInputPassword().sendKeys(value);  // Remplir le champ mot de passe avec la valeur
    }
}


@When("I click on the Connexion button")
public void i_click_on_the_connexion_button() {
	connexionPage.getSubmitLoginBtn().click();
}

@Then("I am successfully logged into my account and the page Votre compte is displayed")
public void i_am_successfully_logged_into_my_account_and_the_page_votre_compte_is_displayed() {
	assertEquals("VOTRE COMPTE", connexionPage.getVotreCompte().getText());
}


}
