import Pages.PageAccueil;
import org.testng.annotations.Test;


public class TestConnexion extends Hooks {
    @Test
    public void connexion(){

      String  Login = "standard_user";
      String Mdp = "abc123";

      PageAccueil Home = new PageAccueil(driver);
      Home.taperPseudo(Login);
      Home.taperMdp(Mdp);
      Home.clickerBtnConnexion();
      Home.VerifTextVisibility();



}
}
