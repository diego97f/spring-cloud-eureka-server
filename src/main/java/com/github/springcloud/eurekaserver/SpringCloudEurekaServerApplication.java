package com.github.springcloud.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Spring Cloud Eureka Server Application
 * 
 * This class serves as the entry point for the Eureka Server application.
 * The Eureka Server is a service registry that enables service discovery
 * in a microservices architecture.
 * 
 * {@code @EnableEurekaServer} enables this application to act as a Eureka Server,
 * allowing other services to register themselves and discover other services.
 * 
 * @author Diego Fernández
 * @version 1.0
 * @since 2025-04-29
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurekaServerApplication {

    /**
     * Main method that starts the Eureka Server application.
     * 
     * @param args command line arguments passed to the application
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServerApplication.class, args);
    }
}
