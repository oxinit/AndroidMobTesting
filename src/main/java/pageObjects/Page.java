package pageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Page extends BasePO {
    @FindBy(id ="welcome_tour_got_it")
    private WebElement gotItBTN;
    @FindBy(id="action_done")
    private WebElement takeMeToGmailBTN;
    @FindBy(id="com.google.android.gm:id/compose_button")
    private  WebElement composeButton;
    @FindBy(id="android:id/button1")
    private WebElement okSomeButton;
    @FindBy(id="com.google.android.gm:id/to")
    private WebElement recipientField;
    @FindBy(id="com.google.android.gm:id/subject")
    private WebElement subjectField;
    @FindBy(xpath = "//android.webkit.WebView/android.widget.EditText")
    private WebElement mainTextField;

    public  Page clickComposeBTN() throws InterruptedException {
        composeButton.click();
        Thread.sleep(600);
        return this;
    }
    public Page clickOkSomeAgree() throws InterruptedException {
        okSomeButton.click();
        Thread.sleep(600);
        return this;
   }
    public Page typeRecipient(String recipient) {
        recipientField.sendKeys(recipient);
        return this;
    }
    public Page typeSubject(String subject) {
    subjectField.sendKeys(subject);
    return this;
    }
    public Page typeLetter(String body){
        mainTextField.sendKeys(body);
        return this;
    }
    public  String isSentLetterDisplayed() {
        return subjectField.getText();

    }
    public Page clickNavigationDrawerBTN() {
        return this;
    }

    public Page clickGotItBTN(){
        gotItBTN.click();
        return this;
    }
    public Page clickTakeMeToGmailBTN(){
        takeMeToGmailBTN.click();
        return this;
    }


}
