package com.worldwidenewsapi_wc.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WorldWideNewsApiWcApplication {


	private static final Logger log = LoggerFactory.getLogger(WorldWideNewsApiWcApplication.class);


	public static void main(String args[]) {

		SpringApplication.run(WorldWideNewsApiWcApplication.class, args);


	}

		@Bean
		public RestTemplate restTemplate(RestTemplateBuilder builder) {
			return builder.build();
		}

//		@Bean
//		public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//			return args -> {
//				TopNews topNews = restTemplate.getForObject(
//						"http://gturnquist-quoters.cfapps.io/api/random", TopNews.class);
//				log.info(topNews.toString());
//			};
//		}


//		RestTemplate restTemplate = new RestTemplate();
//		TopNews topNews = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", TopNews.class);
//		log.info(topNews.toString());
	}

//	public static void main(String[] args) {
//
//	}

