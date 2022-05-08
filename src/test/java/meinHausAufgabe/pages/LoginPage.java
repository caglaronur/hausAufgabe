package meinHausAufgabe.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class LoginPage extends BasePage{
    @FindBy(id = "user-name")// Genel olarak hep @FindBy kullanilir
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

//    @FindBy(css = ".submit-button.btn_action")
//    public WebElement loginButton;

//    @FindAll({//veya gibi calisir bu iki locate icin elementi bul
//            @FindBy(id = "login-button"),
//            @FindBy(name = "login-button")
//    })
//    public WebElement loginButton;

    @FindBys({//ve gibi calisir bu iki locate icin elementi bul
            @FindBy(id = "login-button"),
            @FindBy(name = "login-button")
    })
    public WebElement loginButton;
}
