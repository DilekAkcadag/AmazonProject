package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonHomePage;
import pages.SamsungPage;
import pages.SepetPage;
import utilities.Driver;
import utilities.Methods;


public class Amazon_Home_Page_Test {

    AmazonHomePage amazonHomePage = new AmazonHomePage();
    SamsungPage samsungPage = new SamsungPage();
    SepetPage sepetPage = new SepetPage();


    @Test
    public void AmazonTest (){

        // http://www.amazon.com sitesine gidilecek ve anasayfanın açıldığı assertion ile onaylatılacak.
        Driver.getDriver().get("http://www.amazon.com.tr");
        amazonHomePage.homePageCerez.click();

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Amazon.com"));

        // Arama kutusunda samsung aratalim
        amazonHomePage.aramaKutusu.sendKeys("samsung", Keys.ENTER);

        // Gelen sayfada samsung icin sonuc bulunduğu onaylatılacak.
        Assert.assertTrue(Driver.getDriver().getTitle().contains("samsung"));

        // Arama sonuçlarından 2. sayfaya tıklanıp ve açılan sayfada 2. sayfanin şu an gösterimde olduğu onaylatılacak.
        Methods.scroll(samsungPage.ikinciSayfaIcon);
        samsungPage.ikinciSayfaIcon.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("page=2"));


        // Üstten 5. Satır 1. Sütun içerisindeki ürüne tıklanacak.
        Methods.scroll(samsungPage.besinciUrun);
        samsungPage.besinciUrun.click();


        // Ürün sayfasında olduğumuz doğrulanacak.
        Assert.assertTrue(samsungPage.urunSayfasindaTest.isDisplayed());

        // Ürün sepete eklenir
        samsungPage.sepeteEkle.click();

        // Sepet sayfasında olduğumuz doğrulanır
        sepetPage.sepeteGit.click();
        Assert.assertTrue(sepetPage.sepetteMiyim.isDisplayed());


        // Logo’ya tıklanarak ana sayfaya geri dönüş sağlanır
        sepetPage.anasayfayaDonus.click();

        // Driver kapatilir
        Driver.closeDriver();


    }




}//class
