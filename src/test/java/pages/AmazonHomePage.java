package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonHomePage {

    public AmazonHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy (id = "sp-cc-accept")
    public WebElement homePageCerez;




}
