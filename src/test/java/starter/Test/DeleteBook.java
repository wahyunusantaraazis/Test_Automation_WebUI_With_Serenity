package starter.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.DeleteBookSteps;
import starter.Steps.RegisterLoginSteps;

public class DeleteBook {

    @Steps
    RegisterLoginSteps delete;
    DeleteBookSteps icondelete;

    @Given("I am success login")
    public void iAmSuccessLogin() {
        delete.openHomePage();
        delete.openBookstorePage();
        delete.openLoginPage();
        delete.inputvalidusername();
        delete.inputvalidpassword();
        delete.openDashboard();
    }

    @When("I am delete certain book")
    public void iAmDeleteCertainBook() {

    }

    @When("click button delete")
    public void clickButtonDelete() {
        icondelete.clickIconDelete();
        icondelete.clickbtnDeleteOK();
    }

    @Then("Succes delete book")
    public void succesDeleteBook() {
    }
}
