package com.devsuperior.hrconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableConfigServer
@SpringBootApplication
@RestController
@RequestMapping(value = "/config-server")
public class HrConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(HrConfigServerApplication.class, args);
    }

    @GetMapping(value = "/health")
    public ResponseEntity<String> getHealth() {
        return ResponseEntity.ok("");
    }
}
