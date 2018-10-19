package io.chanchal.cloud.configclient;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;



@Component
@ConfigurationProperties(prefix = "some")
public class ConfigClientAppConfiguration {

}








