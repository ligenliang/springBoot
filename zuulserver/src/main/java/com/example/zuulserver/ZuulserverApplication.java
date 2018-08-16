package com.example.zuulserver;
import com.example.zuulserver.filter.AccessFilter;
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
public class ZuulserverApplication {
    private Logger logger = LoggerFactory.getLogger(ZuulserverApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ZuulserverApplication.class, args);

    }
    @Bean
    public AccessFilter accessFilter(){
        return new AccessFilter();
    }
}
