package cloud.autotests.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/app.properties"
})
public interface ProjectConfig extends Config {

    String browser();

    String browserVersion();

    String browserSize();

    String remoteDriverUrl();

    String videoStorage();

    String baseUrl();

    String login();

    String password();

    String selenideLogin();

    String selenidePassword();

}
