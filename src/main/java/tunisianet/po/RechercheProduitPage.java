package tunisianet.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.junit.jupiter.api.Test;

public class RechercheProduitPage extends PageObject {
	

	public RechercheProduitPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "search_query_top")
	private WebElement InputtRecherche;
	
	@FindBy(xpath = "//*[@id=\"sp-btn-search\"]/button")
	private WebElement iconRechercheBtn;
	

	@FindBy(xpath = "//*[@id=\"main\"]/h1")
	private WebElement motRechrche;
	
	
	public WebElement getInputtRecherche() {
		return InputtRecherche;
	}

	public void setInputtRecherche(WebElement inputtRecherche) {
		InputtRecherche = inputtRecherche;
	}

	public WebElement getIconRechercheBtn() {
		return iconRechercheBtn;
	}

	public void setIconRechercheBtn(WebElement iconRechercheBtn) {
		this.iconRechercheBtn = iconRechercheBtn;
	}

	public WebElement getMotRechrche() {
		return motRechrche;
	}

	public void setMotRechrche(WebElement motRechrche) {
		this.motRechrche = motRechrche;
	}
	
	
	
	
	
}


	