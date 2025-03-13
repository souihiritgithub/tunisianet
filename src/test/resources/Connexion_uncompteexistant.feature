@Connexionàuncompteexistant
Feature: Connexionàuncompteexistant

	

	@TUN-TC-7 @JREQ-TUN-1 @JREQ-TUN-6 @AIO-FOLDER-Authentification_et_Gestion_de_Compte/Connexion_à_un_compte_existant
	Scenario: Se connecter avec des identifiants valides
		Given I m on the Tunisianet Homepage
		When I click on the login icon 
		And I click on Connexion
		Then The page Connectez-vous à votre compte is displayed
	   When I fill in the field "email"
	  
        | email                       | 
        | souihi.islem2019@gmail.com  |
        
     And I fill in the field "password"
        | password                       | 
        | 28838461@                      |

		
		And I click on the Connexion button
		
		Then I am successfully logged into my account and the page Votre compte is displayed
		
		
		
		# @TUN-TC-5 @JREQ-TUN-1 @JREQ-TUN-6 @AIO-FOLDER-Authentification_et_Gestion_de_Compte/Connexion_à_un_compte_existant
# Scenario: Se connecter avec un mot de passe incorrect
#     Given The user opens a web browser
#     When I navigate to the Tunisianet website
#     Then The Home page of the Tunisianet website is displayed
#     When I click on the login icon and then click on Connexion
#     Then The page Connectez-vous à votre compte is displayed
#     When I fill in the fields Email and Mot de passe
#         """
#         
#         E-mail = souihi.islem2019@gmail.com
#         
#         Mot de passe = 122222
#         """
#     And I click on the Connexion button
#     Then The error message Echec d'authentification is displayed

# @TUN-TC-6 @JREQ-TUN-1 @JREQ-TUN-6 @AIO-FOLDER-Authentification_et_Gestion_de_Compte/Connexion_à_un_compte_existant
# Scenario: Se connecter avec un email non enregistré
#     Given The user opens a web browser
#     When I navigate to the Tunisianet website
#     Then The Home page of the Tunisianet website is displayed
#     When I click on the login icon and then click on Connexion
#     Then The Connectez vous à votre compte page is displayed
#     When I fill in the fields Email and Mot de passe
#         """
#         
#         E-mail = souihi.islem@gmail.com
#         
#         Mot de passe = 123456
#         """
#     And I click on the Connexion button
#     Then The error message Echec d'authentification is displayed
		