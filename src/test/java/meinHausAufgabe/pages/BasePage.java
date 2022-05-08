package meinHausAufgabe.pages;

import meinHausAufgabe.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
//Tüm Testlerimizde ortak olacak method ve locate leri koy
public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
        //bu kod blogu findElement sürekli cagirmadan islem yapmamiza olanak tanir ve @FindBy kullanmamizi saglar vede WebElement in calismasini saglar
    }





}
