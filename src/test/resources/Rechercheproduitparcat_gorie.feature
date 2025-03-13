@Rechercheproduitparcatégorie
Feature: Rechercheproduitparcatégorie

	
		
		
	 Scenario Outline: Rechercher produit par catégorie - Sécurité
    Given The user is on Tunisianet homepage
    When I click on Sécurité
    And I click on the "<subcategory>"
    Examples:
      | subcategory                     |
      | Système d'alarme                |
      | Matériel de sécurité            |
      | Onduleur                        |
    
	
	
# @Rechercheproduitparcatégorie
# Feature: Rechercheproduitparcatégorie
#
# 	@TUN-TC-8 @JREQ-TUN-2 @JREQ-TUN-13 @AIO-FOLDER-Recherche_et_Filtrage_de_Produits/Recherche_produit_par_catégorie
# 	Scenario: Rechercher produit par catégorie - Informatique
# 		Given The user is on the Tunisianet homepage
# 		When I click on informatique
# 		Then The related subcategories are displayed
# 		When I click on the subcategory
# 			"""
# 			subcategory = Ordinateur Portable
# 			"""
# 		Then The related products of subcategory are displayed
# 		When I click on informatique
# 		And I click on the subcategory
# 			"""
# 			subcategory = Accessoires et Périphériques
# 			"""
# 		Then The related products of subcategory are displayed
# 		When I click on informatique
# 		And I click on the subcategory
# 			"""
# 			subcategory = Ordinateur de Bureau
# 			"""
# 		Then The related products of subcategory are displayed
# 		When I click on informatique
# 		And I click on the subcategory
# 			"""
# 			subcategory = Logiciels
# 			"""
# 		Then The related products of subcategory are displayed
# 		When I click on informatique
# 		And I click on the subcategory
# 			"""
# 			subcategory = Serveur informatique
# 			"""
# 		Then The related products of subcategory are displayed
# 		When I click on informatique
# 		And I click on the subcategory
# 			"""
# 			subcategory = Onduleur
# 			"""
# 		Then The related products of subcategory are displayed
# 		When I click on informatique
# 		And I click on the subcategory
# 			"""
# 			subcategory = Meubles Pc
# 			"""
# 		Then The related products of subcategory are displayed
# 		When I click on informatique
# 		And I click on the subcategory
# 			"""
# 			subcategory = Composant Informatique
# 			"""
# 		Then The related products of subcategory are displayed
#
# 	@TUN-TC-13 @JREQ-TUN-2 @JREQ-TUN-13 @AIO-FOLDER-Recherche_et_Filtrage_de_Produits/Recherche_produit_par_catégorie
# 	Scenario: Rechercher produit par catégorie - Téléphonie & Tablette
# 		Given The user is on the Tunisianet homepage
# 		When I click on Téléphonie & Tablette
# 		Then The related subcategories are displayed
# 		When I click on the subcategory
# 			"""
# 			subcategory = Téléphone Portable
# 			"""
# 		Then The related products of subcategory are displayed
# 		When I click on Téléphonie & Tablette
# 		And I click on the subcategory
# 			"""
# 			subcategory = Smartphone
# 			"""
# 		Then The related products of subcategory are displayed
# 		When I click on Téléphonie & Tablette
# 		And I click on the subcategory
# 			"""
# 			subcategory = Téléphone Fixe
# 			"""
# 		Then The related products of subcategory are displayed
# 		When I click on Téléphonie & Tablette
# 		And I click on the subcategory
# 			"""
# 			subcategory = Tablette tactile
# 			"""
# 		Then The related products of subcategory are displayed
# 		When I click on Téléphonie & Tablette
# 		And I click on the subcategory
# 			"""
# 			subcategory = Accessoires Téléphones
# 			"""
# 		Then The related products of subcategory are displayed
# 		When I click on Téléphonie & Tablette
# 		And I click on the subcategory
# 			"""
# 			subcategory = SmartWatch
# 			"""
# 		Then The related products of subcategory are displayed
#
# 	@TUN-TC-14 @JREQ-TUN-2 @JREQ-TUN-13 @AIO-FOLDER-Recherche_et_Filtrage_de_Produits/Recherche_produit_par_catégorie
# 	Scenario: Rechercher produit par catégorie - Stockage
# 		Given The user is on the Tunisianet homepage
# 		When I click on Stockage
# 		Then The related subcategories are displayed
# 		When I click on the subcategory
# 			"""
# 			subcategory = Disques Internes
# 			"""
# 		Then The related products of subcategory are displayed
# 		When I click on Stockage
# 		And I click on the subcategory
# 			"""
# 			subcategory = Disque Dur externe
# 			"""
# 		Then The related products of subcategory are displayed
# 		When I click on Stockage
# 		And I click on the subcategory
# 			"""
# 			subcategory = Serveur de stockage
# 			"""
# 		Then The related products of subcategory are displayed
# 		When I click on Stockage
# 		And I click on the subcategory
# 			"""
# 			subcategory = Accessoires pour Stockage
# 			"""
# 		Then The related products of subcategory are displayed
# 		When I click on Stockage
# 		And I click on the subcategory
# 			"""
# 			subcategory = AClé USB
# 			"""
# 		Then The related products of subcategory are displayed
# 		When I click on Stockage
# 		And I click on the subcategory
# 			"""
# 			subcategory = SCarte mémoire
# 			"""
# 		Then The related products of subcategory are displayed
# 		When I click on Stockage
# 		And I click on the subcategory
# 			"""
# 			subcategory = CD et DVD Vierge
# 			"""
# 		Then The related products of subcategory are displayed
#
# 	@TUN-TC-15 @JREQ-TUN-2 @JREQ-TUN-13 @JREQ-TUN-14 @AIO-FOLDER-Recherche_et_Filtrage_de_Produits/Recherche_produit_par_catégorie
# 	Scenario: Rechercher produit par catégorie - Impression
# 		Given The user is on the Tunisianet homepage
# 		When I click on Impression
# 		Then The related subcategories are displayed
# 		When I click on the subcategory
# 			"""
# 			subcategory = Imprimantes
# 			"""
# 		Then The related products of subcategory are displayed
# 		When I click on Impression
# 		And I click on the subcategory
# 			"""
# 			subcategory = Scanners
# 			"""
# 		Then The related products of subcategory are displayed
# 		When I click on Impression
# 		And I click on the subcategory
# 			"""
# 			subcategory = Photocopieurs
# 			"""
# 		Then The related products of subcategory are displayed
# 		When I click on Impression
# 		And I click on the subcategory
# 			"""
# 			subcategory = Papier
# 			"""
# 		Then The related products of subcategory are displayed
# 		When I click on Impression
# 		And I click on the subcategory
# 			"""
# 			subcategory = Consommables
# 			"""
# 		Then The related products of subcategory are displayed
#
# 	@TUN-TC-16 @JREQ-TUN-2 @JREQ-TUN-13 @AIO-FOLDER-Recherche_et_Filtrage_de_Produits/Recherche_produit_par_catégorie
# 	Scenario: Rechercher produit par catégorie - TV-Son-Photos
# 		Given The user is on the Tunisianet homepage
# 		When I click on TV-Son-Photos
# 		Then The related subcategories are displayed
# 		When I click on the subcategory
# 			"""
# 			subcategory = Montres
# 			"""
# 		Then The related products of subcategory are displayed
# 		When I click on TV-Son-Photos
# 		And I click on the subcategory
# 			"""
# 			subcategory = Vidéoprojecteurs
# 			"""
# 		Then The related products of subcategory are displayed
# 		When I click on TV-Son-Photos
# 		And I click on the subcategory
# 			"""
# 			subcategory = Consoles & Jeux
# 			"""
# 		Then The related products of subcategory are displayed
# 		When I click on TV-Son-Photos
# 		And I click on the subcategory
