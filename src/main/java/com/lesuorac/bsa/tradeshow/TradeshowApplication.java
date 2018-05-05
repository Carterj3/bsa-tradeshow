package com.lesuorac.bsa.tradeshow;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.lesuorac.bsa.tradeshow.external.DesktopApi;

@SpringBootApplication
public class TradeshowApplication {

	@Autowired
	Environment enviroment;

	public static void main(String[] args) {
		SpringApplication.run(TradeshowApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner() {
		return args -> {
			if (DesktopApi.getOs() == DesktopApi.EnumOS.unknown) {
				// TODO: Exit
				throw new RuntimeException("Unknown OS");
			}
			try {
				DesktopApi.browse(new URI(String.format("http://localhost:%d/index.html",
						enviroment.getProperty("local.server.port", Long.class))));
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				throw new RuntimeException(e);
			}

		};
	}

}
