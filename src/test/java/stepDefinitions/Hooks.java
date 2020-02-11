package stepDefinitions;

import cucumber.api.java.Before;
import io.netty.handler.logging.LogLevel;
import testUI.Configuration;

import static testUI.UIOpen.open;

public class Hooks {
    @Before
    public void setUpDriver() {
        Configuration.useAllure = true;
        Configuration.testUILogLevel = LogLevel.DEBUG;
        Configuration.serverLogLevel = "all";
        Configuration.automationType = Configuration.ANDROID_PLATFORM;
        Configuration.androidAppPath = "src/test/resources/groceries-app.apk";
        open();
    }


}
