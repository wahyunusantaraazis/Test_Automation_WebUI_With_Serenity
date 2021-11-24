package starter.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class DeleteBookPage extends PageObject{

    @FindBy(xpath = "//div[@class='rt-tbody']//div[2]//div[1]//div[5]//div[1]")
    WebElement iconDelete;

    public void deleteBook(){
        iconDelete.click();
    }

    @FindBy(xpath = "//button[@id='closeSmallModal-ok']")
    WebElement deleteOK;

    public void btnDeleteOK(){
        deleteOK.click();
    }
}
