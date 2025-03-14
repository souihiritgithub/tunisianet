package tunisianet.po;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


	public class AjoutSuppressionProduitPage extends PageObject {
		

		public AjoutSuppressionProduitPage(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}
	
		@FindBy(xpath = "//*[@id=\"_desktop_top_menu\"]/div/div/ul/li[2]/div[1]/span")
		private WebElement TéléphonieTablette;
		
		@FindBy(linkText = "Téléphone Portable")
		private WebElement  TéléphonePortable;
		
		@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Prix'])[3]/following::span[1]")
		private WebElement EnStock;
		
		@FindBy(xpath = "//img[@alt='Téléphone Portable IPRO A3...']")
		private WebElement ProductPhone;
		
	
		@FindBy(xpath = "//form[@id='add-to-cart-or-refresh']/div[2]/div/div[2]/button")
		private WebElement PanierButton;
		
		@FindBy(id = "myModalLabel")
		private WebElement TextSuccesPanier;
		

		@FindBy(xpath = "//*[@id=\"blockcart-modal\"]/div/div/div/div[2]/div/div/button")
		private WebElement ContinuerButton;
		
		@FindBy(xpath = "//*[@id=\"quantity_wanted\"]")
		private WebElement quantitywanted;
		
		@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Connexion'])[1]/following::*[name()='svg'][1]")
		private WebElement panierIcon;
		
		@FindBy(xpath = "//section[@id='main']/div/div/div/div[2]/ul/li[2]/div/div[6]/div/div/a/i")
		private WebElement supprimerIcon;
		
		
		
		
		
		
		
		
		
		
		

		public WebElement getPanierIcon() {
			return panierIcon;
		}

		public void setPanierIcon(WebElement panierIcon) {
			this.panierIcon = panierIcon;
		}

		public WebElement getSupprimerIcon() {
			return supprimerIcon;
		}

		public void setSupprimerIcon(WebElement supprimerIcon) {
			this.supprimerIcon = supprimerIcon;
		}

		public WebElement getQuantitywanted() {
			return quantitywanted;
		}

		public void setQuantitywanted(WebElement quantitywanted) {
			this.quantitywanted = quantitywanted;
		}

		public WebElement getContinuerButton() {
			return ContinuerButton;
		}

		public void setContinuerButton(WebElement continuerButton) {
			ContinuerButton = continuerButton;
		}

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

		public WebElement getEnStock() {
			return EnStock;
		}

		public void setEnStock(WebElement enStock) {
			EnStock = enStock;
		}

		public WebElement getProductPhone() {
			return ProductPhone;
		}

		public void setProductPhone(WebElement productPhone) {
			ProductPhone = productPhone;
		}

		public WebElement getPanierButton() {
			return PanierButton;
		}

		public void setPanierButton(WebElement panierButton) {
			PanierButton = panierButton;
		}

		public WebElement getTextSuccesPanier() {
			return TextSuccesPanier;
		}

		public void setTextSuccesPanier(WebElement textSuccesPanier) {
			TextSuccesPanier = textSuccesPanier;
		}
		
	
	
		
		
		
		
		
		
}
