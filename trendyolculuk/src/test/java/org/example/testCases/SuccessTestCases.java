package org.example.testCases;

import org.example.pages.Anasayfa;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SuccessTestCases {

    private Anasayfa anasayfa;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\melda\\Desktop\\Melda\\yeniDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.trendyol.com/");

        anasayfa = new Anasayfa(driver);
    }

    @Test
    public void successLogin() throws InterruptedException {
        Thread.sleep(3000);

        anasayfa.getCloseButtonFancyBox().click();
        anasayfa.getGirisYapButtonAnasayfa().click();

        anasayfa.girisSayfasiSubmitButonBekle();

        anasayfa.getEmailInput().sendKeys("meldakaralar7@gmail.com");
        anasayfa.getPasswordInput().sendKeys("test123!");
        anasayfa.getGetGirisYapButtonGirisSayfa().click();

        anasayfa.closeCombinedButonBekle();
        anasayfa.getCloseCombinedShape().click();

        Assert.assertEquals(anasayfa.getCategoryHeaderKadin().getText(),"KADIN");

    }
}
