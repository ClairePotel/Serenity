package serenity.StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.time.temporal.ChronoUnit;
import java.util.List;

public class Test_Intersport extends PageObject {
//    ----------------------------------------------------------------------------------------------------------------
//    SCENARIO 1

    public void hoverElement(WebElementFacade element) {
        Actions builder = new Actions(getDriver());
        Actions hoverOverLocationSelector = builder.moveToElement(element);
        hoverOverLocationSelector.perform();
    }
    @FindBy(xpath="//input[@id='searchinput']")
    WebElementFacade search_bar;

    @FindBy(xpath="//div[@class=\"auto-complete__suggestion\"]")
    WebElementFacade suggestion_recherche;

    @FindBy(xpath="//ul[@class=\"suggestion-box__list\"]/li/a[@href=\"/sportswear/garcon/chaussures/\"]")
    WebElementFacade chaussures_garcon;

    @FindBy(xpath="//h1[@class=\"dp-title\"][contains(text(),\"Chaussures Garçon\")]")
    WebElementFacade Titre_chaussures_garcon;
    @FindBy(css = "button[id=\"didomi-notice-agree-button\"]")
    WebElementFacade buttonAccepterCookies;


    @FindBy(css = "li a[href=\"/my-account/\"]")
    WebElementFacade buttonConnexion;

    @FindBy(css = "a[class =\"F4a1l\"]")
    WebElementFacade presenceCookies;

    @FindBy(css = "a[data-gtm-cta=\"Sports\"]")
    WebElementFacade itemSports ;

    @FindBy(css = "li.on>a[data-gtm-cta=\"Sports > Tous les sports\"]")
    WebElementFacade menuTouslessports ;

    @FindBy(css = "li.on>a[data-gtm-cta=\"Sports > Vélo\"]")
    WebElementFacade menuTouslessportsVelo ;

    @FindBy(css = "a[data-gtm-cta=\"Sports > Vélo > Vélos > VTT\"]")
    WebElementFacade menuVTT ;

    @FindBy(css = "h1[class= \"dp-title\"]")
    WebElementFacade pageVTT ;

    @FindBy(css = "#productList div.product-grid__card-container")
    List<WebElementFacade> listeProduits ;

    @FindBy(css = "div[class=\"product-card__title\"] [href=\"/marron-vtt_homme_summit_920_ltd-nakamura-p-YC60ML3AGE/\"]")
    WebElementFacade referenceVTTList ;

    @FindBy(xpath = "/html/body/main/div[3]/div/div[1]/div[1]/h1/text()")
    WebElement referenceVTTFiche;

    String contenuList;
    String contenuFiche;

    @Given("un utilisateur sur le site {string}")
    public void unUtilisateurSurLeSite(String adress_site) {
        openAt(adress_site);
    }

    @Then("la page d accueil s ouvre et la pop-in des cookies est affichée")
    public void laPageDAccueilSOuvreEtLaPopInDesCookiesEstAffichée() {
        buttonConnexion.withTimeoutOf(10, ChronoUnit.SECONDS).waitUntilPresent();
    }

    @When("il clique sur le bouton ACCEPTER ET FERMER")
    public void ilCliqueSurLeBouton(){
        buttonAccepterCookies.withTimeoutOf(10, ChronoUnit.SECONDS).waitUntilPresent();
        buttonAccepterCookies.click();
    }

    @And("il positionne le curseur sur l item SPORTS de la page d accueil")
    public void ilPositionneLeCurseurSurLItemSPORTSDeLaPageDAccueil() {
        hoverElement(itemSports);
    }

    @Then("le menu des différents sports s affiche")
    public void leMenuDesDifférentsSportsSAffiche() {
        menuTouslessports.waitUntilPresent();
    }

    @When("il positionne le curseur sur l item VELO")
    public void ilPositionneLeCurseurSurLItemVELO() {
        menuTouslessportsVelo.isDisplayed();
    }

    @When("il clique sur l'item VTT")
    public void ilCliqueSurLItemVTT() {
        menuVTT.click();
    }

    @Then("la page du catalogue des produits VTT s affiche")
    public void laPageDuCatalogueDesProduitsVTTSAffiche() {
        pageVTT.isDisplayed();

    }

    @When("il clique sur le premier produit du catalogue")
    public void ilCliqueSurLePremierProduitDuCatalogue() {
        contenuList = referenceVTTList.getText();
        listeProduits.get(0).click();

    }

    @Then("la page du produit selectionné se charge")
    public void laPageDuProduitSelectionnéSeCharge() {

        contenuFiche = referenceVTTFiche.getText();
        Assert.assertEquals(contenuList,contenuFiche);
    }

    @When("il clique sur le champs CHOISISSEZ VOTRE TAILLE")
    public void ilCliqueSurLeChampsCHOISISSEZVOTRETAILLE() {
    }

    @Then("la menu déroulant s'affiche et contient les tailles S M et L")
    public void laMenuDéroulantSAfficheEtContientLesTaillesSMEtL() {
    }

    @When("il selectionne la taille S")
    public void ilSelectionneLaTailleS() {
    }

    @When("il clique sur le bouton AJOUTER AU PANIER")
    public void ilCliqueSurLeBoutonAJOUTERAUPANIER() {
    }

    @Then("une pop-in s affiche précisant l ajout au panier et proposant des produits complementaires")
    public void unePopInSAffichePrécisantLAjoutAuPanierEtProposantDesProduitsComplementaires() {
    }

    @When("il clique sur le bouton FINALISER MA COMMANDE")
    public void ilCliqueSurLeBoutonFINALISERMACOMMANDE() {
    }

    @Then("la page de détail du panier s affiche")
    public void laPageDeDétailDuPanierSAffiche() {
    }

    @Then("l article affiché correspond à l article selectionné")
    public void lArticleAffichéCorrespondÀLArticleSelectionné() {
    }
//-----------------------------------------------------------------------------------------------------------------------
//   SCENARIO 2

    @Given("un utilisateur sur le site {string} ayant accepté les cookies")
    public void unUtilisateurSurLeSiteAyantAcceptéLesCookies(String arg0) throws InterruptedException {
        unUtilisateurSurLeSite("https://www.intersport.fr/");
        laPageDAccueilSOuvreEtLaPopInDesCookiesEstAffichée();
        ilCliqueSurLeBouton();
    }

    @When("il clique dans la barre de recherche et saisie le mot CHAUSSURES")
    public void ilCliqueDansLaBarreDeRechercheEtSaisieLeMotCHAUSSURES() throws InterruptedException {
        search_bar.sendKeys("chaussures");
    }

    @Then("une pop-in de suggestion de recherche s affiche en-dessous")
    public void unePopInDeSuggestionDeRechercheSAfficheEnDessous() throws InterruptedException {
        suggestion_recherche.waitUntilPresent().isDisplayed();
    }

    @When("il clique dans la catégorie GARCON CHAUSSURE")
    public void ilCliqueDansLaCatégorieGARCONCHAUSSURE() {
        chaussures_garcon.waitUntilPresent().isDisplayed();
        chaussures_garcon.click();
    }

    @Then("le catalogue des chaussures garçon s affiche")
    public void leCatalogueDesChaussuresGarçonSAffiche() {
        Titre_chaussures_garcon.waitUntilPresent().isDisplayed();
    }

//-------------------------------------------------------------------------------------------------------------------
//    SCENARIO 3

    @FindBy(xpath = "//input[@id=\"prix-range_id\"]")
    WebElementFacade BtnMinMax;
    @FindBy(xpath = "//button[@id=\"btn-range_id\"]")
    WebElementFacade AcceptFiltre;
    @FindBy(xpath = "//div[@class=\"product-grid__card-container small-6 large-4\"]")
    List<WebElementFacade> listFiltreOk;

    @Given("un utilisateur ayant accepté les cookies et étant sur la page de recherche de chaussures pour garçon")
    public void unUtilisateurAyantAcceptéLesCookiesEtÉtantSurLaPageDeRechercheDeChaussuresPourGarçon() throws InterruptedException {
        unUtilisateurSurLeSiteAyantAcceptéLesCookies("https://www.intersport.fr/");
        ilCliqueDansLaBarreDeRechercheEtSaisieLeMotCHAUSSURES();
        ilCliqueDansLaCatégorieGARCONCHAUSSURE();
    }

    @When("Dans le bandeau prix de la zone filtre, il choisit un minimum de {int} et un maximum de {int} euros")
    public void dansLeBandeauPrixDeLaZoneFiltreIlChoisitUnMinimumDeEtUnMaximumDeEuros(int min, int max) {
        getJavascriptExecutorFacade().executeScript("arguments[0].className=\"irs-is_prix-range\"",BtnMinMax);
        BtnMinMax.sendKeys("15\";\"33");
    }

    @And("il clique sur le bouton valider")
    public void ilCliqueSurLeBoutonValider() {
        AcceptFiltre.click();
    }

    @Then("le catalogue affiche une liste de produits compris entre {int} et {int} euros")
    public void leCatalogueAfficheUneListeDeProduitsComprisEntreEtEuros(int arg0, int arg1) {

    }
}
