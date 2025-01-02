package tn.itbs.projet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class MscApplication {

	public static void main(String[] args) {
		SpringApplication.run(MscApplication.class, args);
	}

}
