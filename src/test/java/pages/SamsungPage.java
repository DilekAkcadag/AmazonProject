package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SamsungPage {


    public SamsungPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy ( xpath = "(//*[@class=\"s-pagination-item s-pagination-button\"])[1]")
    public WebElement ikinciSayfaIcon;

    @FindBy (xpath = "(//*[@*='a-section aok-relative s-image-square-aspect'])[17]")
    public WebElement besinciUrun;


    @FindBy (linkText = "Sonuçlara dön")
    public WebElement urunSayfasindaTest;

    @FindBy ( css = "#add-to-cart-button")
    public WebElement sepeteEkle;







}
