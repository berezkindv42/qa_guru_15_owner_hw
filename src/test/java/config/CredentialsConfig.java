package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:src/test/resources/config/credentials.properties"
})
public interface CredentialsConfig extends Config {

    String login();
    String password();
}
