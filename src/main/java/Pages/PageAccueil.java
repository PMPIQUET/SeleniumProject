package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PageAccueil {

    protected WebDriver driver;

    public PageAccueil(WebDriver driver) {
        this.driver = driver;
    }

    public void taperPseudo(String Login) {
        WebElement champPseudo = driver.findElement(By.id("user-name"));
        champPseudo.sendKeys(Login);
    }

    public void taperMdp(String Mdp) {
        WebElement champMdp = driver.findElement(By.id("password"));
        champMdp.sendKeys(Mdp);
    }

    public void clickerBtnConnexion() {
        WebElement BtnConnexion = driver.findElement(By.id("login-button"));
        BtnConnexion.click();
    }

    public void VerifTextVisibility() {

        WebElement VerifText = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"));
        Assert.assertTrue(VerifText.isDisplayed(),"Le message n'est pas Affiché");
    }






}
