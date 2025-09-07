package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${testLaunchType}.config"
})

public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    String getBaseUrl();

    @Key("browser.name")
    String getBrowserName();

    @Key("browser.version")
    String getBrowserVersion();

    @Key("remoteUrl")
    String getRemoteUrl();
}
