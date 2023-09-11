package serenity.StepsDefinitionsAmazon;

import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Et;
import io.cucumber.java.fr.Quand;
import io.cucumber.java.fr.Soit;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class MyStepdefs_amazon extends PageObject {

    @FindBy(id="sp-cc-accept")
    WebElementFacade accept_cookies;

    @FindBy(id="nav-link-accountList")
    WebElementFacade go_to_connexion;

    @FindBy(id="ap_email")
    WebElementFacade input_mail;

    @FindBy(id="ap_password")
    WebElementFacade input_password;

    @FindBy(id="continue")
    WebElementFacade continue_connexion;

    @FindBy(id="signInSubmit")
    WebElementFacade SignIn_button;

    @FindBy(id="nav-link-accountList-nav-line-1")
    WebElementFacade 


    @Soit("un utilisateur sur le site {string}")
    public void unUtilisateurSurLeSite(String adress_site) {
        openAt(adress_site);
    }

    @Quand("il clique sur le bouton accepter les cookies")
    public void ilCliqueSurLeBoutonAccepterLesCookies() {


    }

    @Et("il saisit le mot {string} dans la barre de recherche")
    public void ilSaisitLeMotDansLaBarreDeRecherche(String arg0) {
    }

    @Alors("la page de résultats s'affiche")
    public void laPageDeRésultatsSAffiche() {
    }

    @Soit("un utilisateur sur le site \\{string} ayant accepté les cookies")
    public void unUtilisateurSurLeSiteStringAyantAcceptéLesCookies() {
    }

    @Quand("il saisit son adresse mail <mail>")
    public void ilSaisitSonAdresseMailMail() {
    }

    @Et("il clique sur continuer")
    public void ilCliqueSurContinuer() {
    }

    @Et("il saisit son mot de passe <password>")
    public void ilSaisitSonMotDePassePassword() {
    }

    @Et("il clique sur le bouton se connecter")
    public void ilCliqueSurLeBoutonSeConnecter() {
    }

    @Alors("la page d{string}affiche")
    public void laPageDAccueilDuCompteSAffiche() {
    }
}
