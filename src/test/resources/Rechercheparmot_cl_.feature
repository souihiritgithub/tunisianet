@Rechercheparmot-clé
Feature: Rechercheparmot-clé

	@TUN-TC-9 @JREQ-TUN-2 @JREQ-TUN-8 @AIO-FOLDER-Recherche_et_Filtrage_de_Produits/Recherche_par_mot-clé
	Scenario: Rechercher produit avec un mot clé existant
		Given The user is on the Tunisianet homepage
		When I enter the search word in the search bar
			"""
			airpods
			"""
		And I click on the search icon
		Then The search results are correctly displayed Les résultats de la recherche pour "airpods" sont correctement affichés 
		

# @TUN-TC-10 @JREQ-TUN-2 @JREQ-TUN-8 @AIO-FOLDER-Recherche_et_Filtrage_de_Produits/Recherche_par_mot-clé
# Scenario: Rechercher produit avec des caractères spéciaux
#     Given The user is on the Tunisianet homepage  # L'utilisateur est sur la page d'accueil de Tunisianet
#     When I enter the search word in the search bar  # L'utilisateur entre le mot-clé de recherche dans la barre de recherche
#         """
#         SearchWord = airpods@_  # Le mot-clé recherché qui contient des caractères spéciaux (airpods@_)
#         """
#     And I click on the search icon  # L'utilisateur clique sur l'icône de recherche
#     Then The search results for are displayed  # Les résultats de la recherche pour "airpods@_" sont affichés

# @TUN-TC-11 @JREQ-TUN-2 @JREQ-TUN-8 @AIO-FOLDER-Recherche_et_Filtrage_de_Produits/Recherche_par_mot-clé
# Scenario: Rechercher produit par mot-clé invalide
#     Given The user is on the Tunisianet homepage  # L'utilisateur est sur la page d'accueil de Tunisianet
#     When I enter the search word in the search bar  # L'utilisateur entre le mot-clé de recherche dans la barre de recherche
#         """
#         SearchWord = smile  # Le mot-clé valide recherché (airpods)
#         """
#     And I click on the search icon  # L'utilisateur clique sur l'icône de recherche
#     Then The message Veuillez nous excuser pour le désagrément Effectuez une nouvelle recherche is displayed
