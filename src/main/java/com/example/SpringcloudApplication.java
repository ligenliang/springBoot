package com.example;

import com.example.filter.AccessFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class SpringcloudApplication {
	private Logger logger = LoggerFactory.getLogger(SpringcloudApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudApplication.class, args);
	}
	@Bean
	public AccessFilter accessFilter(){
		return new AccessFilter();
	}
}
