package businessObject;

import pageObjects.Che;

public class che {
    private final Che page;

    public che() {
        this.page =new Che();
    }
    public che isLetterSent() throws InterruptedException {
        page.clickClickPlay()
                .inGameMenuClick()
                .settingsClick()
                .whiteOptionClick()
                .settingBackButtonClick()
                .clickClickPlay()
                .infoClick();
        return this;
    }
    public String titleLabel(){
      return   page.getTitleInfo();
    }
}
