package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:src/test/resources/config/credentials.properties",
        "system:properties"
})
public interface CredentialsConfig extends Config {

    String login();
    String password();
}
