package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Anasayfa {

    WebDriver driver;

    @FindBy( css = ".fancybox-item.fancybox-close")
    WebElement closeButtonFancyBox;

    @FindBy (xpath = "//p[text()='Giriş Yap']")
    WebElement girisYapButtonAnasayfa;

    @FindBy (id = "login-email")
    WebElement emailInput;

    @FindBy (id = "login-password-input")
    WebElement passwordInput;

    @FindBy (xpath = "//button[@type='submit']")
    WebElement girisYapButtonGirisSayfa;

    @FindBy( id = "Combined-Shape")
    WebElement closeCombinedShape;

    @FindBy(xpath = "(//a[@class='category-header'])[1]")
    WebElement categoryHeaderKadin;

    public Anasayfa(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement getCloseButtonFancyBox() {
        return closeButtonFancyBox;
    }

    public WebElement getGirisYapButtonAnasayfa() {
        return girisYapButtonAnasayfa;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getGetGirisYapButtonGirisSayfa() {
        return girisYapButtonGirisSayfa;
    }

    public WebElement getCloseCombinedShape() {
        return closeCombinedShape;
    }

    public WebElement getCategoryHeaderKadin() {
        return categoryHeaderKadin;
    }

    public void girisSayfasiSubmitButonBekle(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(girisYapButtonGirisSayfa));
    }

    public void closeCombinedButonBekle(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(closeCombinedShape));
    }
}
