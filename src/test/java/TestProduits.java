import Pages.PageAccueil;
import Pages.PageProduits;
import org.testng.annotations.Test;

public class TestProduits extends Hooks {



   String ExpectedTitre = "Produits";

    String  Login = "standard_user";
    String Mdp = "secret_sauce";
    @Test
    public void TestVerifierTitre(){

        PageProduits P = new PageProduits(driver);
        PageAccueil p = new PageAccueil(driver);
        p.taperPseudo(Login);
        p.taperMdp(Mdp);
        p.clickerBtnConnexion();
        P.ajouterBikeLight();
        P.AjouterBackPack();
    }



}
