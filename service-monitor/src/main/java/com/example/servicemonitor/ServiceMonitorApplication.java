package com.example.servicemonitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class ServiceMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceMonitorApplication.class, args);
    }
}
