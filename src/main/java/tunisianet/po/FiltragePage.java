package tunisianet.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.junit.jupiter.api.Test;

public class FiltragePage extends PageObject {

	public FiltragePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@FindBy(xpath = "//*[@id=\"_desktop_top_menu\"]/div/div/ul/li[2]/div[1]/span")
	private WebElement TéléphonieTablette;
	
	@FindBy(linkText = "Téléphone Portable")
	private WebElement  TéléphonePortable;
	
	@FindBy(xpath = "//*[@id=\"m-159\"]")
	private WebElement nokiaFabricant;
	
	@FindBy(xpath = "//*[@id=\"amazzing_filter\"]/div/div[1]/div[2]")
	private WebElement nokiaFitredText;
	
	





	public WebElement getTéléphonieTablette() {
		return TéléphonieTablette;
	}



	public void setTéléphonieTablette(WebElement téléphonieTablette) {
		TéléphonieTablette = téléphonieTablette;
	}



	public WebElement getTéléphonePortable() {
		return TéléphonePortable;
	}



	public void setTéléphonePortable(WebElement téléphonePortable) {
		TéléphonePortable = téléphonePortable;
	}



	public WebElement getNokiaFabricant() {
		return nokiaFabricant;
	}



	public void setNokiaFabricant(WebElement nokiaFabricant) {
		this.nokiaFabricant = nokiaFabricant;
	}



	public WebElement getNokiaFitredText() {
		return nokiaFitredText;
	}



	public void setNokiaFitredText(WebElement nokiaFitredText) {
		this.nokiaFitredText = nokiaFitredText;
	}
	
	
	
	
	
	
	

}
