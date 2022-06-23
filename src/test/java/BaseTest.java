import driver.AndroidDriverSingleton;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Listeners;
import utils.CustomTestListener;

@Listeners(CustomTestListener.class)
public class BaseTest {
    @AfterSuite
    public void quitDriver(){
        AndroidDriverSingleton.quitDriver();
    }
}
