package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Che extends BasePO {
    @FindBy(id="com.dimcoms.checkers:id/button_play")
    private WebElement Play;
    @FindBy(id="com.dimcoms.checkers:id/button_rate")
    private WebElement MenuIngame;
    @FindBy(id="com.dimcoms.checkers:id/button_set")
    private WebElement sEttings;
    @FindBy(id="com.dimcoms.checkers:id/button_pa1")
    private WebElement whiteOption;
    @FindBy(id="com.dimcoms.checkers:id/button_set")
    private WebElement settingBackButton;
    @FindBy(id="com.dimcoms.checkers:id/button_info")
    private WebElement info;
    @FindBy(id="com.dimcoms.checkers:id/title")
    private WebElement titleInfo;
    public Che clickClickPlay() throws InterruptedException {
        Play.click();
        Thread.sleep(6000);
        return this;
    }
    public Che inGameMenuClick() throws InterruptedException {
        MenuIngame.click();
        Thread.sleep(6000);
        return this;
    }
    public Che settingsClick() throws InterruptedException {
        sEttings.click();
        Thread.sleep(6000);
        return this;
    }
    public Che whiteOptionClick() {
        whiteOption.click();
        return this;
    }

    public Che settingBackButtonClick() throws InterruptedException {
        settingBackButton.click();
        Thread.sleep(6000);
        return this;
    }
    public Che infoClick() throws InterruptedException {
        info.click();
        Thread.sleep(6000);
        return this;
    }
    public String getTitleInfo(){
       return titleInfo.getText();}
}
