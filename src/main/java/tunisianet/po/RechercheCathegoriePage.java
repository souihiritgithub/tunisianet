package tunisianet.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.junit.jupiter.api.Test;

public class RechercheCathegoriePage extends PageObject {

	public RechercheCathegoriePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath = "//*[@id=\"_desktop_top_menu\"]/div/div/ul/li[7]/div[1]/span")
	private WebElement sécuritéBtn;
	
	
	@FindBy(linkText = "Système d'alarme")
	private WebElement  Systèmedalarme;
	
	
	@FindBy(linkText = "Matériel de sécurité")
	private WebElement Matérieldesécurité;
	
	
	@FindBy(linkText = "Onduleur")
	private WebElement Onduleur;


	public WebElement getSécuritéBtn() {
		return sécuritéBtn;
	}


	public void setSécuritéBtn(WebElement sécuritéBtn) {
		this.sécuritéBtn = sécuritéBtn;
	}


	public WebElement getSystèmedalarme() {
		return Systèmedalarme;
	}


	public void setSystèmedalarme(WebElement systèmedalarme) {
		Systèmedalarme = systèmedalarme;
	}


	public WebElement getMatérieldesécurité() {
		return Matérieldesécurité;
	}


	public void setMatérieldesécurité(WebElement matérieldesécurité) {
		Matérieldesécurité = matérieldesécurité;
	}


	public WebElement getOnduleur() {
		return Onduleur;
	}


	public void setOnduleur(WebElement onduleur) {
		Onduleur = onduleur;
	}
	
	
	
}
