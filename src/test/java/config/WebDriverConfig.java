package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${testLaunchType}.config"
})

public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();

    @Key("browser.name")
    @DefaultValue("chrome")

    String getBrowserName();

    @Key("browser.version")
    @DefaultValue("140")

    String getBrowserVersion();

    @Key("remoteUrl")
    String getRemoteUrl();
}
