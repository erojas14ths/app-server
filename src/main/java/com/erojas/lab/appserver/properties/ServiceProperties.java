package com.erojas.lab.appserver.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix = "services")
public class ServiceProperties {

    /* 
     * Profile enviroment
     */
    private String profile;
}
