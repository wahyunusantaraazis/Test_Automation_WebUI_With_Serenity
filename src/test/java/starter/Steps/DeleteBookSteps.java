package starter.Steps;

import starter.Pages.DeleteBookPage;

public class DeleteBookSteps {

    DeleteBookPage deletebook;

    public void clickIconDelete(){
        deletebook.deleteBook();
    }

    public void clickbtnDeleteOK(){
        deletebook.btnDeleteOK();
    }
}
