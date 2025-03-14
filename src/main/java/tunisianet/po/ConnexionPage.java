package tunisianet.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.junit.jupiter.api.Test;

public class ConnexionPage extends PageObject {

	public ConnexionPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Comparer'])[1]/following::*[name()='svg'][1]")
	private WebElement iconCnx;

	@FindBy(xpath = "//div[@id='_desktop_user_info']/ul/li/a/span")
	private WebElement buttonCnx;
	
	@FindBy(xpath = "//*[@id=\"main\"]/header/div/h2/span")
	private WebElement textConnectezVous;
	

	@FindBy(name = "email")
	private WebElement inputEmail;
	
	@FindBy(name = "password")
	private WebElement inputPassword;
	
	
	@FindBy(id = "submit-login")
	private WebElement submitLoginBtn;
	
	@FindBy(xpath = "//*[@id=\"main\"]/header/div/h2/span")
	private WebElement votreCompte;

	public WebElement getIconCnx() {
		return iconCnx;
	}

	public void setIconCnx(WebElement iconCnx) {
		this.iconCnx = iconCnx;
	}

	public WebElement getButtonCnx() {
		return buttonCnx;
	}

	public void setButtonCnx(WebElement buttonCnx) {
		this.buttonCnx = buttonCnx;
	}

	
	
	
	
	public WebElement getTextConnectezVous() {
		return textConnectezVous;
	}

	public void setTextConnectezVous(WebElement textConnectezVous) {
		this.textConnectezVous = textConnectezVous;
	}

	public WebElement getInputEmail() {
		return inputEmail;
	}

	public void setInputEmail(WebElement inputEmail) {
		this.inputEmail = inputEmail;
	}

	public WebElement getInputPassword() {
		return inputPassword;
	}

	public void setInputPassword(WebElement inputPassword) {
		this.inputPassword = inputPassword;
	}

	public WebElement getSubmitLoginBtn() {
		return submitLoginBtn;
	}

	public void setSubmitLoginBtn(WebElement submitLoginBtn) {
		this.submitLoginBtn = submitLoginBtn;
	}

	public WebElement getVotreCompte() {
		return votreCompte;
	}

	public void setVotreCompte(WebElement votreCompte) {
		this.votreCompte = votreCompte;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
