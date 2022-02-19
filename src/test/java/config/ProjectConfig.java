package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "system:properties",
        "classpath:src/test/resources/config/local.properties"
})
public interface ProjectConfig extends Config {

    @DefaultValue("chrome")
    String browser();
    @DefaultValue("91.0")
    String browserVersion();
    @DefaultValue("1920x1080")
    String browserSize();
    String remoteDriverUrl();
}