@Ajoutproduitaupanier
Feature: Ajoutproduitaupanier

	@TUN-TC-23 @JREQ-TUN-3 @JREQ-TUN-10 @AIO-FOLDER-Gestion_du_Panier_d'Achat/Ajout_produit_au_panier
	Scenario: Ajouter un produit en stock au panier puis le supprimer 
		Given I'am on the Tunisianet homepage
		When I click on Téléphonie & Tablette
		And I click on the subcategory
			"""
			subcategory = Téléphone Portable
			"""
	  Then I verify product on stock
		When I click on the available product in stock
		And I click on Ajouter Au Panier
		Then The message Produit ajouté au panier avec succès is displayed
		When Click on Continuer
		Then The page displays with the product added to the Panier
	
	
		When I click on the Panier icon
		And I click on the remove icon
		
		

	# @TUN-TC-24 @JREQ-TUN-3 @JREQ-TUN-10 @AIO-FOLDER-Gestion_du_Panier_d'Achat/Ajout_produit_au_panier
# Scenario: Ajouter un produit en repture du stock au panier
#     Given I'am on the Tunisianet homepage
#     When I click on Téléphonie & Tablette
#     Then The related subcategories are displayed
#     When I click on the subcategory
#         """
#         subcategory = Téléphone Portable
#         """
#     Then The related products of subcategory are displayed
#     When I click on the not available product in stock
#     And I click on Ajouter Au Panier
#     Then The the cursor cannot click on Ajouter au panier

# @TUN-TC-25 @JREQ-TUN-3 @JREQ-TUN-10 @AIO-FOLDER-Gestion_du_Panier_d'Achat/Ajout_produit_au_panier
# Scenario: Ajouter plusieurs quantités du meme produit
#     Given I'am on the Tunisianet homepage
#     When I click on Téléphonie & Tablette
#     Then The related subcategories are displayed
#     When I click on the subcategory
#         """
#         subcategory = Téléphone Portable
#         """
#     Then The related products of subcategory are displayed
#     When I click on the first available product in stock
#     And I click on Ajouter Au Panier
#     Then The message Produit ajouté au panier avec succès is displayed
#     When Click on Continuer
#     Then The page displays with the product added to the Panier
#     When I click again on Ajouter Au Panier
#     Then The message Produit ajouté au panier avec succès is displayed
#     And The quantity is correctly updated
#     When Click on Continuer
#     Then The page displays with the product added to the Panier
	