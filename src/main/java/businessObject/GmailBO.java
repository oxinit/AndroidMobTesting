package businessObject;


import org.testng.annotations.Listeners;
import pageObjects.Page;
import utils.CustomTestListener;

@Listeners(CustomTestListener.class)
public class GmailBO {
    private final Page page;

    public GmailBO() {
        this.page =new Page();
    }
    public GmailBO skipInitialPage(){
        page.
                clickGotItBTN().
                clickTakeMeToGmailBTN();
        return this;
    }

    public GmailBO sendLetter(String recipient,String subject,String body) throws InterruptedException {
        page.clickComposeBTN()
                .clickOkSomeAgree()
                .typeRecipient(recipient)
                .typeSubject(subject)
                .typeLetter(body);

        return this;
    }
    public String isLetterSent(){

        return page.isSentLetterDisplayed();
    }
}
