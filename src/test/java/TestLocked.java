import Pages.PageAccueil;
import org.testng.annotations.Test;

public class TestLocked  extends Hooks {

    @Test
    public void Locked(){

        String  Login = "standard_user";
        String Mdp = "locked_out_user";

        PageAccueil Home = new PageAccueil(driver);
        Home.taperPseudo(Login);
        Home.taperMdp(Mdp);
        Home.clickerBtnConnexion();
        Home.VerifTextVisibility();

    }



}
