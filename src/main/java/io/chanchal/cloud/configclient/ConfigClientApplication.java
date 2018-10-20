package io.chanchal.cloud.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ConfigClientApplication {

	@Autowired
	private  ConfigClientAppConfiguration properties;

	@Value("${some.other.property}")
	String someOtherProperty ;


	@RequestMapping("/")
	public String printProperties()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(properties.getProperty());
		sb.append("||");
		sb.append(someOtherProperty);

		return sb.toString();
	}

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
}
