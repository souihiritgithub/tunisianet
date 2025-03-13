package tunisianet.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FiltragePage extends PageObject {

	public FiltragePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@FindBy(xpath = "//div[@id='_desktop_top_menu']/div/div/ul/li/div/span")
	private WebElement butnInformatique;
	
	
	@FindBy(linkText = "Téléphone Portable")
	private WebElement  TéléphonePortable;


	public WebElement getButnInformatique() {
		return butnInformatique;
	}



	public void setButnInformatique(WebElement butnInformatique) {
		this.butnInformatique = butnInformatique;
	}



	public WebElement getTéléphonePortable() {
		return TéléphonePortable;
	}



	public void setTéléphonePortable(WebElement téléphonePortable) {
		TéléphonePortable = téléphonePortable;
	}
	
	
	
	
	
	
	

}
