package serenity.StepsDefinitions;

import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Et;
import io.cucumber.java.fr.Quand;
import io.cucumber.java.fr.Soit;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import java.time.temporal.ChronoUnit;

public class MyStepdefs_amazon extends PageObject {

    @FindBy(xpath = "//input[@id=\"sp-cc-accept\"]")
    WebElementFacade button_Accept_cookies;

    @FindBy(xpath = "//input[@id=\"twotabsearchtextbox\"]")
    WebElementFacade  ecran_accueil;


    @FindBy(xpath = "//span[@id=\"nav-link-accountList-nav-line-1\"]")
    WebElementFacade buttonConnexion;

    @FindBy(xpath = "//*[@id=\"ap_email\"]")
    WebElementFacade input_mail;

    @FindBy(xpath = "//span[@id=\"continue\"]")
    WebElementFacade buttonContinue;

    @FindBy(xpath = "//input[@id=\"ap_password\"]")
    WebElementFacade input_password;

    @FindBy(xpath = "//input[@id=\"signInSubmit\"]")
    WebElementFacade buttonIdentify;

    @FindBy(xpath = "//span[@id=\"nav-link-accountList-nav-line-1\"]")
    WebElementFacade clientConnecte;

    @FindBy(xpath = "//input[@id=\"twotabsearchtextbox\"]")
    WebElementFacade search_barre;

    @FindBy(xpath ="//span[@class=\"a-color-state a-text-bold\"]" )
    WebElementFacade result_barre;

    @Soit("un utilisateur sur la page des cookies du site {string}")
    public void unUtilisateurSurLaPageDesCookiesDuSite(String url) {
        openAt(url);
    }

    @Quand("il clique sur le bouton Accepter")
    public void ilCliqueSurLeBoutonAccepter() {
        button_Accept_cookies.waitUntilClickable().click();
    }

    @Alors("il revient sur la page d accueil")
    public void ilRevientSurLaPageDAccueil() {
        ecran_accueil.waitUntilClickable().click();;
    }

    @Quand("il clique sur le bouton Se connecter")
    public void ilCliqueSurLeBoutonSeConnecter() {
        buttonConnexion.waitUntilClickable().click();
    }

    @Et("il saisit son mail {string}")
    public void ilSaisitSonMail(String mail) {
        input_mail.sendKeys(mail);
    }

    @Et("il clique sur le bouton Continuer")
    public void ilCliqueSurLeBoutonContinuer() {
        buttonContinue.waitUntilClickable().click();
    }
    @Et("il saisit son password {string}")
    public void ilSaisitSonpassword(String password) {
        input_password.sendKeys(password);
    }

    @Et("il clique sur le bouton s identifier")
    public void ilCliqueSurLeBoutonSIdentifier() {
        buttonIdentify.waitUntilClickable().click();
    }

    @Alors("l ecran d accueil s affiche et affiche le nom du client {string}")
    public void lEcranDAccueilSAfficheEtAfficheLeNomDuClient(String name) {
        clientConnecte.waitUntilPresent();
        clientConnecte.shouldContainText(name);

    }

    @Soit("un client sur la page d'accueil")
    public void unClientSurLaPageDAccueil() {
    }

    @Quand("il tape le mot {string} dans la barre de recherche")
    public void ilTapeLeMotDansLaBarreDeRecherche(String category) {
        search_barre.sendKeys(category);

    }
    @Alors("la page de la liste des {string} s affiche")
    public void laPageDeLaListeDesSAffiche(String category) {
        result_barre.shouldContainText(category);
    }
}

