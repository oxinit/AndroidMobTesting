import businessObject.GmailBO;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.CustomTestListener;

@Listeners(CustomTestListener.class)
public class Test_Gmail extends BaseTest {
    private final GmailBO gmailBO = new GmailBO();
    private final String recipient = "dbgrid@ukr.net";
    private final String subject ="test subject";
    private final String body ="Super text body"+java.time.LocalDate.now();
    @Test
    public void isLetterSentTest() throws InterruptedException {
        gmailBO
        .sendLetter(recipient,subject,body);
        Assert.assertEquals(gmailBO.isLetterSent(),subject);
    }
}
