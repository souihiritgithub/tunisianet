@Filtragedesrésultats
Feature: Filtragedesrésultats

	
	@TUN-TC-21 @JREQ-TUN-2 @JREQ-TUN-9 @AIO-FOLDER-Recherche_et_Filtrage_de_Produits/Filtrage_des_résultats
	Scenario: Filtrer par Fabricants
		Given The user is on the homepage Tunisianet 
		When I click on informatique
		And I click on the Ordinateur Portable section
		Then The search results are correctly displayed
		When I select the Fabricant under Fabricants
			"""
			Fabricant = Apple
			"""
		Then The display shows the searched products correctly filtered by Fabricant
	
	
	
	
	# @TUN-TC-12 @JREQ-TUN-2 @JREQ-TUN-9 @AIO-FOLDER-Recherche_et_Filtrage_de_Produits/Filtrage_des_résultats
# Scenario: Filtrer par prix
#     Given The user is on the Tunisianet homepage
#     When I click on informatique
#     And I click on the Ordinateur Portable section
#     Then The search results are correctly displayed
#     When I enter the max price in the Prix field under Filtrer
#         """
#         MaxPrice = 1000
#         """
#     And I click enter
#     Then The display shows number of products, with the searched products correctly filtered by max price
#     When I enter the min price in the Prix field under Filtre
#         """
#         MinPrice = 800
#         """
#     And I click enter
#     When The display shows  the new number of products, with the searched products correctly filtered by max and min price

# @TUN-TC-21 @JREQ-TUN-2 @JREQ-TUN-9 @AIO-FOLDER-Recherche_et_Filtrage_de_Produits/Filtrage_des_résultats
# Scenario: Filtrer par Fabricants
#     Given The user is on the Tunisianet homepage
#     When I click on informatique
#     And I click on the Ordinateur Portable section
#     Then The search results are correctly displayed
#     When I select the Fabricant under Fabricants
#         """
#         Fabricant = Apple
#         """
#     Then The display shows the searched products correctly filtered by Fabricant

# @TUN-TC-22 @JREQ-TUN-2 @JREQ-TUN-9 @AIO-FOLDER-Recherche_et_Filtrage_de_Produits/Filtrage_des_résultats
# Scenario: Filtrer par combinaison de plusieurs filtres et Réinitialiser les filtres
#     Given The user is on the Tunisianet homepage
#     When I click on informatique
#     And I click on the Ordinateur Portable section
#     Then The search results are correctly displayed
#     When I enter the max price in the Prix field under Filtrer
#         """
#         MaxPrice = 1000
#         """
#     And I click enter
#     Then The display shows number of products, with the searched products correctly filtered by max price
#     When When I enter the min price in the Prix field under Filtrer
#         """
#         MinPrice = 800
#         """
#     And I click enter
#     Then The display shows  the new number of products, with the searched products correctly filtered by max and min price
#     When I select the Fabricant under Fabricants
#         """
#         Fabricant = Lenovo
#         """
#     Then The display shows the searched products correctly filtered by prix and Fabricants
#     When I click on Effacer les filtres under Filtrer
#     Then All applied filters are cleared
