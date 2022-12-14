package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageProduits {

protected WebDriver driver;
    public PageProduits(WebDriver driver) {
        this.driver = driver;
    }

public void VerifTitle(){


 //  WebElement VerifTitre = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
 //  String Titre = VerifTitre.getText();
 //  System.out.println(Titre);
//   Assert.assertEquals(Titre,"PRODUCTS","Le Titre n'est pas Conforme");

}


    public void ajouterBikeLight(){

        WebElement AddBikeLight = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        AddBikeLight.click();
    }

    public void AjouterBackPack(){

    WebElement AddBackPack = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    AddBackPack.click();

}

public void VerifTitre (){



    }



}
