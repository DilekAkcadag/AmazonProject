package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SepetPage {

    public SepetPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
        @FindBy(name = "proceedToRetailCheckout")
        public WebElement sepetteMiyim;

        @FindBy(xpath = "//*[@id=\"sw-gtc\"]")
        public WebElement sepeteGit;

        @FindBy( id = "nav-logo-sprites")
        public WebElement anasayfayaDonus;














}
