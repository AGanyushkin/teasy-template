package com.wiley.wat.base;

import com.wiley.config.Configuration;
import com.wiley.config.CustomizableConfig;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InitConfig implements CustomizableConfig {

    @Override
    public void set() {
        String browser = System.getProperty("application.selenium.driver");
        if (browser != null && !browser.isEmpty()) {
            Configuration.browser = browser;

            if (browser.equals("gecko")) {
                //https://github.com/mozilla/geckodriver/issues/1173
                DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                desiredCapabilities.setCapability("moz:webdriverClick", false);
                Configuration.customCaps = desiredCapabilities;
            }
        }

        boolean runWithGrid = Boolean.parseBoolean(System.getProperty("run.tests.with.grid"));
        if (runWithGrid) {
            Configuration.runWithGrid = true;

            String gridHubUrl = System.getProperty("grid.hub.url");
            if (gridHubUrl != null && !gridHubUrl.isEmpty()) {
                Configuration.gridHubUrl = gridHubUrl;
            } else {
                throw new RuntimeException("Property 'grid.hub.url' null or empty");
            }
        }
    }
}
