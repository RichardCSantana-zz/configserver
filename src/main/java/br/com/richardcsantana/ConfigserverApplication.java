package br.com.richardcsantana;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author richard.santana
 */
@SpringCloudApplication
@EnableConfigServer
public class ConfigserverApplication {

	public static void main(final String[] args) {
		SpringApplication.run(ConfigserverApplication.class, args);
	}
}
