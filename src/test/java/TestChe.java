import businessObject.GmailBO;
import businessObject.che;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners
public class TestChe extends BaseTest{
    private final che che1 = new che();
@Test
    public void newTest() throws InterruptedException {
    che1.isLetterSent();
    Assert.assertEquals(che1.titleLabel(),"AMERICAN CHECKERS");
}
}
