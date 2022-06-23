package capabilitiesFactory;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CapabilitiesFactory {
    private static final String PLATFORM_NAME_CAPABILITY = "Android";
    private static final String DEVICE_NAME_CAPABILITY = "emulator-5554";
    private static final String UDID_CAPABILITY = "02e7d80f";
    private static final String APP_PACKAGE_CAPABILITY = "com.google.android.gm";
   // private static final String APP_ACTIVITY_CAPABILITY = "com.google.android.gm/.ConversationListActivityGmail";
    private static final String COMMAND_TIME_OUT_CAPABILITY = "60";
     private static final String APP_ACTIVITY_CAPABILITY = "com.dimcoms.checkers/.MenuActivity";

    public static DesiredCapabilities getCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME_CAPABILITY);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME_CAPABILITY);
       // capabilities.setCapability(MobileCapabilityType.UDID, UDID_CAPABILITY);
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, COMMAND_TIME_OUT_CAPABILITY);
       // capabilities.setCapability("appPackage", APP_PACKAGE_CAPABILITY);
        capabilities.setCapability("appActivity", APP_ACTIVITY_CAPABILITY);
        return capabilities;
    }

    public static URL getAppiumServerUrl() {
        try{
            return new URL ("http://localhost:4723/wd/hub");
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        return null;

    }
}

